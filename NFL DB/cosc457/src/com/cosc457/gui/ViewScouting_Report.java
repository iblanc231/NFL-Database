package com.cosc457.gui;

import com.cosc457.data.Scouting_ReportApi;
import com.cosc457.models.Scouting_Report;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewScouting_Report extends JPanel {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane reports;

    public ViewScouting_Report(){
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Navigation.getInstance().goBack(panel1);
            }
        });
    }

    public JPanel getPanel(){
        return panel1;
    }

    public void load(){
        JPanel wrapper = new JPanel();
        StringBuilder content = new StringBuilder("<html>");

        content.append("<table>\n" +
                "  <tr>\n" +
                "    <th>Report ID</th>\n" +
                "    <th>Report Date</th>\n" +
                "    <th>Scout SSN</th>\n" +
                "    <th>Player SSN</th>\n" +
                "    <th>Rating</th>\n" +
                "    <th>Commentary</th>\n" +
                "  </tr>\n");
        for(Scouting_Report c : Scouting_ReportApi.getAllScouting_Reports()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        reports.getViewport().add(wrapper);
    }

}

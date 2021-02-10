package com.cosc457.gui;

import com.cosc457.data.Fan_DemographicsApi;
import com.cosc457.models.Fan_Demographics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewFan_Demographics extends JPanel {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane demos;

    public ViewFan_Demographics(){
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
                "    <th>Team ID</th>\n" +
                "    <th>Male Percentage</th>\n" +
                "    <th>Female Percentage</th>\n" +
                "    <th>30 and Below Percentage</th>\n" +
                "    <th>30 to 50 Percentage</th>\n" +
                "    <th>50 and Above Percentage</th>\n" +
                "    <th>White Percentage</th>\n" +
                "    <th>Black Percentage</th>\n" +
                "    <th>Other Ethnicity Percentage</th>\n" +
                "  </tr>\n");
        for(Fan_Demographics c : Fan_DemographicsApi.getAllFan_Demographicss()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        demos.getViewport().add(wrapper);
    }

}

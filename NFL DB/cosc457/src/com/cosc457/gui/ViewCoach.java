package com.cosc457.gui;

import com.cosc457.data.CoachApi;
import com.cosc457.models.Coach;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCoach {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane coaches;

    public ViewCoach(){
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
                "    <th>Coach SSN</th>\n" +
                "    <th>Coach Name</th>\n" +
                "    <th>Title</th>\n" +
                "    <th>Contract ID</th>\n" +
                "  </tr>\n");
        for(Coach c : CoachApi.getAllCoaches()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        coaches.getViewport().add(wrapper);
    }




}

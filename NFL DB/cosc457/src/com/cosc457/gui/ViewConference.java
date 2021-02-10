package com.cosc457.gui;

import com.cosc457.data.ConferenceApi;
import com.cosc457.models.Conference;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewConference {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane conferences;

    public ViewConference(){
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
                "    <th>Conference ID</th>\n" +
                "    <th>Conference Name</th>\n" +
                "  </tr>\n");
        for(Conference c : ConferenceApi.getAllConferences()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        conferences.getViewport().add(wrapper);
    }




}

package com.cosc457.gui;

import com.cosc457.data.TeamApi;
import com.cosc457.models.Team;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewTeam {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane teams;

    public ViewTeam(){
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
                "    <th>Team Name</th>\n" +
                "    <th>Team City</th>\n" +
                "    <th>Division ID</th>\n" +
                "    <th>Stadium Name</th>\n" +
                "    <th>Stadium Address</th>\n" +
                "    <th>Stadium Capacity</th>\n" +
                "  </tr>\n");
        for(Team c : TeamApi.getAllTeams()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        teams.getViewport().add(wrapper);
    }




}

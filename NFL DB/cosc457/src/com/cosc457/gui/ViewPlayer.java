package com.cosc457.gui;

import com.cosc457.data.PlayerApi;
import com.cosc457.models.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPlayer {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane players;

    public ViewPlayer(){
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
                "    <th>Player SSN</th>\n" +
                "    <th>Player Name</th>\n" +
                "    <th>Position</th>\n" +
                "    <th>Contract ID</th>\n" +
                "  </tr>\n");
        for(Player c : PlayerApi.getAllPlayers()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        players.getViewport().add(wrapper);
    }




}

package com.cosc457.gui;

import com.cosc457.data.Team_OwnerApi;
import com.cosc457.models.Team_Owner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ViewTeam_Owner extends JPanel{
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane owners;

    public ViewTeam_Owner(){
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
                "    <th>Team Owner SSN</th>\n" +
                "    <th>Team Owner Name</th>\n" +
                "    <th>Team ID</th>\n" +
                "    <th>Team Owner Net Worth (USD)</th>\n" +
                "  </tr>\n");
        for(Team_Owner c : Team_OwnerApi.getAllTeam_Owners()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        owners.getViewport().add(wrapper);
    }


}

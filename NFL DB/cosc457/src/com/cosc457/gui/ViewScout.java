package com.cosc457.gui;

import com.cosc457.data.ScoutApi;
import com.cosc457.models.Scout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewScout {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane scouts;


    public ViewScout(){
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
                "    <th>Scout SSN</th>\n" +
                "    <th>Scout Name</th>\n" +
                "    <th>Agency</th>\n" +
                "  </tr>\n");
        for(Scout c : ScoutApi.getAllScouts()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        scouts.getViewport().add(wrapper);
    }



}

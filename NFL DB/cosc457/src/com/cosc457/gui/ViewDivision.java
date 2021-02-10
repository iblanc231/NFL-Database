package com.cosc457.gui;

import com.cosc457.data.DivisionApi;
import com.cosc457.models.Division;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDivision {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane divisions;

    public ViewDivision(){
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
                "    <th>Division ID</th>\n" +
                "    <th>Division Name</th>\n" +
                "    <th>Conference ID</th>\n" +
                "  </tr>\n");
        for(Division c : DivisionApi.getAllDivisions()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        divisions.getViewport().add(wrapper);
    }




}

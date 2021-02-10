package com.cosc457.gui;

import com.cosc457.data.ContractApi;
import com.cosc457.models.Contract;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewContract {
    private JPanel panel1;
    private JButton backButton;
    private JScrollPane contracts;

    public ViewContract(){
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
                "    <th>Contract ID</th>\n" +
                "    <th>Salary</th>\n" +
                "    <th>Start Date</th>\n" +
                "    <th>End Date</th>\n" +
                "    <th>Team ID</th>\n" +
                "  </tr>\n");
        for(Contract c : ContractApi.getAllContracts()){
            content.append("<tr>\n");
            content.append(c.toTable());
            content.append("</tr>\n");
        }
        content.append("</table>");
        content.append("</html>");
        wrapper.add(new JLabel(content.toString()));
        contracts.getViewport().add(wrapper);
    }




}

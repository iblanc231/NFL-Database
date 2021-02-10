package com.cosc457.gui;

import com.cosc457.data.Fan_DemographicsApi;
import com.cosc457.models.Fan_Demographics;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteFan_Demographics extends JPanel {
    private JPanel panel1;
    private JButton deleteButton;
    private JButton backButton;
    private JTextField idTextField;

    public DeleteFan_Demographics(){
        initDeleteButton();
        deleteButton.setEnabled(false);

        idTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            private void changed()
            {
                if (idTextField.getText().equals(""))
                {
                    deleteButton.setEnabled(false);
                }
                else
                {
                    deleteButton.setEnabled(true);
                }
            }
        });

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

    private void initDeleteButton(){
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String id = "Fan Demographics for Team #" + idTextField.getText() + " have been removed from the database.";
                JOptionPane.showMessageDialog(null, id);
                Fan_DemographicsApi.deleteFan_Demographics(new Fan_Demographics(Integer.parseInt(idTextField.getText())));
            }
        });
    }
}

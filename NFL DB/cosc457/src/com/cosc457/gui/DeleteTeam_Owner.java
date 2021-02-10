package com.cosc457.gui;

import com.cosc457.data.Team_OwnerApi;
import com.cosc457.models.Team_Owner;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteTeam_Owner extends JPanel {
    private JPanel panel1;
    private JButton deleteButton;
    private JButton backButton;
    private JTextField idTextField;

    public DeleteTeam_Owner(){
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
                String id = "Team Owner " + idTextField.getText() + " has been removed from the database.";
                JOptionPane.showMessageDialog(null, id);
                Team_OwnerApi.deleteTeam_Owner(new Team_Owner(idTextField.getText()));
            }
        });
    }
}

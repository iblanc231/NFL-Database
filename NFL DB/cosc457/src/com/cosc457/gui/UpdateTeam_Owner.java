package com.cosc457.gui;

import com.cosc457.data.Team_OwnerApi;
import com.cosc457.models.Team_Owner;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateTeam_Owner {
    private JPanel panel1;
    private JButton saveButton;
    private JTextField ssnTextField;
    private JTextField nameTextField;
    private JTextField teamTextField;
    private JTextField netTextField;
    private JButton backButton;


    public UpdateTeam_Owner(){
        initSaveButton();
        saveButton.setEnabled(false);

        ssnTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || teamTextField.getText().equals("") || netTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        nameTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || teamTextField.getText().equals("") || netTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        teamTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || teamTextField.getText().equals("") || netTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        netTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || teamTextField.getText().equals("") || netTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
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

    private void initSaveButton(){
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String newOwner = nameTextField.getText() + " has been updated in the database.";
                JOptionPane.showMessageDialog(null, newOwner);
                Team_OwnerApi.updateTeam_Owner(new Team_Owner(ssnTextField.getText(),nameTextField.getText(),Integer.parseInt(teamTextField.getText()),Double.parseDouble(netTextField.getText())));
            }
        });
    }
}

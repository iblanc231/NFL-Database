package com.cosc457.gui;

import com.cosc457.data.TeamApi;
import com.cosc457.models.Team;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateTeam extends JPanel {
    private JPanel panel1;
    private JButton saveButton;
    private JTextField idTextField;
    private JTextField nameTextField;
    private JTextField cityTextField;
    private JTextField divTextField;
    private JTextField sNameTextField;
    private JTextField sAddrTextField;
    private JTextField capTextField;
    private JButton backButton;


    public UpdateTeam(){
            initSaveButton();
            saveButton.setEnabled(false);

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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        cityTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        divTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        sNameTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        capTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || nameTextField.getText().equals("") || cityTextField.getText().equals("") || divTextField.getText().equals("") || sNameTextField.getText().equals("") || capTextField.getText().equals(""))
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

        public JPanel getPanel(){ return panel1;}

        private void initSaveButton(){
            saveButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String newTeam = nameTextField.getText() + " has been updated in the database.";
                    JOptionPane.showMessageDialog(null, newTeam);
                    TeamApi.updateTeam(new Team(Integer.parseInt(idTextField.getText()), nameTextField.getText(),cityTextField.getText(),Integer.parseInt(divTextField.getText()),sNameTextField.getText(),sAddrTextField.getText(),Integer.parseInt(capTextField.getText())));
                }
            });
        }
    }

package com.cosc457.gui;

import com.cosc457.data.DivisionApi;
import com.cosc457.models.Division;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateDivision extends JPanel {
    private JPanel panel1;
    private JButton saveButton;
    private JButton backButton;
    private JTextField idTextField;
    private JTextField nameTextField;
    private JTextField confTextField;


    public UpdateDivision(){
            initSaveButton();
            saveButton.setEnabled(false);

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
                if (nameTextField.getText().equals("") || idTextField.getText().equals("")|| confTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

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
                if (nameTextField.getText().equals("") || idTextField.getText().equals("")|| confTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        confTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (nameTextField.getText().equals("") || idTextField.getText().equals("")|| confTextField.getText().equals(""))
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
                    String newDivision = nameTextField.getText() + " has been updated in the database.";
                    JOptionPane.showMessageDialog(null, newDivision);
                    DivisionApi.updateDivision(new Division(Integer.parseInt(idTextField.getText()), nameTextField.getText(), Integer.parseInt(confTextField.getText())));
                }
            });
        }
    }

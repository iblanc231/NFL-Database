package com.cosc457.gui;

import com.cosc457.data.ContractApi;
import com.cosc457.models.Contract;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateContract extends JPanel {
    private JPanel panel1;
    private JButton saveButton;
    private JButton backButton;
    private JTextField idTextField;
    private JTextField salaryTextField;
    private JTextField startTextField;
    private JTextField endTextField;
    private JTextField teamTextField;


    public UpdateContract(){
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
                if (idTextField.getText().equals("") || salaryTextField.getText().equals("") || startTextField.getText().equals("") || endTextField.getText().equals("") || teamTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        salaryTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || salaryTextField.getText().equals("") || startTextField.getText().equals("") || endTextField.getText().equals("") || teamTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        startTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || salaryTextField.getText().equals("") || startTextField.getText().equals("") || endTextField.getText().equals("") || teamTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        endTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || salaryTextField.getText().equals("") || startTextField.getText().equals("") || endTextField.getText().equals("") || teamTextField.getText().equals(""))
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
                if (idTextField.getText().equals("") || salaryTextField.getText().equals("") || startTextField.getText().equals("") || endTextField.getText().equals("") || teamTextField.getText().equals(""))
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
                    String newContract = "Contract ID #" + idTextField.getText() + " has been updated in the database.";
                    JOptionPane.showMessageDialog(null, newContract);
                    ContractApi.updateContract(new Contract(Integer.parseInt(idTextField.getText()), Double.parseDouble(salaryTextField.getText()), startTextField.getText(), endTextField.getText(), Integer.parseInt(teamTextField.getText())));
                }
            });
        }
    }

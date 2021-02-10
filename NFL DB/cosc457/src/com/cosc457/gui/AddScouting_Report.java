package com.cosc457.gui;

import com.cosc457.data.Scouting_ReportApi;
import com.cosc457.models.Scouting_Report;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddScouting_Report extends JPanel{
    private JPanel panel1;
    private JButton saveButton;
    private JButton backButton;
    private JTextField idTextField;
    private JTextField dateTextField;
    private JTextField scoutSSNTextField;
    private JTextField pSSNTextField;
    private JTextField ratingTextField;
    private JTextField commTextField;


    public AddScouting_Report(){
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
                if (idTextField.getText().equals("") || dateTextField.getText().equals("") || scoutSSNTextField.getText().equals("") || pSSNTextField.getText().equals("") || ratingTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        dateTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || dateTextField.getText().equals("") || scoutSSNTextField.getText().equals("") || pSSNTextField.getText().equals("") || ratingTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        scoutSSNTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || dateTextField.getText().equals("") || scoutSSNTextField.getText().equals("") || pSSNTextField.getText().equals("") || ratingTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        pSSNTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || dateTextField.getText().equals("") || scoutSSNTextField.getText().equals("") || pSSNTextField.getText().equals("") || ratingTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        ratingTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || dateTextField.getText().equals("") || scoutSSNTextField.getText().equals("") || pSSNTextField.getText().equals("") || ratingTextField.getText().equals(""))
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
                    String newReport = "Report ID Number " + idTextField.getText() + " has been added to the database.";
                    JOptionPane.showMessageDialog(null, newReport);
                    Scouting_ReportApi.saveScouting_Report(new Scouting_Report(Integer.parseInt(idTextField.getText()),dateTextField.getText(), scoutSSNTextField.getText(), pSSNTextField.getText(), Integer.parseInt(ratingTextField.getText()),commTextField.getText()));
            }
        });
    }
}

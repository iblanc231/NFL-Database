package com.cosc457.gui;

import com.cosc457.data.CoachApi;
import com.cosc457.models.Coach;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCoach extends JPanel{
    private JPanel panel1;
    private JTextField nameTextField;
    private JTextField titleTextField;
    private JTextField ssnTextField;
    private JTextField contractIDTextField;
    private JButton saveButton;
    private JButton backButton;


    public AddCoach(){
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || contractIDTextField.getText().equals(""))
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || contractIDTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        contractIDTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || contractIDTextField.getText().equals(""))
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
                    String newCoachCreated = nameTextField.getText() + " has been added to the database.";
                    JOptionPane.showMessageDialog(null, newCoachCreated);
                    CoachApi.saveCoach(new Coach(ssnTextField.getText(), nameTextField.getText(), titleTextField.getText(), Integer.parseInt(contractIDTextField.getText())));
            }
        });
    }
}

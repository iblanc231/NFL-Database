package com.cosc457.gui;

import com.cosc457.data.PlayerApi;
import com.cosc457.models.Player;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPlayer extends JPanel{
    private JPanel panel1;
    private JButton saveButton;
    private JButton backButton;
    private JTextField ssnTextField;
    private JTextField nameTextField;
    private JTextField posTextField;
    private JTextField conTextField;


    public AddPlayer(){
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || conTextField.getText().equals(""))
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || conTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        conTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (ssnTextField.getText().equals("") || nameTextField.getText().equals("") || conTextField.getText().equals(""))
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
                String newPlayer = nameTextField.getText() + " has been added to the database.";
                JOptionPane.showMessageDialog(null, newPlayer);
                PlayerApi.savePlayer(new Player(ssnTextField.getText(), nameTextField.getText(), posTextField.getText(), Integer.parseInt(conTextField.getText())));
            }
        });
    }
}

package com.cosc457.gui;

import com.cosc457.data.Fan_DemographicsApi;
import com.cosc457.models.Fan_Demographics;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddFan_Demographics extends JPanel {
    private JPanel panel1;
    private JButton saveButton;
    private JButton backButton;
    private JTextField idTextField;
    private JTextField maleTextField;
    private JTextField whiteTextField;
    private JTextField fiftyPlusTextField;
    private JTextField sub30TextField;
    private JTextField thirtyToFiftyTextField;
    private JTextField femaleTextField;
    private JTextField otherTextField;
    private JTextField blackTextField;


    public AddFan_Demographics(){
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        maleTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        femaleTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        sub30TextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        thirtyToFiftyTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        fiftyPlusTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        whiteTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        blackTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
                {
                    saveButton.setEnabled(false);
                }
                else
                {
                    saveButton.setEnabled(true);
                }
            }
        });

        otherTextField.getDocument().addDocumentListener(new DocumentListener() {
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
                if (idTextField.getText().equals("") || maleTextField.getText().equals("") || femaleTextField.getText().equals("") || sub30TextField.getText().equals("") || thirtyToFiftyTextField.getText().equals("") || fiftyPlusTextField.getText().equals("") || whiteTextField.getText().equals("") || blackTextField.getText().equals("") || otherTextField.getText().equals(""))
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
                String newDemos = "Demographics for Team ID No. " + idTextField.getText() + " have been added to the database.";
                JOptionPane.showMessageDialog(null, newDemos);
                Fan_DemographicsApi.saveFan_Demographics(new Fan_Demographics(Integer.parseInt(idTextField.getText()),Double.parseDouble(maleTextField.getText()),Double.parseDouble(femaleTextField.getText()),Double.parseDouble(sub30TextField.getText()),Double.parseDouble(thirtyToFiftyTextField.getText()),Double.parseDouble(fiftyPlusTextField.getText()),Double.parseDouble(whiteTextField.getText()),Double.parseDouble(blackTextField.getText()),Double.parseDouble(otherTextField.getText())));
            }
        });
    }
}

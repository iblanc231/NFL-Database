package com.cosc457.gui;

import com.cosc457.data.DivisionApi;
import com.cosc457.models.Division;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteDivision extends JPanel {
    private JPanel panel1;
    private JButton deleteButton;
    private JButton backButton;
    private JTextField idTextField;

    public DeleteDivision(){
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
                String id = "Division ID number " + idTextField.getText() + " has been removed from the database.";
                JOptionPane.showMessageDialog(null, id);
                DivisionApi.deleteDivision(new Division(Integer.parseInt(idTextField.getText())));
            }
        });
    }
}

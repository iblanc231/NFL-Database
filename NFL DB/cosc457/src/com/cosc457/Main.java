package com.cosc457;

import com.cosc457.data.Database;
import com.cosc457.gui.Navigation;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        Database.getInstance().connect();
        Database.getInstance().initializeDatabase();
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("NFL Database Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = Navigation.getInstance();
        newContentPane.setPreferredSize(new Dimension(740, 980));
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);


        frame.pack();
        frame.setVisible(true);
    }

}

package com.cosc457.data;

import com.cosc457.models.Conference;


import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class ConferenceApi {
    private static Database database = Database.getInstance();

    public static void saveConference(Conference c){
        String values = "'" + c.getConfID() + "', '" + c.getConfName() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO CONFERENCE(Conf_ID, Conf_name) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }

    public static void updateConference(Conference c){
        String query = String.format("UPDATE CONFERENCE SET Conf_Name = '%s'  WHERE Conf_ID = '%s'; ", c.getConfName(), c.getConfID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteConference(Conference c){
        int id = c.getConfID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM CONFERENCE WHERE Conf_ID ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }

    public static ArrayList<Conference> getAllConferences(){
        ArrayList<Conference> result = new ArrayList<Conference>();
        String query = "SELECT * FROM CONFERENCE";
        try {
            for(Object o : database.retrieve(query, Conference.class)){
                result.add((Conference)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

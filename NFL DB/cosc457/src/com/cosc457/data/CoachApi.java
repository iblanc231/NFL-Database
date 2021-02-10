package com.cosc457.data;

import com.cosc457.models.Coach;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoachApi {
    private static Database database = Database.getInstance();

    public static void saveCoach(Coach c){
        String values = "'" + c.getSSN() + "', '" + c.getName() + "', '" + c.getTitle() + "', '" + c.getContractID() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO COACH (C_ssn, C_name, Title, Contract_ID) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }

    public static void updateCoach(Coach c){
        String query = String.format("UPDATE COACH SET C_name = '%s' , Title = '%s' , Contract_ID = '%s'  WHERE C_ssn = '%s'; ", c.getName(), c.getTitle(), c.getContractID(), c.getSSN());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }

    public static void deleteCoachViaSSN(Coach s){
        String ssn = s.getSSN();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM COACH WHERE SSN = '"+ssn+"';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }

    public static ArrayList<Coach> getAllCoaches(){
        ArrayList<Coach> result = new ArrayList<Coach>();
        String query = "SELECT * FROM COACH";
        try {
            for(Object o : database.retrieve(query, Coach.class)){
                result.add((Coach)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

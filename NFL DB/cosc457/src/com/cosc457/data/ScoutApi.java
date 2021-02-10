package com.cosc457.data;

import com.cosc457.models.Scout;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ScoutApi {
    private static Database database = Database.getInstance();

    public static void saveScout(Scout s){
        String values ="'" + s.getSsn() + "', '" + s.getName() + "', '" + s.getAgency() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO SCOUT (Sc_ssn, Sc_name, Agency) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }

    public static void updateScout(Scout c){
        String query = String.format("UPDATE SCOUT SET Sc_name = '%s' , Agency = '%s' WHERE `Employee ID` = '%s'; ", c.getName(), c.getAgency(), c.getSsn());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteScout(Scout s){
        String ssn = s.getSsn();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM SCOUT WHERE `Sc_ssn` ='" + ssn + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }

    public static ArrayList<Scout> getAllScouts(){
        ArrayList<Scout> result = new ArrayList<Scout>();
        String query = "SELECT * FROM SCOUT";
        try {
            for(Object o : database.retrieve(query, Scout.class)){
               result.add((Scout)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

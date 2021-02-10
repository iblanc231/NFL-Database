package com.cosc457.data;

import com.cosc457.models.Division;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class DivisionApi {
    private static Database database = Database.getInstance();

    public static void saveDivision(Division c){
        String values = "'" + c.getDivID() + "', '" + c.getDivName()+"', '"+c.getConfID() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO DIVISION (Div_ID, Div_name, Conf_ID) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteDivision(Division c){
        int id = c.getDivID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM DIVISION WHERE Div_ID ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateDivision(Division c){
        String query = String.format("UPDATE DIVISION SET Div_name = '%s' , Conf_ID = '%s' WHERE Div_ID = '%s'; ", c.getDivName(), c.getConfID(), c.getDivID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Division> getAllDivisions(){
        ArrayList<Division> result = new ArrayList<Division>();
        String query = "SELECT * FROM DIVISION";
        try {
            for(Object o : database.retrieve(query, Division.class)){
                result.add((Division) o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

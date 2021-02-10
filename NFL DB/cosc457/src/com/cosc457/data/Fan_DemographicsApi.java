package com.cosc457.data;

import com.cosc457.models.Fan_Demographics;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class Fan_DemographicsApi {
    private static Database database = Database.getInstance();

    public static void saveFan_Demographics(Fan_Demographics c){
        String values = "'" + c.getTeamID() + "', '" + c.getMale() + "', '" + c.getFemale() + "', '" + c.getSub30() + "', '" + c.getThirtyTo50() + "', '" + c.getFiftyPlus() + "', '" + c.getWhite() + "', '" + c.getBlack() + "', '" + c.getOther() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO FAN_DEMOGRAPHICS(T_ID, Male, Female, Sub_30, Thirty_to_50, Fifty_plus, White, Black, Other) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteFan_Demographics(Fan_Demographics c){
        int id = c.getTeamID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM FAN_DEMOGRAPHICS WHERE T_ID ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateFan_Demographics(Fan_Demographics c){
        String query = String.format("UPDATE FAN_DEMOGRAPHICS SET Male = '%s' , Female = '%s' , Sub_30 = '%s' , Thirty_to_50 = '%s' , Fifty_plus = '%s' , White = '%s' , Black = '%s' , Other = '%s' WHERE T_ID = '%s'; ", c.getMale(), c.getFemale(), c.getSub30(), c.getThirtyTo50(), c.getFiftyPlus(), c.getWhite(), c.getBlack(), c.getOther(), c.getTeamID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Fan_Demographics> getAllFan_Demographicss(){
        ArrayList<Fan_Demographics> result = new ArrayList<Fan_Demographics>();
        String query = "SELECT * FROM FAN_DEMOGRAPHICS";
        try {
            for(Object o : database.retrieve(query, Fan_Demographics.class)){
                result.add((Fan_Demographics)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

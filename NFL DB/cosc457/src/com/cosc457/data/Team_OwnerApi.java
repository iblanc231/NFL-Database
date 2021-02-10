package com.cosc457.data;

import com.cosc457.models.Team_Owner;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Team_OwnerApi {
    private static Database database = Database.getInstance();

    public static void saveTeam_Owner(Team_Owner c){
        String values = "'" + c.getSSN() + "', '" + c.getName() + "', '" + c.getTeamID() + "', '" + c.getNetWorth() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TEAM_OWNER (O_ssn, O_name, T_ID, Net_worth) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteTeam_Owner(Team_Owner c){
        String s = c.getSSN();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM TEAM_OWNER WHERE O_ssn ='" + s + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateTeam_Owner(Team_Owner c){
        String query = String.format("UPDATE TEAM_OWNER SET O_name = '%s' , T_ID = '%s' , Net_worth = '%s' WHERE O_ssn = '%s'; ", c.getName(), c.getTeamID(), c.getNetWorth(), c.getSSN());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Team_Owner> getAllTeam_Owners(){
        ArrayList<Team_Owner> result = new ArrayList<Team_Owner>();
        String query = "SELECT * FROM TEAM_OWNER";
        try {
            for(Object o : database.retrieve(query, Team_Owner.class)){
                result.add((Team_Owner)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

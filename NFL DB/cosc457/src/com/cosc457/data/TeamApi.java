package com.cosc457.data;

import com.cosc457.models.Team;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeamApi {
    private static Database database = Database.getInstance();

    public static void saveTeam(Team c){
        String values = "'" + c.getTeamID() + "', '" + c.getTeamName() + "', '" + c.getTeamCity() + "', '" + c.getDivID() + "', '" + c.getStadiumName() + "', '" + c.getStadiumAddress() + "', '" + c.getStadiumCapacity() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO TEAM (T_ID, T_name, T_city, Div_ID, Stad_name, Stad_address, Stad_capacity) VALUES("+values+");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteTeam(Team c){
        int id = c.getTeamID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM TEAM WHERE T_ID ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateTeam(Team c){
        String query = String.format("UPDATE TEAM SET T_name = '%s' , T_city = '%s' , Div_ID = '%s' , Stad_name = '%s' , Stad_address = '%s' , Stad_capacity = '%s' WHERE T_ID = '%s'; ", c.getTeamName(), c.getTeamCity(), c.getDivID(), c.getStadiumName(), c.getStadiumAddress(), c.getStadiumCapacity(), c.getTeamID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Team> getAllTeams(){
        ArrayList<Team> result = new ArrayList<Team>();
        String query = "SELECT * FROM TEAM";
        try {
            for(Object o : database.retrieve(query, Team.class)){
                result.add((Team)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

package com.cosc457.data;

import com.cosc457.models.Player;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerApi {
    private static Database database = Database.getInstance();

    public static void savePlayer(Player s){
        String values = "'" + s.getSsn() + "', '" + s.getName() + "', '" + s.getPosition() + "', '" + s.getContractID() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO PLAYER (P_ssn, P_name, Position, Contract_ID) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }
    public static void updatePlayer(Player c){
        String query = String.format("UPDATE PLAYER SET P_name = '%s', Position = '%s', Contract_ID = '%s' WHERE P_ssn = '%s'; ", c.getName(), c.getPosition(), c.getContractID(), c.getSsn());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }

    public static void deletePlayer(Player s){
        String ssn = s.getSsn();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM PLAYER WHERE P_ssn ='"+ ssn +"';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }

    public static ArrayList<Player> getAllPlayers(){
        ArrayList<Player> result = new ArrayList<Player>();
        String query = "SELECT * FROM PLAYER";
        try {
            for(Object o : database.retrieve(query, Player.class)){
                result.add((Player)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

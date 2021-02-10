package com.cosc457.data;

import com.cosc457.models.Scouting_Report;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Scouting_ReportApi {
    private static Database database = Database.getInstance();

    public static void saveScouting_Report(Scouting_Report c){
        String values = "'" + c.getReportID() + "', '" + c.getReportDate() + "', '" + c.getScoutSsn() + "', '" + c.getPlayerSsn() + "', '" + c.getRating() + "', '" + c.getCommentary() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO SCOUT_REPORT(Report_ID, Report_date, Sc_ssn, P_ssn, Rating, Commentary) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteScouting_Report(Scouting_Report c){
        int id = c.getReportID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM SCOUT_REPORT WHERE Address ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateScouting_Report(Scouting_Report c){
        String query = String.format("UPDATE SCOUT_REPORT SET Report_date = '%s' , Sc_ssn = '%s' , P_ssn = '%s' , Rating = '%s' , Commentary = '%s' WHERE Report_ID = '%s'; ", c.getReportDate(), c.getScoutSsn(), c.getPlayerSsn(), c.getRating(), c.getCommentary(), c.getReportID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Scouting_Report> getAllScouting_Reports(){
        ArrayList<Scouting_Report> result = new ArrayList<Scouting_Report>();
        String query = "SELECT * FROM SCOUT_REPORT";
        try {
            for(Object o : database.retrieve(query, Scouting_Report.class)){
                result.add((Scouting_Report)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

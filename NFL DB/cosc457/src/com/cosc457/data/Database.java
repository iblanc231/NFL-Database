package com.cosc457.data;

import com.cosc457.models.*;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static Database INSTANCE;
    private Connection connection;

    private Database(){

    }

    public static Database getInstance(){
       if(INSTANCE == null){
           INSTANCE = new Database();
       }
        return INSTANCE;
    }

    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3360/?user=iblanc1", "iblanc1", "Cosc*pfbm");
            connection = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/iblanc1db", "iblanc1", "Cosc*pfbm");
            connection.setSchema("iblanc1db");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void initializeDatabase() throws SQLException {
        Statement stmt=connection.createStatement();
        stmt.execute("use iblanc1db");
    }

    public void insert(String query) throws SQLException{
        System.out.println(query);
        Statement stmt = connection.createStatement();
        stmt.execute(query);
    }

    public ArrayList<Object> retrieve(String query, Class<?> type) throws SQLException{
        ArrayList<Object> results = new ArrayList<Object>();

        Statement stmt = connection.createStatement();
        ResultSet set = stmt.executeQuery(query);
        while(set.next()){
            if(type.equals(Coach.class))
            {
                results.add(parseCoach(set));
            } else if(type.equals(Conference.class))
            {
                results.add(parseConference(set));
            } else if(type.equals(Contract.class))
            {
                results.add(parseContract(set));
            } else if(type.equals(Division.class))
            {
                results.add(parseDivision(set));
            } else if(type.equals(Fan_Demographics.class))
            {
                results.add(parseFan_Demographics(set));
            } else if(type.equals(Player.class))
            {
                results.add(parsePlayer(set));
            } else if(type.equals(Scout.class))
            {
                results.add(parseScout(set));
            } else if(type.equals(Scouting_Report.class))
            {
                results.add(parseScouting_Report(set));
            } else if(type.equals(Team_Owner.class))
            {
                results.add(parseTeam_Owner(set));
            } else if(type.equals(Team.class))
            {
                results.add(parseTeam(set));
            }

        }
        return results;
    }


    private Coach parseCoach(ResultSet set) throws SQLException {
        return new Coach(set.getString("C_ssn"),set.getString("C_name"),set.getString("Title"),set.getInt("Contract_ID"));
    }
    private Conference parseConference(ResultSet set) throws SQLException{
        return new Conference(set.getInt("Conf_ID"),set.getString("Conf_name"));
    }
    private Contract parseContract(ResultSet set) throws SQLException{
        return new Contract(set.getInt("Contract_ID"),set.getDouble("Salary"),set.getString("Start_date"),set.getString("End_date"),set.getInt("T_ID"));
    }
    private Division parseDivision(ResultSet set) throws SQLException{
        return new Division(set.getInt("Div_ID"), set.getString("Div_name"), set.getInt("Conf_ID"));
    }
    private Fan_Demographics parseFan_Demographics(ResultSet set) throws SQLException{
        return new Fan_Demographics(set.getInt("T_ID"),set.getDouble("Male"),set.getDouble("Female"),set.getDouble("Sub_30"), set.getDouble("Thirty_to_50"),set.getDouble("Fifty_plus"), set.getDouble("White"),set.getDouble("Black"),set.getDouble("Other"));
    }
    private Player parsePlayer(ResultSet set) throws SQLException{
        return new Player(set.getString("P_ssn"),set.getString("P_name"),set.getString("Position"),set.getInt("Contract_ID"));
    }
    private Scout parseScout(ResultSet set) throws SQLException{
        return new Scout(set.getString("Sc_ssn"),set.getString("Sc_name"),set.getString("Agency"));
    }
    private Scouting_Report parseScouting_Report(ResultSet set) throws SQLException{
        return new Scouting_Report(set.getInt("Report_ID"), set.getString("Report_date"), set.getString("Sc_ssn"), set.getString("P_ssn"), set.getInt("Rating"),set.getString("Commentary"));
    }
    private Team_Owner parseTeam_Owner(ResultSet set) throws SQLException{
        return new Team_Owner(set.getString("O_ssn"), set.getString("O_name"), set.getInt("T_ID"), set.getDouble("Net_worth"));
    }
    private Team parseTeam(ResultSet set) throws SQLException{
        return new Team(set.getInt("T_ID"),set.getString("T_name"), set.getString("T_city"), set.getInt("Div_ID"), set.getString("Stad_name"), set.getString("Stad_address"), set.getInt("Stad_capacity"));
    }
}

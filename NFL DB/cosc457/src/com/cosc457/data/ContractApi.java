package com.cosc457.data;

import com.cosc457.models.Contract;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;

public class ContractApi {
    private static Database database = Database.getInstance();

    public static void saveContract(Contract c){
        String values = "'" + c.getContractID() + "', '" + c.getSalary() + "', '" + c.getStartDate() + "', '" + c.getEndDate() + "', '" + c.getTeamID() + "'";
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO CONTRACT (Contract_ID, Salary, Start_date, End_date, T_ID) VALUES(" + values + ");");
        try {
            database.insert(query.toString());
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static void deleteContract(Contract c){
        int id = c.getContractID();
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM CONTRACT WHERE Contract_ID ='" + id + "';");
        try {
            database.insert(query.toString());
        } catch (SQLException e2) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e2.printStackTrace();
        }
    }
    public static void updateContract(Contract c){
        String query = String.format("UPDATE CONTRACT SET Salary = '%s' , Start_date = '%s' , End_date = '%s' , T_ID = '%s' WHERE Contract_ID = '%s'; ", c.getSalary(), c.getStartDate(), c.getEndDate(), c.getTeamID(), c.getContractID());
        try {
            database.insert(query);
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e1.printStackTrace();
        }
    }


    public static ArrayList<Contract> getAllContracts(){
        ArrayList<Contract> result = new ArrayList<Contract>();
        String query = "SELECT * FROM CONTRACT";
        try {
            for(Object o : database.retrieve(query, Contract.class)){
                result.add((Contract)o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error. Please recheck ID/SSN values.","Error", JOptionPane.INFORMATION_MESSAGE);
            //e.printStackTrace();
        }

        return result;
    }
}

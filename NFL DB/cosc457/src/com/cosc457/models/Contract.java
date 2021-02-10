package com.cosc457.models;

public class Contract {
    private int contractID;
    private double salary;
    private String startDate;
    private String endDate;
    private int teamID;

    public Contract(int contractID, double salary, String startDate, String endDate, int teamID) {
        this.contractID = contractID;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teamID = teamID;
    }

    public Contract(int contractID) {
        this.contractID = contractID;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int capacity) {
        this.contractID = contractID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) { this.salary = salary; }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    @Override
    public String toString() {
        return  "Contract ID: " + contractID +
                " Salary: " + salary +
                " Start Date: " + startDate +
                " End Date: " + endDate +
                " Team ID: " + teamID;
    }

    public String toTable() {
        return ("    <td>" + contractID + "</td>\n" +
                "    <td>" + salary + "</td>\n" +
                "    <td>" + startDate + "</td>\n" +
                "    <td>" + endDate + "</td>\n" +
                "    <td>" + teamID + "</td>\n");
    }
}

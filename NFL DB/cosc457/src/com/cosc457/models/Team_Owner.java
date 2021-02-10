package com.cosc457.models;

public class Team_Owner {
    private String ssn;
    private String name;
    private int teamID;
    private double networth;

    public Team_Owner(String ssn, String name, int teamID, double networth) {
        this.ssn = ssn;
        this.name = name;
        this.teamID = teamID;
        this.networth = networth;
    }

    public Team_Owner(String ssn) {
        this.ssn = ssn;
    }

    public String getSSN() {
        return ssn;
    }

    public void setID(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public double getNetWorth() {
        return networth;
    }

    public void setNetWorth(double networth) {
        this.networth = networth;
    }


    @Override
    public String toString() {
        return  "Team Owner SSN: " + ssn +
                " Team Owner Name: " + name +
                " Team ID: " + teamID +
                " Net Worth: " + networth;
    }

    public String toTable() {
        return ("    <td>" + ssn + "</td>\n" +
                "    <td>" + name + "</td>\n" +
                "    <td>" + teamID + "</td>\n" +
                "    <td>" + networth + "</td>\n");
    }
}








                       












 


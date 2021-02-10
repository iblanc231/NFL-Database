package com.cosc457.models;

public class Team {
    private int teamID;
    private String city;
    private String name;
    private int divID;
    private String stadName;
    private String stadAddr;
    private int stadCap;

    public Team(int teamID, String city, String name, int divID, String stadName, String stadAddr, int stadCap) {
        this.teamID = teamID;
        this.city = city;
        this.name = name;
        this.divID = divID;
        this.stadName = stadName;
        this.stadAddr = stadAddr;
        this.stadCap = stadCap;
    }

    public Team(int teamID) {
        this.teamID = teamID;
    }

    public int getTeamID() { return teamID; }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamCity() {
        return city;
    }

    public void setTeamCity(String city) {
        this.city = city;
    }

    public String getTeamName() {
        return name;
    }

    public void setTeamName(String name) {
        this.name = name;
    }

    public int getDivID() {
        return divID;
    }

    public void setDivID(int divID) {
        this.divID = divID;
    }

    public String getStadiumName() {
        return stadName;
    }

    public void setStadiumName(String stadName) {
        this.stadName = stadName;
    }

    public String getStadiumAddress() {
        return stadAddr;
    }

    public void setStadiumAddress(String stadAddr) {
        this.stadAddr = stadAddr;
    }

    public int getStadiumCapacity() {
        return stadCap;
    }

    public void setStadiumCapacity (int stadCap) {
        this.stadCap = stadCap;
    }

    @Override
    public String toString() {
        return  "Team ID: " + teamID +
                " Team Name: " + name +
                " Team City: " + city +
                " Division ID: " + divID +
                " Stadium Name: " + stadName +
                " Stadium Address: " + stadAddr +
                " Stadium Capacity: " + stadCap;
    }

    public String toTable() {
        return ("    <td>" + teamID + "</td>\n" +
                "    <td>" + name + "</td>\n" +
                "    <td>" + city + "</td>\n" +
                "    <td>" + divID + "</td>\n" +
                "    <td>" + stadName + "</td>\n" +
                "    <td>" + stadAddr + "</td>\n" +
                "    <td>" + stadCap + "</td>\n");
    }
}

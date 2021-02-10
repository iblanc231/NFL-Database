package com.cosc457.models;

public class Division {
    private int divID;
    private String divName;
    private int confID;

    public Division(int divID, String divName, int confID) {
        this.divID = divID;
        this.divName = divName;
        this.confID = confID;
    }

    public Division(int divID) {
        this.divID = divID;
    }

    public int getDivID() { return divID; }

    public void setDivID(int divID) {
        this.divID = divID;
    }

    public String getDivName() {
        return divName;
    }

    public void setDivName(String divName) {
        this.divName = divName;
    }

    public int getConfID() {
        return confID;
    }

    public void setConfID(int confID) {
        this.confID = confID;
    }

    @Override
    public String toString() {
        return  "Division ID: " + divID +
                " Division Name: " + divName +
                " Conference ID: " + confID;
    }

    public String toTable() {
        return ("    <td>" + divID + "</td>\n" +
                "    <td>" + divName + "</td>\n" +
                "    <td>" + confID + "</td>\n");
    }
}

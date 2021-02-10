package com.cosc457.models;

public class Conference {
    private int confID;
    private String confName;


    @Override
    public String toString() {
        return  "Conference ID: " + confID +
                " Conference Name: " + confName;
    }

    public Conference(int confID, String confName) {
        this.confID = confID;
        this.confName = confName;
    }
    public Conference(int confID) {
        this.confID = confID;
    }

    public int getConfID() {
        return confID;
    }

    public void setConfID(int confID) {
        this.confID = confID;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String toTable() {
        return ("    <td>" + confID + "</td>\n" +
                "    <td>" + confName + "</td>\n");
    }
}

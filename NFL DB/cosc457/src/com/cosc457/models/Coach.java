package com.cosc457.models;

public class Coach {
    private String ssn;
    private String name;
    private String title;
    private int contractID;

    public Coach(String ssn, String name, String title, int contractID) {
        this.ssn = ssn;
        this.name = name;
        this.title = title;
        this.contractID = contractID;
    }

    public Coach(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return  "Coach SSN: " + ssn +
                " Coach Name: " + name +
                " Title: " + title +
                " Contract ID: " + contractID;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String SSN) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String toTable() {
        return ("    <td>" + ssn + "</td>\n" +
                "    <td>" + name + "</td>\n" +
                "    <td>" + title + "</td>\n" +
                "    <td>" + contractID + "</td>\n");
    }
}

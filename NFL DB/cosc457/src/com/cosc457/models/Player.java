package com.cosc457.models;

public class Player {
    private String ssn;
    private String name;
    private String position;
    private int contractID;

    public Player(String ssn, String name, String position, int contractID) {
        this.ssn = ssn;
        this.name = name;
        this.position = position;
        this.contractID = contractID;
    }

    public Player(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() { return ssn; }

    public void setSsn(String ssn) { this.ssn = ssn; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    @Override
    public String toString() {
        return  "Player SSN: " + contractID +
                " Player Name: " + name +
                " Position: " + position +
                " Contract ID: " + contractID;
    }

    public String toTable() {
        return ("    <td>" + ssn + "</td>\n" +
                "    <td>" + name + "</td>\n" +
                "    <td>" + position + "</td>\n" +
                "    <td>" + contractID + "</td>\n");
    }
}

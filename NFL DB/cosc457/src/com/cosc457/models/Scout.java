package com.cosc457.models;

public class Scout {
    private String ssn;
    private String name;
    private String agency;

    public Scout(String ssn, String name, String agency) {
        this.ssn = ssn;
        this.name = name;
        this.agency = agency;
    }

    public Scout(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() { return ssn; }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return  "Scout SSN: " + ssn +
                " Scout Name: " + name +
                " Agency: " + agency;
    }

    public String toTable() {
        return ("    <td>" + ssn + "</td>\n" +
                "    <td>" + name + "</td>\n" +
                "    <td>" + agency + "</td>\n");
    }
}

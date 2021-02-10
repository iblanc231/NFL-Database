package com.cosc457.models;

public class Fan_Demographics {
    private int teamID;
    private double male;
    private double female;
    private double sub30;;
    private double thirtyTo50;
    private double fiftyPlus;
    private double white;
    private double black;
    private double other;

    public Fan_Demographics(int teamID) {
        this.teamID = teamID;
    }

    public Fan_Demographics(int teamID, double male, double female, double sub30, double thirtyTo50, double fiftyPlus, double white, double black, double other) {
        this.teamID = teamID;
        this.male = male;
        this.female = female;
        this.sub30 = sub30;
        this.thirtyTo50 = thirtyTo50;
        this.fiftyPlus = fiftyPlus;
        this.white = white;
        this.black = black;
        this.other = other;
    }
//
    @Override
    public String toString() {
        return  "Team ID: " + teamID +
                " Male Pct: " + male +
                " Female Pct: " + female +
                " Sub-30 Pct: " + sub30 +
                " 30-50 Pct: " + thirtyTo50 +
                " 50+ Pct: " + fiftyPlus +
                " White Pct: " + white +
                " Black Pct: " + black +
                " Other Pct: " + other;
    }
    public String toTable() {
        return ("    <td>" + teamID + "</td>\n" +
                "    <td>" + male + "</td>\n" +
                "    <td>" + female + "</td>\n" +
                "    <td>" + sub30 + "</td>\n" +
                "    <td>" + thirtyTo50 + "</td>\n" +
                "    <td>" + fiftyPlus + "</td>\n" +
                "    <td>" + white + "</td>\n" +
                "    <td>" + black + "</td>\n" +
                "    <td>" + other + "</td>\n");
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public double getMale() {
        return male;
    }

    public void setMale(double male) {
        this.male = male;
    }

    public double getFemale() {
        return female;
    }

    public void setFemale(double female) {
        this.female = female;
    }

    public double getSub30() {
        return sub30;
    }

    public void setSub30(double sub30) {
        this.sub30 = sub30;
    }

    public double getThirtyTo50() {
        return thirtyTo50;
    }

    public void setThirtyTo50(double thirtyTo50) {
        this.thirtyTo50 = thirtyTo50;
    }

    public double getFiftyPlus() {
        return fiftyPlus;
    }

    public void setFiftyPlus(double fiftyPlus) {
        this.fiftyPlus = fiftyPlus;
    }

    public double getWhite() {
        return white;
    }

    public void setWhite(double white) {
        this.white = white;
    }

    public double getBlack() {
        return black;
    }

    public void setBlack(double black) {
        this.black = black;
    }

    public double getOther() {
        return other;
    }

    public void setOther(double other) {
        this.other = other;
    }
}

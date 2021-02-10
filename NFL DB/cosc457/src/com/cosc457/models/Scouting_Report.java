package com.cosc457.models;

public class Scouting_Report {
    private int reportID;
    private String date;
    private String scoutSsn;
    private String playerSsn;
    private int rating;
    private String commentary;

    public Scouting_Report(int reportID, String date, String scoutSsn, String playerSsn, int rating, String commentary) {
        this.reportID = reportID;
        this.date = date;
        this.scoutSsn = scoutSsn;
        this.playerSsn = playerSsn;
        this.rating = rating;
        this.commentary = commentary;
    }

    public Scouting_Report(int reportID) {
        this.reportID = reportID;
    }

    public int getReportID() { return reportID; }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getReportDate() {
        return date;
    }

    public void setReportDate(String date) {
        this.date = date;
    }

    public String getScoutSsn() {
        return scoutSsn;
    }

    public void setScoutSsn(String scoutSsn) {
        this.scoutSsn = scoutSsn;
    }

    public String getPlayerSsn() {
        return playerSsn;
    }

    public void setPlayerSsn(String playerSsn) {
        this.playerSsn = playerSsn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return  "Scouting Report ID: " + reportID +
                " Report Date: " + date +
                " Scout Ssn: " + scoutSsn +
                " Player Ssn: " + playerSsn +
                " Rating: " + rating +
                " Commentary: " + commentary;
    }

    public String toTable() {
        return ("    <td>" + reportID + "</td>\n" +
                "    <td>" + date + "</td>\n" +
                "    <td>" + scoutSsn + "</td>\n" +
                "    <td>" + playerSsn + "</td>\n" +
                "    <td>" + rating + "</td>\n" +
                "    <td>" + commentary + "</td>\n");
    }
}

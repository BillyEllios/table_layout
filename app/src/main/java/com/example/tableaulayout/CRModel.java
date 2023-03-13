package com.example.tableaulayout;

public class CRModel {
    String rapport;
    String interet;
    String date;

    public CRModel(String rapport, String interet, String date){
        this.rapport = rapport;
        this.interet = interet;
        this.date = date;
    }

    public String getRapport() {
        return rapport;
    }

    public String getInteret() {
        return interet;
    }

    public String getDate() {
        return date;
    }
}

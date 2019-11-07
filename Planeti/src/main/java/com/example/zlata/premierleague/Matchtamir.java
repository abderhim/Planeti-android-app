package com.example.zlata.premierleague;

/**
 * Created by zlata on 03/12/2017.
 */

public class Matchtamir {

    String teamlawal;
    String teamtheni;
    String taamira;

    public  Matchtamir(){}

    public Matchtamir(String teamlawal,String teamtheni,String taamira) {
this.teamlawal=teamlawal;
this.teamtheni=teamtheni;
this.taamira=taamira;

    }

    public String getTeamlawal() {
        return teamlawal;
    }

    public void setTeamlawal(String teamlawal) {
        this.teamlawal = teamlawal;
    }

    public String getTeamtheni() {
        return teamtheni;
    }

    public void setTeamtheni(String teamtheni) {
        this.teamtheni = teamtheni;
    }

    public String getTaamira() {
        return taamira;
    }

    public void setTaamira(String taamira) {
        this.taamira = taamira;
    }

    @Override
    public String toString() {
        return
                "teamlawal='" + teamlawal +
                ", teamtheni='" + teamtheni

                ;
    }
}



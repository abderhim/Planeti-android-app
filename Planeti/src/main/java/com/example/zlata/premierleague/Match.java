package com.example.zlata.premierleague;

/**
 * Created by zlata on 09/11/2017.
 */

public class Match {

    String team1;
    String team2;
    int imgteam1;
    int imgteam2;
    String jounee;
    String Matchday;

    public Match() {

        super();
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getJounee() {
        return jounee;
    }

    public void setJounee(String jounee) {
        this.jounee = jounee;
    }

    public String getMatchday() {
        return Matchday;
    }

    public void setMatchday(String matchday) {
        Matchday = matchday;
    }

    public int getImgteam1() {
        return imgteam1;
    }

    public void setImgteam1(int imgteam1) {
        this.imgteam1 = imgteam1;
    }

    public int getImgteam2() {
        return imgteam2;
    }

    public void setImgteam2(int imgteam2) {
        this.imgteam2 = imgteam2;
    }
}

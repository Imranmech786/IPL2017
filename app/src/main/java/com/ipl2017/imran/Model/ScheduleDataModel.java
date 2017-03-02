package com.ipl2017.imran.Model;


public class ScheduleDataModel {


    String matchname;
    String team;
    String date;
    String time;
    String venue;
    int image;

    public ScheduleDataModel(String matchname, String team, String date, String time, String venue, int image) {
        this.matchname = matchname;
        this.team = team;
        this.date = date;
        this.time=time;
        this.venue=venue;
        this.image=image;
    }

    public String getMatchname() {
        return matchname;
    }

    public void setMatchname(String matchname) {
        this.matchname = matchname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
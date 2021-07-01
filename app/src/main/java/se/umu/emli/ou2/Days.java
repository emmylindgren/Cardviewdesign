package se.umu.emli.ou2;

import java.util.ArrayList;
import java.util.HashMap;

public class Days {
    int dayColor;
    String date;
    ArrayList<String> events;
    ArrayList<Integer> eventcolors;


    public Days(int dayColor, String date) {
        this.dayColor = dayColor;
        this.date = date;
        events = new ArrayList<>();
        eventcolors = new ArrayList<>();
    }

    public void addEvent(String event, int color){
        events.add(event);
        eventcolors.add(color);
    }

    public int getDayColor() {
        return dayColor;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public ArrayList<Integer> getEventColors() {
        return eventcolors;
    }
}

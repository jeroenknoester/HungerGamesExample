package com.capgemini.examples;

import com.capgemini.examples.Domain.Contestant;

import java.util.ArrayList;

public class ArenaController {

    private int day;
    private ArrayList<Contestant> contestants = new ArrayList();

    public ArenaController() {
        day = 0;
        System.out.println("Arena starts!: Day "+ getDay());
        CreateContestants();
    }

    public int getDay() {
        return day;
    }

    private void CreateContestants(){
        for (int i = 0; i < 24; i++) {
            contestants.add(new Contestant());
        }

    }
    
}

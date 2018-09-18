package com.capgemini.examples.Controllers;

import com.capgemini.examples.Domain.Contestant;

import java.util.ArrayList;

public class ArenaController {

    private int day;
    private ArrayList<Contestant> contestants = new ArrayList<>();
    private ArrayList<Contestant> aliveContestants = new ArrayList<>();

    ArenaController() {
        day = 1;
        System.out.println("Arena starts!: Day "+ getDay());
        createContestants();
    }

    public int getDay() {
        return day;
    }

    private ArrayList<Contestant> createContestants(){
        for (int i = 0; i < 24; i++) {
            contestants.add(new Contestant());
        }
        return contestants;
    }
    public ArrayList<Contestant> getAliveContestants(){
        for(Contestant contestant : contestants){
            if(contestant.isAlive())
                aliveContestants.add(contestant);
        }

        return aliveContestants;
    }
    
}

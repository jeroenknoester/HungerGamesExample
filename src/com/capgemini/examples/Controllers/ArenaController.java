package com.capgemini.examples.Controllers;

import com.capgemini.examples.Domain.Abstracts.Contestant;
import com.capgemini.examples.Domain.DistrictContestant;

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
            contestants.add(new DistrictContestant());
        }
        return contestants;
    }
    public ArrayList<Contestant> getAliveContestants(){
        for(Contestant contestant : contestants){
            if(contestant.getAlive())
                aliveContestants.add(contestant);
        }

        return aliveContestants;
    }
    
}

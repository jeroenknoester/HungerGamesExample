package com.capgemini.examples.Domain;

import com.capgemini.examples.Domain.Abstracts.Contestant;

public class DistrictContestant extends Contestant {

    private int health;
    public DistrictContestant(){
        super();
        setHealth(120);
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }
}

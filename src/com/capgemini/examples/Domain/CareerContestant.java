package com.capgemini.examples.Domain;

import com.capgemini.examples.Domain.Abstracts.Contestant;

public class CareerContestant extends Contestant {
    private int health;

    public CareerContestant(
    ){
        super();
        setHealth(100);
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

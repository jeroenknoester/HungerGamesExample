package com.capgemini.examples.Domain.Abstracts;

import com.capgemini.examples.Domain.Interfaces.Healthy;

public abstract class Contestant implements Healthy {
    private int health;
    private boolean isAlive;

    public Contestant() {
        this.isAlive = true;
        System.out.println("I am alive");
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean getAlive() {
        return isAlive;
    }


}

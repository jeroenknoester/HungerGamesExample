package com.capgemini.examples.Domain;

public class Contestant {
    public Contestant() {
        this.isAlive = true;
        System.out.println("I am alive");
    }

    public boolean isAlive() {
        return isAlive;
    }

    private boolean isAlive;
}

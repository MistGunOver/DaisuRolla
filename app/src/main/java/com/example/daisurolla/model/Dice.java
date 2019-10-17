package com.example.daisurolla.model;

import java.util.Random;

public class Dice {
    private DiceType diceType;
    private Random random;

    public Dice(DiceType diceType) {
        this.diceType = diceType;
        this.random = new Random();
    }

    public int getThrowResult() {
        return random.nextInt(diceType.getNumberOfWalls()) + 1;
    }
}

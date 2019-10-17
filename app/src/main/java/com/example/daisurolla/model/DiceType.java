package com.example.daisurolla.model;

public enum DiceType {
    K2(2),
    K3(3),
    K4(4),
    K6(6),
    K8(8),
    K10(10),
    K12(12),
    K20(20),
    K100(100);

    private final int numberOfWalls;

    DiceType(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public int getNumberOfWalls() {
        return numberOfWalls;
    }
}

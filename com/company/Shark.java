package com.company;

public class Shark extends Animal {

    Shark(String name) {
        super(AnimalType.SHARK, name);
        super.moveType = MoveType.SWIM;
    }
}

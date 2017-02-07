package com.company;


public class Elephant extends Animal  {

    public Elephant(String name) {
        super(AnimalType.ELEPHANT, name);
        super.moveType = moveType.WALK;
    }
}

package com.company;


public class Falcon extends Animal {

    Falcon(String name) {
        super(AnimalType.FALCON, name);
        super.moveType = moveType.FLY;
    }
}
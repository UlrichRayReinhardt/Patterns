package com.company;




public class Sparrow extends Animal {

    Sparrow(String name) {
        super(AnimalType.SPARROW, name);
        super.moveType = MoveType.FLY;
    }
}

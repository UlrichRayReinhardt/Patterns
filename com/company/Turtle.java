package com.company;



public class Turtle extends Animal {

    Turtle(String name) {
        super(AnimalType.TURTLE, name);
        moveType = MoveType.SWIM;
    }
}
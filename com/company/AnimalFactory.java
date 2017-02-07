package com.company;


 class AnimalFactory {
     Animal buildAnimal(AnimalType type){
        Animal animal = null;
        switch (type){
            case DOLPHIN:
                animal = new Dolphin("Doplhin");
                break;

            case SHARK:
                animal = new Shark("Shark");
                break;

            case TURTLE:
                animal = new Turtle("Turtle");
                break;

            case TIGER:
                animal = new Tiger("Tiger");
                break;

            case ELEPHANT:
                animal = new Elephant("Elephant");
                break;

            case BUFFALO:
                animal = new Buffalo("Buffalo");
                break;

            case CROW:
                animal = new Crow("Crow");
                break;

            case SPARROW:
                animal = new Sparrow("Sparrow");
                break;

            case FALCON:
                animal = new Falcon("Falcon");
                break;

default:
    System.out.println("No animal");
        }
return animal;



}}

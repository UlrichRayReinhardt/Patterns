package com.company;


 class CageFactory {
    Cage buildCage(CageType cageType, int number){
        Cage cage = null;
        switch (cageType){
            case AQUARIUM:
                cage = new Aquarium(number);
                break;
            case AVIARY:
                cage = new Aviary(number);
                break;
            case BIRDCAGE:
                cage = new BirdCage(number);
                break;
                default: System.out.println("No cage");
        }return cage;
    }
}

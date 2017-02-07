package company;


import java.util.ArrayList;
import java.util.List;


class Cage {
    int cageNumber = 0;
    CageType cageType;
    List<Animal> animalsInCage;
    int cageSize = 3;
    final int MAXCAGESIZE = 5;


    Cage() {
        this.animalsInCage = new ArrayList<>();
    }

    boolean isCageFull(int animalsAlreadyInCage){
        return animalsAlreadyInCage >= cageSize;
    }

    public int getCageNumber(){
        return cageNumber;
    }


    public List<Animal> getAnimalsInCage() {
        return animalsInCage;
    }
}

class BirdCage extends Cage { //for flying
    BirdCage(int number) {
        this.cageType = CageType.BIRDCAGE;
        this.cageNumber = number;
    }

}

class Aquarium extends Cage { //for swimming
    Aquarium(int number) {
        this.cageType = CageType.AQUARIUM;
        this.cageNumber = number;
    }
}

class Aviary extends Cage { //for walking
    Aviary(int number) {
        this.cageType = CageType.AVIARY;
        this.cageNumber = number;
    }
}



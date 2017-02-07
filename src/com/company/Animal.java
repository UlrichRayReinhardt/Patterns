package company;


public abstract class Animal {
    String name;
    MoveType moveType;
    int hungry;

    public Animal(AnimalType animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }


    private AnimalType animalType = null;

        private MoveType getMoveType() {
        return moveType;
    }
}








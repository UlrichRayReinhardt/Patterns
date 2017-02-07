package company;


public class Crow extends Animal {

    Crow(String name) {
        super(AnimalType.CROW, name);
        super.moveType = MoveType.FLY;
    }
}
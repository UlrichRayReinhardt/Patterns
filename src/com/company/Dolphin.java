package company;

public class Dolphin extends Animal {

    Dolphin(String name) {
        super(AnimalType.DOLPHIN, name);
        super.moveType = MoveType.SWIM;
    }
}

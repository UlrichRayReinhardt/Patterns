package company;


public class Buffalo extends Animal  {

    public Buffalo(String name) {
        super(AnimalType.BUFFALO, name);
        super.moveType = MoveType.WALK;
    }
}

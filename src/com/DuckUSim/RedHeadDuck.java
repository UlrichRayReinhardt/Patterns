package DuckUSim;

public class RedHeadDuck extends Duck{
    RedHeadDuck(){
        flybehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    public void display() {
        System.out.println("I'm rubber duck!");
    }
}

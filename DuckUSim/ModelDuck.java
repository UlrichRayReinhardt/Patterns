package DuckUSim;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flybehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm model duck");
    }
}

package DuckUSim;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flybehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm mallard duck");
    }
}

package DuckUSim;


public abstract class Duck {

    FlyBehavior flybehavior;
    QuackBehavior behavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {


        flybehavior.fly();
    }

    public void performQuack() {
        behavior.quack();
    }

    public void setFlybehavior(FlyBehavior fb){


        flybehavior = fb;
    }

    public void setBehavior(QuackBehavior qk){
        behavior = qk;
    }

    public void swim() {


        System.out.println("All ducks float, even decoys!");
    }
}

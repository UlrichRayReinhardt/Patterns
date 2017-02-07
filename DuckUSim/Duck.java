package DuckUSim;


public abstract class Duck {

    FlyBehavior flybehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flybehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlybehavior(FlyBehavior flyBehavior) {
        flybehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior qk){
        quackBehavior = qk;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

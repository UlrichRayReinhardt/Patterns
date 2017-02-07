package DuckUSim;


public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlybehavior(new FlyRocketPowered());
        model.performFly();

        new Decoy();

    }
}

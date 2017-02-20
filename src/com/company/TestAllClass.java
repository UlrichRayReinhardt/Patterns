package company;


public class TestAllClass {

    public void testAll() {

        AnimalsTest animals = new AnimalsTest();
        animals.fillAnimals();

        Zoo zoo = new Zoo();
        ZooEmployee zooemployee = new ZooEmployee();


        zoo.getBirdCages().add(zooemployee.createCage(CageType.BIRDCAGE, 1));
        zoo.getBirdCages().add(zooemployee.createCage(CageType.BIRDCAGE, 2));

        Animal first = animals.getAnimals().get(0);
        Animal second = animals.getAnimals().get(0);
        Animal third = animals.getAnimals().get(0);


        zooemployee.putInCage(first, zoo.getBirdCages().get(0));
        zooemployee.checkIsCageFull(zoo.getBirdCages().get(0));

        zooemployee.putInCage(second, zoo.getBirdCages().get(0));
        zooemployee.checkIsCageFull(zoo.getBirdCages().get(0));

        zooemployee.putInCage(third, zoo.getBirdCages().get(0));
        zooemployee.checkIsCageFull(zoo.getBirdCages().get(0));

        zooemployee.printAnimalFromCage(zoo.getBirdCages());

    }
}

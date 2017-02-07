package company;


public class ZooMain {
    public static void main(String[] args) {

        AnimalsTest animals = new AnimalsTest();
        animals.fillAnimals();

        Zoo zoo = new Zoo();
        ZooEmployee zooemployee = new ZooEmployee();

        zoo.getAquariums().add(zooemployee.createCage(CageType.AQUARIUM, 1));
        zoo.getAviarys().add(zooemployee.createCage(CageType.AVIARY, 1));
        zoo.getBirdCages().add(zooemployee.createCage(CageType.BIRDCAGE, 1)); //create default 3 cages for each type
        zoo.getBirdCages().add(zooemployee.createCage(CageType.BIRDCAGE, 2));


       // zooemployee.putInCage(zoo, animals.getAnimals());

        zooemployee.printAnimalFromCage(zoo.getAquariums());
        zooemployee.printAnimalFromCage(zoo.getAviarys());
        zooemployee.printAnimalFromCage(zoo.getBirdCages());
    }
}


;


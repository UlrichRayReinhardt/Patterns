package company;


import java.util.LinkedList;
import java.util.List;


public class AnimalsTest {
    private AnimalFactory animalFactory = new AnimalFactory();

    List<Animal> animals = new LinkedList<>();

    public void fillAnimals() {

  /*      animals.add(animalFactory.buildAnimal(AnimalType.DOLPHIN));
        animals.add(animalFactory.buildAnimal(AnimalType.ELEPHANT));
        animals.add(animalFactory.buildAnimal(AnimalType.ELEPHANT));
  */
        animals.add(animalFactory.buildAnimal(AnimalType.CROW));
        animals.add(animalFactory.buildAnimal(AnimalType.CROW));
        /*
       animals.add(animalFactory.buildAnimal(AnimalType.CROW));
       animals.add(animalFactory.buildAnimal(AnimalType.CROW));
       animals.add(animalFactory.buildAnimal(AnimalType.CROW));
       */
    }

    public List<Animal> getAnimals() {
        return animals;
    }

}
package company;


import java.util.Iterator;
import java.util.List;


class ZooEmployee{
CagesIterator cagesIterator;



    Cage createCage(CageType cageType, int number) {
        CageFactory cageFactory = new CageFactory();
        Cage cage = cageFactory.buildCage(cageType, number);
        System.out.println(cageType.toString() + " created");
        return cage;
    }

    void putInCage(Animal animal, Cage cage) {
        cage.animalsInCage.add(animal);
        System.out.println("Put " + animal.name + " in " + cage.cageType);
    }
void checkIsCageFull(Cage cage){
        if(cage.isCageFull()){
            System.out.println("Cage is full");
        }else
            System.out.println("Cage is not full");
}

    Zoo putAnimalsInCages(Zoo zoo, List<Animal> animals) {

        Iterator<Animal> itr = animals.iterator();
        while (itr.hasNext()) {
            Animal animal = itr.next();
            switch (animal.moveType) {
                case FLY:
                    List<Cage> birdCages = zoo.getBirdCages();
                    birdCages.size();

                    break;


                case WALK:
                    break;
                case SWIM:
      /*              List<Cage> aquariums = zoo.getAquariums();
                    Iterator<Cage> aquariumsIterator = aquariums.iterator();
                    while (aquariumsIterator.hasNext()) {
                        Cage cage = aquariumsIterator.next();
                        List<Animal> animalsInCage = cage.getAnimalsInCage();
                        int animalsCount = animalsInCage.size();
                        if (!cage.isCageFull(animalsCount)) {
                            animalsInCage.add(animal);
                        } else {
                            System.out.println("Need more cages");
                            createCage(CageType.AQUARIUM, cage.getCageNumber() + 1);
                            animalsInCage.add(animal);
                        }
                    }
                    break;
            }*/
            }
        }
        return zoo;
    }


    public void printAnimalFromCage(List<Cage> cage) {

        Iterator<Cage> cages = cage.iterator();
        while (cages.hasNext()) {
            Cage currentcage = cages.next();
            List<Animal> animals = currentcage.getAnimalsInCage();

            Iterator<Animal> iterator = animals.iterator();
            while (iterator.hasNext()) {

                System.out.println(iterator.next().name + " in " + currentcage.cageType + " № " + currentcage.cageNumber);
            }
        }

    }
}







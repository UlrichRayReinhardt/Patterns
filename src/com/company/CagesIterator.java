package company;


import java.util.Iterator;
import java.util.List;

public abstract class CagesIterator {

    public Cage untilCondition(List<Cage> cages) {
        Cage cage;
        Iterator<Cage> itr = cages.iterator();
        do {
            cage = itr.next(); //if cage is full or no next itr cage exist
        } while ( !cage.isCageFull(cage.animalsInCage.size()) | !itr.hasNext() );
        return cage;
    }

    public
}


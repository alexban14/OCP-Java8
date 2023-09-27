import java.util.*;

// comparator that sorts Squirrels by spiecies
// if 2 Squirrels share the same name, we sort the one
// that weights the least first
/*
public class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight()—s2.getWeight();
    }
}
*/

//easier way of implementing the comparator using static and default methods on interfaces,
//some helper methods on the Compartor interface
public class ChainingComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.
            comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}


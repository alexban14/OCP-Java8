import java.lang.*;
import java.uitl.*;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }

    public int getWeight() { return weight; }

    public String toString() { return name; }

    // only one way of implementing the compareTo method
    // in this case the name was chosen
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        // in this case we defined a separate logic for sorting the objects by their weight
        // by defining a inner class based on the Comparator class
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight()—d2.getWeight();
            }
        };

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));

        Collections.sort(ducks);
        System.out.println(ducks); // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks); // [Quack, Puddles]
    }
}

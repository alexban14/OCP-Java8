import java.uitl.*;

public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight()—d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
    
    public static void main(String[] arg) {
        // writing a comparator
        /*
        Comparator<Duck> byWeight = (d1, d2) => DuckHelper.compareByWeigth(d1, d2);
        */

        // syntax for passing the parameters automaticallt
        Comparator<Duck> byWeight = DuckHelper::compareByWeight;
    }
}

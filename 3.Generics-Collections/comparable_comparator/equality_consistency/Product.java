import java.util.*;

// an example of the 2 equality methods that produce inconsistency
public class Product implements Comparable<Product> {
    int id;
    String name;

    public boolean equals(Object obj) {
        if(!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}

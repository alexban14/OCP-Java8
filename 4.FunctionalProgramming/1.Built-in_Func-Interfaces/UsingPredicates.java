import java.util.function.*;

public class UsingPredicates {
    public static void main(String[] args) {
        // Predicate ex
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        // BiPredicate ex
        BiPredicate<String,String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chick"));
        
        predDefaultMethod();
    }

    public static void predDefaultMethod() {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        /* long option that also contains duplicates
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        */
        
        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("Chicken eggs"));
        System.out.println(otherEggs.test("Chicken eggs"));
    }
}

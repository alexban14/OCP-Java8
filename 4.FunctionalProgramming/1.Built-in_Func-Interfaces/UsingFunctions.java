import java.util.function.*;
import java.lang.*;

public class UsingFunctions {
    public static void main(String[] args) {
        // Function ex: converting a string into the length of it
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = (x) -> x.length();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));

        // BiFunction ex: combining 2 String object to result one String object
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));
        System.out.println(b2.apply("baby ", "chick"));
    }
}

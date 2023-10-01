import java.util.function.*;
import java.util.*;

public class UsingConsumers {
    public static void main(String[] args) {
        // Consumer ex
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

        // BiConsuemr ex
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);
    }
}

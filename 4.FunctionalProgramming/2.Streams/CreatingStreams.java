import java.util.stream;

public class CreatingStreams {
    public static void main(String[] ars) {
        // the static Stream interface methods introduced with Java 8
        Stream<String>empty = Stream.empty(); //count = 0
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        // old way of creating streams using Lists
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> fromList = list.stream();
        Stream<Strign> fromListParallel = list.parallelStream(); // processes elements in parallel
    }
}

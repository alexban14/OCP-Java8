public class ReplaceAll {
    List<Integer> list = Arrays.asList(1, 2, 3);
    list.replaceAll(x -> x*2);
    System.out.println(list); // [2, 4, 6]
}

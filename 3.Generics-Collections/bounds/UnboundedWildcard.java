public class UnboundedWildcard {
    // this takes any time of list as a parameter and prints its contents
    public static void printList(List<?> list) {
        for (Object x: list) System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }
}

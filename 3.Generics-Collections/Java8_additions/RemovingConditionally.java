public class RemovingConditionally {
    List<String> list = new ArrayList<>();
    list.add("Magician");
    list.add("Assistant");
    System.out.println(list); // [Magician, Assistant]
    list.removeIf(s -> s.startsWith("A"));
    System.out.println(list); // [Magician]
}

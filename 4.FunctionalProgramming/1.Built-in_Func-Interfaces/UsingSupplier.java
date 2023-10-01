import java.util.function.*;
import java.time.LocalDate;

public class UsingSupplier {
    public static void main(String[] args) {
        // ex.1
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        // ex.2
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        System.out.println(s1.get());
        System.out.println(s2.get());

        //ex.3
        Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
        ArrayList<String> a1 = s1.get();
        System.out.println(a1);
    }
}

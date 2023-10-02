import java.util.*;

public class OptionalReturn {
   public static void main(String[] args) {
       Optional opt = average(90, 100);
       if (opt.isPresent())
           System.out.println(opt.get());
   }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
}

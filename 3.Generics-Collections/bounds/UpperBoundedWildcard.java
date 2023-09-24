interface Flyer { void fly(); }

class HangGlider implements Flyer { public void fly() {} }

class Goose implements Flyer { public void fly() {} }

public class UpperBoundedWildcard {
    List<? extends Number> numList = new ArrayList<Integer>();

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    private void anyFlyer(List<Flyer> flyer) {}

    //upper-bounds are like anonymous classes, they use extend regardless of
    // whether we are working with a class or interface
    private void groupOfFlyers(List<? extends Flyer> flyer) {}
}

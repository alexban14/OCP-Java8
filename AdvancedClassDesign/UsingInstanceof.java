public class UsingInsanceof {
    public void feedAnimal(Animal animal) {
        if (animal instanceof Cow) {
            ((Cow)animal).addHay();
        } else if (animal instanceof Bird) {
            ((Bird)animal).addSeed();
        } else if (animal instanceof Lion) {
            ((Lion)animal).addMeat();
        } else {
            throw new RuntimeException("Unsupported animal");
        } }
}

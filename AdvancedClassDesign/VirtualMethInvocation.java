public class VirtualMethInvocation {
    abstract class Animal {
        public abstract void feed(); }
    }

    class Cow extends Animal {
        public void feed() { addHay(); }
        private void addHay() { }
    }

    class Bird extends Animal {
        public void feed() { addSeed(); }
        private void addSeed() { }
    }

    // using Virtual method invocation
    public void feedAnimal(Animal animal) {
        animal.feed();
    }
}

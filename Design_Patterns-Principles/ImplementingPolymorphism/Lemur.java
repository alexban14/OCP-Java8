public class Primate {
	public boolean hasHair() {
		return true;
	}
}

public interface HasTail {
	public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);

        // Polymorphism
        // the ability of the lemur object to be passed
        // as an instance of an interface it implements, HasTail
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

        // the ability of the lemur object to be passed as an instance
        // of one of its superclasses
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}

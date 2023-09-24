public class Flippers {
	public void flap() {
		System.out.println("The flippers flap back and forth");
	}
}

public class WebbedFeet {
	public void kick() {
		System.out.println("The webbed feet kick to and fro");
	}
}

// composing objects => an alternative of inheritanced in order to achieve
// polymorphic behviour

public class Penguin {
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;

	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}

	public void flap() {
		this.flippers.flap();
	}

	public void kick() {
		this.webbedFeet.kick();
	}
}

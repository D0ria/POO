import java.util.Scanner;

public abstract class PercussionInstrument extends Instrument {
	protected float diameter;
	protected String material;
	protected String sound;

//constructors
	public PercussionInstrument(int barecode, float price, String brand, String model, String state, float diameter,
			String material, String sound) {
		super(barecode, price, brand, model, state);
		this.material = material;
		this.diameter = diameter;
		this.sound = sound;
	}

	public PercussionInstrument() {
		super();
	}

	public float getDiameter() {
		return diameter;
	}

//getters
	public String getMaterial() {
		return material;
	}

	public String getSound() {
		return sound;
	}

//method
	public String toStringPercussion() {
		return toStringInstrument() + " This percussion is composed with a " + getMaterial() + " as material, mesured "
				+ getDiameter() + " and make a " + getSound() + " when it rings.";
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the material: ");
		this.material = scanner.nextLine();
		System.out.println("Please, enter the type of Sound: ");
		this.sound = scanner.nextLine();
	}
}

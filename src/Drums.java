import java.util.Scanner;

public abstract class Drums extends Instrument {
	protected boolean dismount;

	public Drums(int barecode, float price, String brand, String model, String state, boolean dismount) {
		super(barecode, price, brand, model, state);
		this.dismount = dismount;
	}

	public Drums() {
		super();
	}

	public boolean isDismount() {
		dismount = true;
		System.out.println("The drum is dismounted.");
		return dismount;
	}

	public void setDismount(boolean dismount) {
		this.dismount = dismount;
		if (dismount = false) {
			System.out.println("The drum is mounted");
		}
	}

	public String toStringDrums() {
		return toStringInstrument();
	}

	public void initialize() {
		super.initialize();
	}
}

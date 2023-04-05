import java.util.Scanner;

public abstract class KeyboardInstrument extends Instrument implements Tunable {
	protected int keys;
	protected boolean tunable;
	protected String tuningDate;

//constructors 

	public KeyboardInstrument(int barecode, float price, String brand, String model, String state, boolean tunable,
			int keys, String tuningDate) {
		super(barecode, price, brand, model, state);
		this.keys = keys;
		this.tunable = tunable;
		this.tuningDate = tuningDate;
	}

	public KeyboardInstrument() {
		super();

	}

//getters 

	public int getKeys() {
		keys = 88;
		return keys;
	}

	public boolean isTunable() {
		tunable = true;
		return tuning();
	}

	public String getTuningDate() {
		return tuningDate;
	}

	public void setTuningDate(String tuningDate) {
		System.out.println("Please, enter a valid date with the format (DD/MM/YYYY):");
		this.tuningDate = tuningDate;
	}

//methods
	public boolean tuning() {
		System.out.print("It's possible to tuning it.");
		return tunable;
	}

	public String toStringKeyboardInstrument() {
		return this.toStringInstrument() + " It has " + this.getKeys()
				+ " keys. The last time it was tuned was this day: " + getTuningDate() + ".";
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the number of keys: ");
		this.keys = scanner.nextInt();
		System.out.println("Please, enter the tuning date: ");
		this.tuningDate = scanner.nextLine();
	}

}

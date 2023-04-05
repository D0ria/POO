import java.util.Scanner;

public abstract class StringInstrument extends Instrument implements Tunable {
	protected int strings;
	protected String bodyMaterial;
	protected String tuningDate;
	protected boolean tunable;

//constructors
	public StringInstrument(int barecode, float price, String brand, String model, String state, boolean tunable,
			int strings, String bodyMaterial, String tuningDate) {
		super(barecode, price, brand, model, state);
		this.strings = strings;
		this.bodyMaterial = bodyMaterial;
		this.tuningDate = tuningDate;
		this.tunable = tunable;
	}

	public StringInstrument() {
		super();
	}

//getters
	public int getStrings() {
		strings = 6;
		return strings;
	}

	public String getBodyMaterial() {
		bodyMaterial = "mahogany wood";
		return bodyMaterial;
	}

	public String getTuningDate() {
		return tuningDate;
	}

	public boolean isTunable() {
		tunable = true;
		return tunable;
	}

//setters
	public void setTuningDate(String tuningDate) {
		System.out.println("Please, enter a valid date with the format (DD/MM/YYYY):");
		this.tuningDate = tuningDate;
	}

//methods
	public boolean tuning() {
		System.out.print("It's possible to tuning it. ");
		return tunable;
	}

	public String toStringStringInstrument() {
		return toStringInstrument() + " It has " + getStrings() + " string and was made with " + getBodyMaterial()
				+ ". The last time it was tuned was this day: " + getTuningDate() + ".";
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter material: ");
		this.bodyMaterial = scanner.nextLine();
		System.out.println("Please, enter a tuningDate valable: ");
		this.tuningDate = scanner.nextLine();

	}

}

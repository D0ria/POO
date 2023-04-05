import java.util.Scanner;

public class ElectricGuitar extends StringInstrument {
	private String mics;
	private String tuning;

	public ElectricGuitar(int barecode, float price, String brand, String model, String state, boolean tunable,
			int strings, String bodyMaterial, String tuningDate, String mics, String tuning) {
		super(barecode, price, brand, model, state, tunable, strings, bodyMaterial, tuningDate);
		this.mics = mics;
		this.tuning = tuning;
	}

	public ElectricGuitar() {
		super();
	}

//getters
	public String getMics() {
		return mics;
	}

	public String getTuning() {
		return tuning;
	}

//setters
	public void setMics(String mics) {
		this.mics = mics;
	}

	public void setTuning(String tuning) {
		System.out.println("Classic tuning mode set by default.");
		this.tuning = tuning;
	}

//methods

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the mics: ");
		this.mics = scanner.nextLine();
	}

	public String toString() {
		return "Electric Guitar: " + toStringStringInstrument() + " This guitar is composed with a " + getMics()
				+ "mic and was set like that: " + getTuning();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price ");
			System.out.println("2 Modify the mic");
			System.out.println("3: Modify the type of tuning");
			System.out.println("4: Exit");

			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter a new price: ");
				setPrice(scanner.nextFloat());
				break;
			case 2:
				System.out.print("Enter a new mic: ");
				setMics(scanner.nextLine());
				break;
			case 3:
				System.out.println("How you you like to tune the guitar? : ");
				setTuning(scanner.nextLine());
				System.out.println("Enter the date of today with the format DD/MM/YYYY");
				setTuningDate(scanner.nextLine());
			}
		} while (choice != 4);
	}
}

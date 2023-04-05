import java.util.Scanner;

public class UprightPiano extends KeyboardInstrument {
	private String hammerMaterial;
	private String tuning;

//constructors
	public UprightPiano(int barecode, float price, String brand, String model, String state, int keys,
			String hammerMaterial, boolean tunable, String tuningDate, String tuning) {
		super(barecode, price, brand, model, state, tunable, keys, tuningDate);
		this.hammerMaterial = hammerMaterial;
		this.tuning = tuning;
	}

	public UprightPiano() {
		super();
	}

//getters
	public String getHammerMaterial() {
		return hammerMaterial;
	}

	public String getTuning() {
		return tuning;
	}

//setters
	public void setHammerMaterial(String hammerMaterial) {
		this.hammerMaterial = hammerMaterial;
	}

	public void setTuning(String tuning) {
		System.out.println("Classic tuning mode set by default.");
		this.tuning = tuning;
	}

//methods 
	public String toString() {
		return "Upright piano: " + toStringKeyboardInstrument() + " The hammers of this piano are made with "
				+ getHammerMaterial() + " and is set like that: " + getTuning();
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the material of the hammers: ");
		this.hammerMaterial = scanner.nextLine();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price");
			System.out.println("2 Modify the hammers material");
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
				System.out.print("Enter the material of the hammers : ");
				setHammerMaterial(scanner.nextLine());
				break;
			case 3:
				System.out.println("How would you like to tune the piano? : ");
				setTuning(scanner.nextLine());
				System.out.println("Enter the date of today with the format DD/MM/YYYY");
				setTuningDate(scanner.nextLine());
			}
		} while (choice != 4);
	}
}

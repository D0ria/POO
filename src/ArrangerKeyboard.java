import java.util.Scanner;

public class ArrangerKeyboard extends KeyboardInstrument {
	private String typeOfSound;
	private String tuning;

	public ArrangerKeyboard(int barecode, float price, String brand, String model, String state, int keys,
			boolean tunable, String typeOfSound, String tuningDate, String tuning) {
		super(barecode, price, brand, model, state, tunable, keys, tuningDate);
		this.typeOfSound = typeOfSound;
		this.tuning = tuning;
	}

	public ArrangerKeyboard() {
		super();
	}

//getters
	public String getTypeOfSound() {
		return typeOfSound;
	}

	private String getTuning() {
		return tuning;
	}

//setters
	public void setTuning(String tuning) {
		System.out.println("Classic tuning mode set by default.");
		this.tuning = tuning;
	}

//methods

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the type of sound: ");
		this.typeOfSound = scanner.nextLine();
	}

	public String toString() {
		return "ArrangerKeyboard : " + toStringKeyboardInstrument() + " This piano makes this sound: "
				+ getTypeOfSound() + " and is set like that: " + getTuning();
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
				System.out.println("How would you like to tune the piano? : ");
				setTuning(scanner.nextLine());
				System.out.println("Enter the date of today with the format DD/MM/YYYY");
				setTuningDate(scanner.nextLine());
			}
		} while (choice != 3);
	}

}

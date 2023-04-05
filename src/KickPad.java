import java.util.Scanner;

public class KickPad extends Electronic {

	public KickPad(int barecode, float price, String brand, String model, String state, float diameter, String material,
			String sound) {
		super(barecode, price, brand, model, state, diameter, material, sound);
	}

	public KickPad() {
		super();
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public String toString() {
		return "Kick pad: " + toStringPercussion();
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the diameter (in cm): ");
		this.diameter = scanner.nextFloat();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price ");
			System.out.println("2 Modify the diameter");
			System.out.println("3: Exit");

			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter a new price: ");
				setPrice(scanner.nextFloat());
				break;
			case 2:
				System.out.print("Enter a new diameter (in cm): ");
				setDiameter(scanner.nextFloat());
				break;
			}
		} while (choice != 3);
	}
}

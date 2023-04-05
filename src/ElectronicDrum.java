import java.util.Scanner;

public class ElectronicDrum extends Drums {
	private boolean disconnected;
	private String constitution;

	public ElectronicDrum(int barecode, float price, String brand, String model, String state, boolean dismount,
			boolean disconnected, String constitution) {
		super(barecode, price, brand, model, state, dismount);
		this.disconnected = disconnected;
		this.constitution = constitution;
	}

	public ElectronicDrum() {
		super();
	}

//getters
	public boolean isDisconnected() {
		return disconnected;
	}

	public String getConstitution() {
		return constitution;
	}

//methods 
	public void toStringIsDisconnected() {
		if (disconnected = false) {
			System.out.println("The drum is already connected, you can disconnect it.");
			disconnected = true;
			System.out.println("The drum has been disconnected with success.");

		} else {
			disconnected = true;
			System.out.println("The drum has been disconnected with success.");
			disconnected = false;
			System.out.println("The drum is disconnected.");
		}
	}

	public String toString() {
		return "ElectronicDrum : " + toStringDrums() + " You can find " + getConstitution();
	}

	public void initialize() {
		super.initialize();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price");
			System.out.println("2 Connect/disconnect the drum");
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
				if (this.isDisconnected()) {
					System.out.println("The drum is disconnected");
					System.out.println("The drum has been connected with success");
					disconnected = false;

				} else {
					System.out.println("The drum is connected");
					System.out.println("The drum has been disconnected with success.");
					disconnected = true;
				}
				break;
			}
		} while (choice != 3);
	}
}

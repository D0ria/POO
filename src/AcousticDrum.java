import java.util.Scanner;

public class AcousticDrum extends Drums {
	private String customization;

	public AcousticDrum(int barecode, float price, String brand, String model, String state, boolean dismount,
			String customization) {
		super(barecode, price, brand, model, state, dismount);
	}

	public AcousticDrum(int barecode, float price, String brand, String model, String state, boolean dismount) {
		super(barecode, price, brand, model, state, dismount);
	}

	public AcousticDrum() {
		super();
	}

//getters

	public String getCustomization() {
		return customization;
	}

//setters

	public void setCustomization(String customization) {
		this.customization = customization;
	}

//methods 
	public String toString() {
		return "Acoustic drum: " + toStringDrums() + "In the kick drum, it's writing " + getCustomization() + ".";
	}

	public void initialize() {
		super.initialize();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price");
			System.out.println("2 Connect/disconnect the drum");
			System.out.println("3 Connect/disconnect the drum");
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
				if (this.isDismount()) {
					System.out.println("The drum is dismounted");
					System.out.println("The drum has been mounted with success");
					dismount = false;
				} else {
					System.out.println("The drum is mounted");
					System.out.println("The drum has been dismounted with success.");
					dismount = true;
				}
				break;
			case 3:
				System.out.println("Enter your tag that will appear on your drum: ");
				setCustomization(scanner.nextLine());
				break;
			}
		} while (choice != 4);
	}
}

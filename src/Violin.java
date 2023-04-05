import java.util.Scanner;

public class Violin extends StringInstrument {
	private String bowMaterial;

	public Violin(int barecode, float price, String brand, String model, String state, boolean tunable, int strings,
			String bodyMaterial, String tuningDate, String bowMaterial) {
		super(barecode, price, brand, model, state, tunable, strings, bodyMaterial, tuningDate);
		this.bowMaterial = bowMaterial;
	}

	public Violin() {
		super();
	}

//getters
	public String getBowMaterial() {
		return bowMaterial;
	}

//setters
	public void setBowMaterial(String bowMaterial) {
		this.bowMaterial = bowMaterial;
	}

//methods
	public String toString() {
		return "Violin : " + toStringStringInstrument() + " The bow is made with " + getBowMaterial();
	}

	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the material of the bow: ");
		this.bowMaterial = scanner.nextLine();
	}

	public void modify() {
		int choice = 0;
		do {
			System.out.println("1: Modify the price ");
			System.out.println("2 Modify the material of the bow");
			System.out.println("3: Exit");

			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter a new price: ");
				setPrice(scanner.nextFloat());
				break;
			case 2:
				System.out.print("Enter a new material for the bow: ");
				setBowMaterial(scanner.nextLine());
				break;
			}
		} while (choice != 3);
	}

}
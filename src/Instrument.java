import java.util.Scanner;

public abstract class Instrument {
	protected int barecode;
	protected float price;
	protected String brand;
	protected String model;
	protected String state;

//constructors 

	public Instrument(int barecode, float price, String brand, String model, String state) {
		this.barecode = barecode;
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.state = state;
	}

	public Instrument() {
	}

//getters

	public String getBrand() {
		return brand;
	}

	public int getBarecode() {
		return barecode;
	}

	public String getModel() {
		return model;
	}

	public float getPrice() {
		return price;
	}

	public String getState() {
		return state;
	}

//setters

	public void setPrice(float price) {
		if (price < 0) {
			System.out.println("Error : Please, enter a valid price!");
		}
		this.price = price;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String toStringInstrument() {
		return "Barecode " + getBarecode() + " : This intrument is " + this.getState() + ". It's a " + this.getBrand()
				+ ", of the model " + this.getModel() + " and coasts " + this.getPrice() + " dollars.";
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter an id: ");
		this.barecode = scanner.nextInt();
		System.out.println("Please, enter a new price: ");
		this.price = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Please, enter a new brand: ");
		this.brand = scanner.nextLine();
		System.out.println("Please, enter a new model: ");
		this.model = scanner.nextLine();
		System.out.println("Please, enter an id: ");
		this.state = scanner.nextLine();
	}

	public void initializeState() {
		System.out.println("This instrument is " + this.getState());
		if (state == "in stock") {
			System.out.println("This instrument has been put in exposition with success");
			state = "in exposition";
		} else {
			System.out.println("This intrument has been put in stock with success");
			state = "in stock";
		}
	}

}

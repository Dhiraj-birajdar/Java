package inventory_management_system;

//Product class representing items in inventory
public class Product {
	private int id;
	private String name;
	private String category;
	private double price;
	private int quantity;

	// Constructor
	public Product(int id, String name, String category, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	// Method to update quantity
	public void updateQuantity(int delta) {
		this.quantity += delta;
	}

	// Method to display product details
	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: $" + price
				+ ", Quantity: " + quantity);
	}
}

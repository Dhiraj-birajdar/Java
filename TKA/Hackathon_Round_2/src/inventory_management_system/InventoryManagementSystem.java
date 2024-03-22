package inventory_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Inventory Management System
class InventoryManagementSystem {
	private Map<Integer, Product> inventory;

	// Constructor
	public InventoryManagementSystem() {
		inventory = new HashMap<>();
	}

	// Method to add product to inventory
	public void addProduct(Product product) {
		inventory.put(product.getId(), product);
		System.out.println("Product added to inventory: " + product.getName());
	}

	// Method to remove product from inventory
	public void removeProduct(int productId) {
		if (inventory.containsKey(productId)) {
			Product removedProduct = inventory.remove(productId);
			System.out.println("Product removed from inventory: " + removedProduct.getName());
		} else {
			System.out.println("Product with ID " + productId + " not found in inventory.");
		}
	}

	// Method to update product quantity in inventory
	public void updateProductQuantity(int productId, int deltaQuantity) {
		if (inventory.containsKey(productId)) {
			Product product = inventory.get(productId);
			product.updateQuantity(deltaQuantity);
			System.out.println(
					"Quantity updated for product " + product.getName() + ". New quantity: " + product.getQuantity());
		} else {
			System.out.println("Product with ID " + productId + " not found in inventory.");
		}
	}

	// Method to search products by category
	public List<Product> searchByCategory(String category) {
		List<Product> results = new ArrayList<>();
		for (Product product : inventory.values()) {
			if (product.getCategory().equalsIgnoreCase(category)) {
				results.add(product);
			}
		}
		return results;
	}

	// Method to search products by price range
	public List<Product> searchByPriceRange(double minPrice, double maxPrice) {
		List<Product> results = new ArrayList<>();
		for (Product product : inventory.values()) {
			if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
				results.add(product);
			}
		}
		return results;
	}

	// Method to search products by name
	public List<Product> searchByName(String name) {
		List<Product> results = new ArrayList<>();
		for (Product product : inventory.values()) {
			if (product.getName().toLowerCase().contains(name.toLowerCase())) {
				results.add(product);
			}
		}
		return results;
	}
}

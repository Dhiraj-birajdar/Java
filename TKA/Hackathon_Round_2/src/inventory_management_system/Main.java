package inventory_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Main {
    public static void main(String[] args) {
        // Testing Inventory Management System

        // Create Inventory Management System instance
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Add products to inventory
        inventorySystem.addProduct(new Product(1, "Laptop", "Electronics", 999.99, 10));
        inventorySystem.addProduct(new Product(2, "Smartphone", "Electronics", 599.99, 20));
        inventorySystem.addProduct(new Product(3, "T-shirt", "Clothing", 19.99, 50));
        inventorySystem.addProduct(new Product(4, "Sneakers", "Footwear", 79.99, 30));

        // Search products by category
        System.out.println("\nProducts in Electronics category:");
        List<Product> electronicsProducts = inventorySystem.searchByCategory("Electronics");
        for (Product product : electronicsProducts) {
            product.display();
        }

        // Search products by price range
        System.out.println("\nProducts in price range $50 - $100:");
        List<Product> productsInRange = inventorySystem.searchByPriceRange(50.0, 100.0);
        for (Product product : productsInRange) {
            product.display();
        }

        // Search products by name
        System.out.println("\nProducts containing 'sneakers' in name:");
        List<Product> sneakerProducts = inventorySystem.searchByName("sneakers");
        for (Product product : sneakerProducts) {
            product.display();
        }

        // Update product quantity
        inventorySystem.updateProductQuantity(1, -5); // Reduce 5 laptops from inventory

        // Remove product from inventory
        inventorySystem.removeProduct(3); // Remove T-shirt from inventory
    }
}

//Problem 4: Inventory Management System
//• Create an inventory management system for a retail store.
//• Implement features to add, remove, and update products in the inventory 
//using collections.
//• Use collections to efficiently search for products by various criteria, such as 
//category, price range, or name.


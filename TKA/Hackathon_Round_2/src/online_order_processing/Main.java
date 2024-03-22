package online_order_processing;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of OnlineOrder
        OnlineOrder onlineOrder = new OnlineOrder(12345, "2024-03-20", 150.50, "123 Street, City, Country");

        // Displaying order details including shipping address
        onlineOrder.display();
    }
}


/*
Problem 1: Online Order Processing
• Create an Order class with attributes like orderId, orderDate, and 
totalAmount. Implement methods to display the order details. Now, create a 
subclass called OnlineOrder that inherits from the Order class. 
• The OnlineOrder class should have an additional attribute shippingAddress. 
• Override the display method in the OnlineOrder class to include the shipping
address. 
• Create an instance of the OnlineOrder class and demonstrate its functionality by 
displaying its details, including the shipping address.
*/
package online_order_processing;
import java.time.LocalDate;

public class Order {
    private int orderId;
    private String orderDate;
    private double totalAmount;

    public Order(int orderId, String orderDate, double totalAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: $" + totalAmount);
    }
}





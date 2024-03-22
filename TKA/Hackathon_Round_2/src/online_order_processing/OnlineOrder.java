package online_order_processing;

public class OnlineOrder extends Order {
    private String shippingAddress;

    public OnlineOrder(int orderId, String orderDate, double totalAmount, String shippingAddress) {
        super(orderId, orderDate, totalAmount);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Shipping Address: " + shippingAddress);
    }
}



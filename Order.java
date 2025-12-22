public class Order {
    private int orderId;
    private ClothingItem item;
    private Customer customer;
    private int quantity;
    private boolean isCompleted;

    public Order(int orderId, ClothingItem item, Customer customer, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.customer = customer;
        this.quantity = quantity;
        this.isCompleted = false;
    }

    public double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void completeOrder() {
        double total = calculateTotalPrice();

        if (item.isAvailable(quantity) && customer.canPay(total)) {
            item.sell(quantity);
            customer.pay(total);
            isCompleted = true;
            System.out.println("Order completed successfully!");
        } else {
            System.out.println("Order cannot be completed.");
        }
    }
}
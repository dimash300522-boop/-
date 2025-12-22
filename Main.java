public class Main {
    public static void main(String[] args) {

        ClothingItem jacket = new ClothingItem(1, "Winter Jacket", "M", 150.0, 10);
        Customer customer = new Customer(101, "Zhalgas", "zhalgas@mail.com", 500.0);

        Order order = new Order(1001, jacket, customer, 2);

        System.out.println("Total price: " + order.calculateTotalPrice());
        order.completeOrder();

        System.out.println("Remaining stock: " + jacket.getStock());
        System.out.println("Customer balance: " + customer.getBalance());
        System.out.println("Loyalty points: " + customer.getLoyaltyPoints());
    }
}

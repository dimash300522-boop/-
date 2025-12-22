public class Customer {
    private int customerId;
    private String name;
    private String email;
    private double balance;
    private int loyaltyPoints;

    public Customer(int customerId, String name, String email, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.loyaltyPoints = 0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public boolean canPay(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        if (canPay(amount)) {
            balance -= amount;
            loyaltyPoints += (int) amount / 10;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


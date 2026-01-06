public class Clothing {
    protected String name;
    protected double price;

    public Clothing(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void buy() {
        System.out.println("Zhalgas buys clothing");
    }

    @Override
    public String toString() {
        return "Buyer: Zhalgas, Item: " + name + ", Price: " + price;
    }
}
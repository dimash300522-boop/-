package model;

public abstract class Clothes {
    protected String name;
    protected double price;

    public Clothes(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(name + " - " + price + " KZT");
    }

    // ABSTRACT METHOD
    public abstract void wear();
}

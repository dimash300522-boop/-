package model;

public class Pants extends Product {
    private int length;

    public Pants(String name, double price, int length) {
        super(name, price);
        setLength(length);
    }

    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;
    }

    @Override
    public void wear() {
        System.out.println("Wearing pants, length: " + length);
    }
}

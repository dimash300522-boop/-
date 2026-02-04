package model;

public class Shirt extends Clothes {
    private String size;

    public Shirt(String name, double price, String size) {
        super(name, price);
        setSize(size);
    }

    public String getSize() { return size; }

    public void setSize(String size) {
        if (size == null || size.isEmpty()) {
            throw new IllegalArgumentException("Size cannot be empty");
        }
        this.size = size;
    }

    @Override
    public void wear() {
        System.out.println("Wearing a shirt, size: " + size);
    }
}

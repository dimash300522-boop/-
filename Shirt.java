public class Shirt extends Clothing {
    private String size;

    public Shirt(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void buy() {
        System.out.println("Zhalgas buys a shirt, size " + size);
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size;
    }
}
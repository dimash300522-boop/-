public class Pants extends Clothing {
    private String material;

    public Pants(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void buy() {
        System.out.println("Zhalgas buys pants made of " + material);
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
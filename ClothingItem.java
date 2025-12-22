public class ClothingItem {
    private int id;
    private String name;
    private String size;
    private double price;
    private int stock;

    public ClothingItem(int id, String name, String size, double price, int stock) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stock -= quantity;
        } else {
            System.out.println("Not enough stock!");
        }
    }
}

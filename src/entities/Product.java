package entities;


public class Product {
    private final String name;
    private final double price;
    private int quantity;


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public double totalValueInStock(double price, int quantity) {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return this.name
                + ", "
                + String.format("%.2f", this.price)
                + ", "
                + this.quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock(this.price, this.quantity));
    }
}

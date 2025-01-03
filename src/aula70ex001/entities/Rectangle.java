package aula70ex001.entities;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String area() {
        return String.format("%.2f", this.width * this.height);
    }

    public String perimeter() {
        return String.format("%.2f", 2 * (this.width + this.height));
    }

    public String diagonal() {
        return String.format("%.2f", Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2)));
    }
}

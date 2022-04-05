package garcia.elvin;

public class Rectangle {
    private double width = 1;
    private double height = 1;

    //constructor
    Rectangle(){};
    Rectangle(double width, double height) {
        if (width > 0) { this.width = width; }
        if (height > 0) { this.height = height; }
    }

    //Setters

    //Getters
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (2 * (this.width + this.height));
    }

    public double getWidth() { return this.width; }
    public  double getHeight() { return this.height; }
}

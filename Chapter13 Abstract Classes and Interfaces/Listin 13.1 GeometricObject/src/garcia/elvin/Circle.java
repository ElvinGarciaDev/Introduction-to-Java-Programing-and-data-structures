package garcia.elvin;

public class Circle extends GeometricObject{
    private double radius;

    // Constructor
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    // Setters
    // Set a new radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getters

    // Return radius
    public double getRadius() {
        return radius;
    }
    // Return area
    public double getArea() {
        return radius * radius * Math.PI;
    }
    // Return diameter
    public double getDiameter() {
        return 2 * radius;
    }
    // Return perimeter
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    // print the circle info
    public void printCirlce() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    // Override the toString method defined in the superclass
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}

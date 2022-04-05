package garcia.elvin;

public class Triangle extends GeometricObject{
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    // Constructor
    Triangle(){};

    /** A constructor that creates a triangle with the specified side1, side2, and side3. */
    Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled); // Calling the constructor in GeometricObject
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** The accessor methods for all three data fields. */
    public double getSide1(){ return this.side1; }
    public double getSide2(){ return this.side2; }
    public double getSide3(){ return this.side3; }

    /** A method named getArea() that returns the area of this triangle. */
    // The area A of a triangle is given by the formula A=12bh where b is the base and h is the height of the triangle.
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** A method named getPerimeter() that returns the perimeter of this triangle. */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /** method named toString() that returns a string description for the triangle. */
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}

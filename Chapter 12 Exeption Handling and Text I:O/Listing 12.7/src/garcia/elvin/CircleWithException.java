package garcia.elvin;

public class CircleWithException {

    // Radius of the circle
    private double radius;

    // Number of objects created
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithException() {
        setRadius(1);
    }

    /** Construct a circle with a specified radius */
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) {
            if (newRadius >= 0)
                this.radius = newRadius;
            else
                throw new IllegalArgumentException("Radius cannot be negative");
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public double findArea() {
        return radius * radius * 3.14159;
    }
}

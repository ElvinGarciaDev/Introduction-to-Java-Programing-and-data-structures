package garcia.elvin;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Construct a default
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Constructor
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //*****************
    // Setters
    //*****************

    // Set a new color
    public void setColor(String color) {
        this.color = color;
    }
    // Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //********************
    // Getters
    //********************

    // Return color
    public String getColor() {
        return color;
    }
    // Return boolean
    public boolean isFilled() {
        return filled;
    }
    // Return date created
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    /** Return a string representation of this object */
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

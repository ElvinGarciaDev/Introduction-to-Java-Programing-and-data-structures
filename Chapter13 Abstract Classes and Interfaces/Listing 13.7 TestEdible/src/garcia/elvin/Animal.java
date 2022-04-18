package garcia.elvin;

abstract class Animal {
    private double weight; // Animal weight

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    /** Return animal sound */
    public abstract String sound();
}

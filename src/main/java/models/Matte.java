package models;

public class Matte extends Node{
    private double reflectivity;

    public Matte(double reflectivity) {
        this.reflectivity = reflectivity;
    }

    public Matte() {
        this(0);
    }

    public double getReflectivity() {
        return reflectivity;
    }

    public void setReflectivity(double reflectivity) {
        this.reflectivity = reflectivity;
    }

    @Override
    public String toString() {
        return "Matte{" + "reflectivity=" + reflectivity + '}';
    }
}

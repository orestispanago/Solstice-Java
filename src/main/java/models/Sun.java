package models;

import models.Pillbox;

public class Sun extends Node{
    private double dni;
    private Pillbox pillbox;

    public Sun() {
        this(1000);
    }

    public Sun(double dni) {
        this.dni = dni;
    }

    public Sun(Pillbox pillbox) {
        this(1000);
        this.pillbox = pillbox;
    }

    public Sun(double dni, Pillbox pillbox) {
        this.dni = dni;
        this.pillbox = pillbox;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public Pillbox getPillbox() {
        return pillbox;
    }

    public void setPillbox(Pillbox pillbox) {
        this.pillbox = pillbox;
    }


    @Override
    public String toString() {
        return "Sun{" + "dni=" + dni + ", pillbox=" + pillbox + '}';
    }


}

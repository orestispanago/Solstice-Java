package models;

public class Pillbox {
    private double half_angle;

    public Pillbox(double half_angle) {
        this.half_angle = half_angle;
    }
    
    public Pillbox() {
        this(0.2664);
    }

    public double getHalf_angle() {
        return half_angle;
    }

    public void setHalf_angle(double half_angle) {
        this.half_angle = half_angle;
    }

    @Override
    public String toString() {
        return "Pillbox{" + "half_angle=" + half_angle + '}';
    }

    
    
}

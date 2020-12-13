package models;

public class Mirror {
    private double reflectivity;
    private double slope_error;

    public Mirror(double reflectivity, double slope_error) {
        this.reflectivity = reflectivity;
        this.slope_error = slope_error;
    }

    public Mirror() {
        this(1,0);
    }

    
    public double getSlope_error() {
        return slope_error;
    }

    public void setSlope_error(double slope_error) {
        this.slope_error = slope_error;
    }

    public double getReflectivity() {
        return reflectivity;
    }

    public void setReflectivity(double reflectivity) {
        this.reflectivity = reflectivity;
    }

    @Override
    public String toString() {
        return "Mirror{" + "reflectivity=" + reflectivity + ", slope_error=" + slope_error + '}';
    }

}

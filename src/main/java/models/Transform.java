package models;

public class Transform {

    private double[] rotation;
    private double[] translation;

    public Transform() {
        this.rotation = new double[3];
        this.translation = new double [3];
    }

    public Transform(double[] rotation) {
        this.rotation = rotation;
        this.translation = new double[3];
    }
    

    public double[] getRotation() {
        return rotation;
    }

    public void setRotation(double[] rotation) {
        this.rotation = rotation;
    }

    public double[] getTranslation() {
        return translation;
    }

    public void setTranslation(double[] translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Transform{" + "rotation=" + rotation + ", translation=" + translation + '}';
    }
    
    
}

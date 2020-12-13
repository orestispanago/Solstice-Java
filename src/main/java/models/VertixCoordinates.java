package models;

import java.util.ArrayList;
import java.util.List;

public class VertixCoordinates {

    private List coords;

    public VertixCoordinates() {
        this.coords = new ArrayList();
    }

    public VertixCoordinates(double x, double y) {
        this();
        this.coords.add(x);
        this.coords.add(y);
    }
    public List getCoords() {
        return coords;
    }

    public void setCoords(List coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "VertixCoordinates{" + "coords=" + coords + '}';
    }

}

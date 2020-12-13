package models;

import java.util.ArrayList;
import java.util.List;

public class Vertices {

    private List vertices;

    public Vertices() {
        this.vertices = new ArrayList();
    }

    public List getVertices() {
        return vertices;
    }

    public void setVertices(List vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Vertices{" + "vertices=" + vertices + '}';
    }

    public void append(VertixCoordinates xy){
        this.vertices.add(xy.getCoords());
    }
}

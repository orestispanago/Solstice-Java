package models;

import java.util.List;

public class Clip {

    private String operation;
    private List vertices;

    public Clip() {
    }

    public Clip(List vertices) {
        this.operation = "AND";
        this.vertices = vertices;
    }

    public Clip(String operation, List vertices) {
        this.operation = operation;
        this.vertices = vertices;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List getVertices() {
        return vertices;
    }

    public void setVertices(List vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "ClipItems{" + "operation=" + operation + ", vertices=" + vertices + '}';
    }

}

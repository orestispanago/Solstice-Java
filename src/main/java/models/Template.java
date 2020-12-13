package models;

import java.util.List;

public class Template {
    private String name;
    private Transform transform;
    private List children;

    public Template(String name) {
        this.name = name;
        this.transform = new Transform();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }

    @Override
    public String toString() {
        return "Entity{" + "name=" + name + ", transform=" + transform + '}';
    }

}

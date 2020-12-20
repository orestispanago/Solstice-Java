package models;

import java.util.List;

public class Entity extends Node {

    private String name;
    private Transform transform;
    private List geometry;
    private List children;
    private int primary;

    public Entity(String name) {
        this.name = name;
        this.transform = new Transform();
        this.primary = 1;
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

    public List getGeometry() {
        return geometry;
    }

    public void setGeometry(List geometry) {
        this.geometry = geometry;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public int getPrimary() {
        return primary;
    }

    public void setPrimary(int primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        return "Entity{" + "name=" + name + ", transform=" + transform + ", geometry=" + geometry + ", children=" + children + ", primary=" + primary + '}';
    }

}

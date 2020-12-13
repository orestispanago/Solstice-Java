package models;

public class Material extends Node{

    private Object back;
    private Object front;

    public Material(Object back, Object front) {
        this.back = back;
        this.front = front;
    }

    public Object getBack() {
        return back;
    }

    public void setBack(Object back) {
        this.back = back;
    }

    public Object getFront() {
        return front;
    }

    public void setFront(Object front) {
        this.front = front;
    }

    
    @Override
    public String toString() {
        return "Material{" + "back=" + back + ", front=" + front + '}';
    }

}

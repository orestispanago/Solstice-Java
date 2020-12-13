package models;

import java.util.HashMap;

public class Material extends Node{

    private HashMap back;
    private HashMap front;

    public Material(Node back, Node front) {
        this.back = back.toHashMap();
        this.front = front.toHashMap();
    }

    public HashMap getBack() {
        return back;
    }

    public void setBack(HashMap back) {
        this.back = back;
    }

    public HashMap getFront() {
        return front;
    }

    public void setFront(HashMap front) {
        this.front = front;
    }


    @Override
    public String toString() {
        return "Material{" + "back=" + back + ", front=" + front + '}';
    }

}

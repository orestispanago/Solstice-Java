package models;

import java.util.ArrayList;
import java.util.List;

public class GeometryItem {

    private Material material;
    private Plane plane;

    public GeometryItem(Material material, Plane plane) {
        this.material = material;
        this.plane = plane;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public String toString() {
        return "GeometryItem{" + "material=" + material + ", plane=" + plane + '}';
    }

    public List toList() {
        List theList = new ArrayList();
        theList.add(this.material);
        theList.add(this.plane);
        return theList;
    }
}

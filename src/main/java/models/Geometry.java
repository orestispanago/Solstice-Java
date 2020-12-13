package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Geometry extends Node{

    private List geometryList;

    public Geometry() {
        this.geometryList = new ArrayList();
    }

    public List getGeometryList() {
        return geometryList;
    }

    public void setGeometryList(List geometryList) {
        this.geometryList = geometryList;
    }

    @Override
    public String toString() {
        return "Geometry{" + "geometryList=" + geometryList + '}';
    }
    
    public void append(GeometryItem geometryItem){
        this.geometryList.add(geometryItem);
    }
    
    @Override
    public HashMap<String, Object> toHashMap() {
        String name = this.getClass().getSimpleName().toLowerCase();
        HashMap<String, Object> theMap = new HashMap<String, Object>();
        theMap.put(name, this.geometryList);
        return theMap;
    }
}

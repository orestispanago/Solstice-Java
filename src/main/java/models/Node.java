package models;

import java.util.HashMap;

public class Node {

    public HashMap<String, Object> toHashMap() {
        String name = this.getClass().getSimpleName().toLowerCase();
        HashMap<String, Object> theMap = new HashMap<String, Object>();
        theMap.put(name, this);
        return theMap;
    }
}

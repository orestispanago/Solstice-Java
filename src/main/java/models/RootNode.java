package models;

import java.util.ArrayList;
import java.util.List;

public class RootNode {
    private List nodes;

    public RootNode() {
        this.nodes = new ArrayList();
    }

    public List getNodes() {
        return nodes;
    }

    public void setNodes(List nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "RootNode{" + "nodes=" + nodes + '}';
    }

    public void append(Node node){
        this.nodes.add(node.toHashMap());
    }
}

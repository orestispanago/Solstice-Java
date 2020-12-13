package com.op.solstice;

import models.Sun;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Clip;
import models.Geometry;
import models.GeometryItem;
import models.Material;
import models.Matte;
import models.Mirror;
import models.Pillbox;
import models.Plane;
import models.RootNode;
import models.Vertices;
import models.VertixCoordinates;
import org.yaml.snakeyaml.Yaml;

public class MainClass {

    public static void write(RootNode rootnode, String filename) throws IOException{
//        representer.addClassTag(Node.class, Tag.MAP);
        Yaml yaml = new Yaml(new SolsticeRepresenter());
        FileWriter writer = new FileWriter(filename);
        yaml.dump(rootnode.getNodes(), writer);
    }

    public static void main(String[] args) throws IOException{
        RootNode rootNode = new RootNode();
        Pillbox pillbox = new Pillbox();
        Sun sun = new Sun(1200, pillbox);
        Matte matte = new Matte();
        Mirror mirror = new Mirror();
        Material materialSpecular = new Material(mirror, mirror);
        Material materialBlack = new Material(matte, matte);
        
        VertixCoordinates xy = new VertixCoordinates(0, 0);
        Vertices myVertices = new Vertices();
        myVertices.append(xy);
        myVertices.append(new VertixCoordinates(0, 0));
        
        Geometry geometry = new Geometry();
        
        Clip clip = new Clip(myVertices.getVertices());
//        clip.append(clipItem);
        List clipList = new ArrayList();
        clipList.add(clip);
        Plane plane = new Plane(clipList);
        GeometryItem geometryItem = new GeometryItem(materialBlack, plane);

        geometry.append(geometryItem);
        
        rootNode.append(sun);
        rootNode.append(materialSpecular);
        rootNode.append(materialBlack);
        rootNode.append(geometry);
        VertixCoordinates xy1 = new VertixCoordinates(2,4);
        myVertices.append(xy1);
//        exportObject("blabla.yaml");
        write(rootNode, "blabla.yaml");
    }

}

package com.op.solstice;

import models.Sun;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Clip;
import models.Entity;
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
import services.EntityService;
import static services.SolsticeService.exportObj;
import services.YamlService;

public class MainClass {

    public static void main(String[] args) throws IOException, InterruptedException {
        EntityService es = new EntityService();

        RootNode rootNode = new RootNode();
        Pillbox pillbox = new Pillbox();
        Sun sun = new Sun(1200, pillbox);
        Matte matte = new Matte();
        Mirror mirror = new Mirror();
        Material materialSpecular = new Material(mirror, mirror);
        Material materialBlack = new Material(matte, matte);

        VertixCoordinates xy = new VertixCoordinates(1, 2);
        Vertices myVertices = new Vertices();
        myVertices.append(xy);
        myVertices.append(new VertixCoordinates(1, 1));
        myVertices.append(new VertixCoordinates(1, 1));
        myVertices.append(new VertixCoordinates(1, 1));

        Geometry geometry = new Geometry();

        Clip clip = new Clip(myVertices.getVertices());
//        clip.append(clipItem);
        List clipList = new ArrayList();
        clipList.add(clip);
        Plane plane = new Plane(clipList);
        GeometryItem geometryItem = new GeometryItem(materialBlack, plane);
        geometry.append(geometryItem);

        Entity entity = new Entity("entity1");
        entity.setGeometry(geometry.getGeometryList());
        entity.setPrimary(0);
        rootNode.append(sun);
        rootNode.append(materialSpecular);
        rootNode.append(materialBlack);
        rootNode.append(geometry);
        rootNode.append(entity);

        YamlService.write(rootNode, "blabla.yaml");
//        run_cmd("solstice -h");
        exportObj(0.0,0.0);
    }

}

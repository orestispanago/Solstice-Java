package services;

import java.io.FileWriter;
import java.io.IOException;
import models.RootNode;
import org.yaml.snakeyaml.Yaml;

public class YamlService {

    public static void write(RootNode rootnode, String filename) throws IOException {
//        representer.addClassTag(Node.class, Tag.MAP);
        Yaml yaml = new Yaml(new SolsticeRepresenter());
        FileWriter writer = new FileWriter(filename);
        yaml.dump(rootnode.getNodes(), writer);
    }
}

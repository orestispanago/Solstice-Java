package services;

import java.io.IOException;
import java.util.Map;

public class SolsticeService {

    public static void setPaths(ProcessBuilder pb) {
        Map<String, String> env = pb.environment();
        String PATH = System.getenv("PATH");
        PATH += ":/home/orestis/Programs/Solstice-0.9.0-GNU-Linux64/bin";
        env.put("PATH", PATH);
        env.put("LD_LIBRARY_PATH", "/home/orestis/Programs/Solstice-0.9.0-GNU-Linux64/lib");
        env.put("MANPATH", "/home/orestis/Programs/Solstice-0.9.0-GNU-Linux64/share/man");
        System.out.println(env);
    }

    public static void run(String cmd) throws IOException {
        String[] cmdArr = cmd.split(" ");
        ProcessBuilder pb = new ProcessBuilder().inheritIO().command(cmdArr);
        pb.redirectErrorStream(true);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
//        setPaths(pb);
//        File logFile = new File("out.txt");
//        pb.redirectOutput(logFile);
        pb.start();
    }

    public static void exportObj(Double az, Double zen) throws IOException {
        String objCmd = "solstice -n 1 -g format=obj -t1 -D " + az + "," + zen
                + " -R receiver.yaml blabla.yaml";
        run(objCmd);
    }
}

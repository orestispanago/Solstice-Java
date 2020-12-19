package services;

import java.io.IOException;

public class SolsticeService {

    public static void run(String cmd) throws IOException {
        String[] cmdArr = cmd.split(" ");
        ProcessBuilder pb = new ProcessBuilder().inheritIO().command(cmdArr);
        pb.redirectErrorStream(true);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
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

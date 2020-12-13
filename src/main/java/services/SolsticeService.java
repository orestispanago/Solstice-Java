package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolsticeService {

    public static void run_solstice() throws IOException, InterruptedException {

        String cmd = "solstice -h";
        final Process p = Runtime.getRuntime().exec(cmd);

        new Thread(new Runnable() {
            public void run() {
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = null;

                try {
                    while ((line = input.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        p.waitFor();
    }
}

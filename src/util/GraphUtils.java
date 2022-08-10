package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GraphUtils {
    public static void printGraph(String graph) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("output.dot"))) {
            out.write(graph);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

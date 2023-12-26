package Tutorial.TUT9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        try {
            PrintWriter input = new PrintWriter("input.txt");
            input.println("Hello");
            input.println("");
            input.println("World");
            input.close();
            Scanner sc = new Scanner(new File("input.txt"));
            PrintWriter w = new PrintWriter("output.txt");
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (!s.isEmpty()) {
                    w.println(s);
                }
            }
            w.close();
        } catch (Exception e) {

        }
    }
}

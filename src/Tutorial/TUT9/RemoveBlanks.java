package Tutorial.TUT9;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveBlanks {
    public static void main(String[] args) {
        try {
            PrintWriter input = new PrintWriter("src/tut9/input.txt");
            input.println("Hello");
            input.println("My name is Tuan.");
            input.println("");
            input.print("Goodbye");
            input.close();
            Scanner sc = new Scanner(new File("src/tut9/input.txt"));
            PrintWriter output = new PrintWriter("src/tut9output.txt");
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if (s.isEmpty()) {
                    continue;
                }
                output.println(s);

            }
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

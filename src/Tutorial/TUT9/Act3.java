package Tutorial.TUT9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter mary = new PrintWriter("mary.txt");
        mary.println("Mary had a little lamb\n" +
                "Whose fleece was white as snow.\n" +
                "And everywhere that Mary went,\n" +
                "The lamb was sure to go!");
        mary.close();
        Scanner sc = new Scanner(new File("mary.txt"));
        PrintWriter w = new PrintWriter("mary2.txt");
        int lineNumber = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            w.println(lineNumber + ". " + s);
            lineNumber++;
        }
        w.close();
    }
}

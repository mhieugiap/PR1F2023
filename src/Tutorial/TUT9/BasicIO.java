package Tutorial.TUT9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter w = new PrintWriter("src\\Tutorial\\TUT9\\hello.txt");
        w.println("Hello, world!");
        w.close();
        File hello = new File("src\\Tutorial\\TUT9\\hello.txt");
        Scanner sc = new Scanner(hello);
        String s = sc.nextLine();
        sc.close();
        System.out.println(s);

    }

}

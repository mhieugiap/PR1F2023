package Tutorial.TUT7;

import java.util.Scanner;

public class RecursiveStringReverse {
    public static String reverse(String s){
        if (s.length() == 0){
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The reverse string is: " + reverse(s));
    }
}

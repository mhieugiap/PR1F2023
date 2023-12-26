package Tutorial.TUT7;

import java.util.Scanner;

public class ThousandSeparatingComma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean gotIt = false; //condition to check if an input is invalid
        while (!gotIt) {
            try {
                System.out.print("Please enter an integer between 1000 and 999999: ");
                n = sc.nextInt();
                gotIt = (n > 999 && n < 1000000); //set the condition to for valid input
            } catch (Exception e) {
                System.out.println("Invalid input detected: " + sc.nextLine());
            }
        }
        String s = Integer.toString(n);
        s = s.substring(0, s.length() - 3) + "," + s.substring(s.length() - 3);
        System.out.println(s);
    }
}

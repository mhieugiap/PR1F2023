package Tutorial.TUT5;

import java.util.Scanner;

public class FilledAndHollowSquare {
    public static void repeat(char c, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (3 - 10): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            repeat('*', n);
            System.out.print(' ');
            repeat('*', 1);
            if (i == 0 || i == n - 1) {
                repeat('*', n - 2);
            } else {
                repeat(' ', n - 2);
            }
            repeat('*', 1);
            System.out.println();
        }
    }
}

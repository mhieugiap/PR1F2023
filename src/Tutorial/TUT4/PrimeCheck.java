package Tutorial.TUT4;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;

        System.out.print("Enter positive integer: ");
        int c = sc.nextInt();
        if (c < 0) {
            System.out.println("It is not a positive integer.");
        } else if (c < 2) {
            isPrime = false;
            System.out.println(c + " is not a prime number.");
        } else {
            for (int i = 2; i < c; i++) {
                if (c % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(c + " is a prime number.");
            } else System.out.println(c + " is not a prime number.");
        }
    }
}

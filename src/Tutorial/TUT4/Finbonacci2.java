package Tutorial.TUT4;

import java.util.Scanner;

public class Finbonacci2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of elements in your Fibonacci series: ");
        int size = sc.nextInt();
        int p2 = -1;
        int p1 = 1;
        for (int i = 0; i < size; i++) {
            int fibo = p2 + p1;
            System.out.print(fibo + " ");
            p2 = p1;
            p1 = fibo;
        }
    }
}

package Tutorial.TUT4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the total number of elements in your Fibonacci series: ");
        int size = sc.nextInt();
        int[] fibonacci = new int[size];
        fibonacci[0] = 0;
        System.out.print(fibonacci[0] + " ");
        fibonacci[1] = 1;
        System.out.print(fibonacci[1] + " ");
        for (int i = 2; i < size; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//        for (int i = 2; i < size; i++){
//            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
//        }
//        for (int e : fibonacci){
//            System.out.print(e + " ");
//        }
    }
}

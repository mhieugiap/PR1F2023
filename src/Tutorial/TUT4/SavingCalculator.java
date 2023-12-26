package Tutorial.TUT4;

import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money? ");
        double money = sc.nextDouble();
        System.out.print("How many years do you want to deposit your money? ");
        int year = sc.nextInt();
        System.out.print("What's the interest rate (%)?");
        double rate = sc.nextDouble();
        for (int i = 0; i < year; i++) {
            money *= (1 + (rate / 100));
        }
        System.out.println("After " + year + " years, you'll receive " + Math.floor(money * 100) / 100);
    }
}

package Tutorial.TUT4;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        int[] a = new int[1000];
        int j = 1000;
        for (int i = 0; i < a.length; i++) {
            a[i] = j;
            j++;
        }
        for (int value : a) {
            boolean isPrime = true;
            for (int k = 2; k < value; k++) {
                if (value % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(value);
        }
    }
}

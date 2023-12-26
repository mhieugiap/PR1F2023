package Tutorial.TUT4;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) a = -a;
//        int x = 1; // 10, 100, 1000...
//        int c = 0; // number of digits
//        if (a < 2) {
//            c = 1;
//        } else {
//            while (a > x && x <= 1000000000) {
//                c++;
//                x = x * 10;
////                System.out.println(x);
//            }
//        }
//        System.out.println(c + " digits");
        String str = Integer.toString(a);
        System.out.println(str.length());
    }
}

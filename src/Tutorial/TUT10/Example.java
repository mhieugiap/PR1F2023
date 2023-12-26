package Tutorial.TUT10;

public class Example {
    public static void main(String[] args) {
        String s1 = "Hieu";
        String s2 = "Twenty-one";
        int n = 2345;
        double d = 3.1419;
        System.out.printf("%.3f", d);
        System.out.format("%10.2s", s1);
        System.out.printf("%010d", n);
        System.out.printf("%2$10s %1$-10s", s1, s2);
        System.out.printf("My name is %2$-5.2s, i'm %1$10.3s", s1, s2);
    }
}

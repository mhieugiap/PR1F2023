package Tutorial.TUT7;

public class RecursiveDec2Bin {
    public static String toBinary(int n){
        if (n == 0) return "0";
        else if (n == 1) return "1";
        else {
            int remainder = n%2;
            return toBinary(n/2) + remainder;
        }
    }

    public static void main(String[] args) {
        System.out.println(toBinary(0));
        System.out.println(toBinary(1));
        System.out.println(toBinary(2));
        System.out.println(toBinary(3));
        System.out.println(toBinary(4));
        System.out.println(toBinary(453));
        System.out.println(toBinary(20013));
    }
}

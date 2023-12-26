package Tutorial.TUT8;

public class CountLastDigit {
    public static int[] countLastDigits(int[] a) {
        int[] count = new int[10];
        for (int x : a) {
            int d = x % 10; // get last digit
            // increase count for that digit
            count[d]++;
        }
        return count; // return statement
    }

    public static void main(String[] args) {
        int[] sample = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        int[] result = countLastDigits(sample);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}

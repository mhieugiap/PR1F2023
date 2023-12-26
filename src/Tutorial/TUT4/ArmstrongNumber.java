package Tutorial.TUT4;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = 0;
            for (int j = i; j > 0; j /= 10) {
                sum += (int) Math.pow((j % 10), 3);

            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

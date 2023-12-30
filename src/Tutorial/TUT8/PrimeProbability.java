package Tutorial.TUT8;

public class PrimeProbability {
    /*
     Generate random integer between 2 and 1000 (inclusive)
     0 <= Math.random() < 1
     0 <= Math.random() * 999 < 999
     2 <= Math.random() * 999 + 2 < 1001
     2 <= (int) (Math.random() * 999 + 2) <= 1000
     */
    public static int randomInt() {
        return (int) (Math.random() * 999 + 2);
    }

    /*
     Check if the input number is prime
     */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeProb(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(randomInt())) {
                count++;
            }
        }
        System.out.println("Among " + n + " random integers, " +
                count + " are prime numbers");
        System.out.println("Probability is " + count + "%.");
    }

    public static void main(String[] args) {
        int n = 100;
        primeProb(n);
    }
}

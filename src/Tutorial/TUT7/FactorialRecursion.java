package Tutorial.TUT7;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        //n! = n*(n-1)*(n-2)*...*2*1
        //factorial(n) = n * factorial(n-1) -> (n-1) * factorial(n-2)...2*factorial(1)
        if (n == 1) return 1; //base case
        else return n * factorial(n - 1);
    }
}

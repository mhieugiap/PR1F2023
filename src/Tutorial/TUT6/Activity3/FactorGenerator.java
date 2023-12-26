package Tutorial.TUT6.Activity3;

public class FactorGenerator {
    int n; // the number to factor
    int f; // the factor

    public FactorGenerator(int numberToFactor) {
        n = numberToFactor;
        f = 2;
    }

    public int nextFactor() {
        // this while loop makes sure n is divisible by f
        // n = 1
        // f = -1
        // describe the running of this while loop
        while (n % f != 0) {
            f++;
        }
        n = n / f;
        return f;
    }

    //To check whether we have other factors
    public boolean hasMoreFactors() {
        return (n > 1);
    }
}

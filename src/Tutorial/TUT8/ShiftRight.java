package Tutorial.TUT8;

public class ShiftRight {
    /**
     * Returning a new array, not modifying input array
     */
    public static void shiftRight(int[] a) {
        int lastElement = a[a.length - 1];
        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
            a[i - 1] = a[i];
        }
        a[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4};
        shiftRight(sample);
        for (int r : sample) {
            System.out.print(r + " ");
        }
    }
}

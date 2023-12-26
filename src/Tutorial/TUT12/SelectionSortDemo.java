package Tutorial.TUT12;

import java.util.Arrays;

public class SelectionSortDemo {
    static int[] selectionSort(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[p]) {
                    p = j;
                }
            }
            b[i] = a[p];
            a[p] = a[i];
        }
        return b;
    }

    static void selectionSortB(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[p]) {
                    p = j;
                }
            }
            int tmp = a[i];
            a[i] = a[p];
            a[p] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] test = {2, 7, 4, 12, 0, 3, -5};
        test = selectionSort(test);
        System.out.println(Arrays.toString(test));

        int[] test2 = {2, 7, 4, 12, 0, 3, -5};
        selectionSortB(test2);
        System.out.println(Arrays.toString(test2));
    }
}

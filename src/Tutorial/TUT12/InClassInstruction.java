package Tutorial.TUT12;

import java.util.*;

public class InClassInstruction {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(4, 5, 6, 7));
        HashSet<Integer> c = intersect(a, b);
        System.out.println(c);
        int[] arr = {1, 2, 3, 4, 5, 9};
        int search = binarySearch(arr, 8, 0, arr.length);
        System.out.println(search);
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    public static int[] selectionSort(int[] a) {
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

    public static int binarySearch(int[] arr, int k, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (arr[mid] == k) {
            return mid;
        } else if (arr[mid] > k) {
            return binarySearch(arr, k, low, mid - 1);
        } else {
            return binarySearch(arr, k, mid + 1, high);
        }
    }

    public static HashSet<Integer> intersect(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> c = new HashSet<>();
        if (a.size() > b.size()) {
            HashSet<Integer> x = a;
            a = b;
            b = x;
        }
        for (int x : a
        ) {
            if (b.contains(x)) {
                c.add(x);
            }
        }
        return c;
    }
}

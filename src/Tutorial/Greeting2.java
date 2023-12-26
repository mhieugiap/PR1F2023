package Tutorial;

import java.util.*;

public class Greeting2 {
    public static int swap(int[] num) {
        HashSet<Integer> s = new HashSet<>();
        for (int e : num) {
            s.add(e);
        }
        int i = 0;
        for (int e : s) {
            num[i] = e;
            i++;
        }
        return s.size();
    }

    public static void main(String[] args) {
        int[] n = {1, 1, 2};
        System.out.println(swap(n));
    }
}

package Tutorial.TUT8.Instructions;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Grade gradeA;
        gradeA = Grade.GOOD;
        Grade gradeB = Grade.DECENT;
        Grade[] gradeList = Grade.values();
        System.out.println(gradeList[1]);
        for (int j = 0; j < gradeList.length; j++) {
            System.out.println(gradeList[j]);
        }
        //primitive: int, double, float
        //Wrapper Class: Integer, Double, Float
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.remove(0);
        arr.get(0);
        arr.set(0, 6);
        arr.size();

        ArrayList<Integer> arr2 = new ArrayList<>(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        String s = "abc";
        s += "d"; //-> s = "abcd"

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.reverse();
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);


    }
}

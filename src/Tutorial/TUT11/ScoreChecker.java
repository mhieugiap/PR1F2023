package Tutorial.TUT11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreChecker {
    public static void main(String[] args) {
        Map<String, Double> scoreList = new TreeMap<>();
        scoreList.put("giap", 8.0);
        scoreList.put("minh", 7.5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if (scoreList.containsKey(name.toLowerCase())) {
            System.out.println("Your score is: " + scoreList.get(name.toLowerCase()));
        } else System.out.println("Score not found or incorrect name. Please check again!");

    }
}

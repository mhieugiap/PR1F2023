package Tutorial.TUT11;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class EngVieDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("morning", "Buổi sáng");
        dictionary.put("afternoon", "Buổi chiều");
        dictionary.put("school", "Trường học");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an English word: ");
            String engWord = sc.nextLine();
            if (dictionary.containsKey(engWord.toLowerCase())) {
                System.out.println("Vietnamese meaning: " + dictionary.get(engWord.toLowerCase()));
            } else System.out.println("Meaning not found.");
            System.out.print("Do you want to continue? (1 if \'Yes\', else \'No\') ");
            int choice = sc.nextInt();
            if (choice != 1) {
                System.out.println("Good bye!");
                break;
            }
            sc.nextLine();
        }
    }

}

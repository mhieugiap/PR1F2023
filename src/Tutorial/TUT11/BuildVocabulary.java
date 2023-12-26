package Tutorial.TUT11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BuildVocabulary {
    public static String removePunctuations(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isWhitespace(c) || c == '\'') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("story.txt"));
        String text = "";
        while (sc.hasNext()) {
            text += sc.nextLine() + " ";
        }
        text = removePunctuations(text).toLowerCase();
        String[] words = text.split(" ");
        Set<String> vocab = new TreeSet<>();
        Collections.addAll(vocab, words);
        vocab.remove("");
        System.out.println(vocab);

    }
}

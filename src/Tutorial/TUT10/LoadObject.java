package Tutorial.TUT10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> arr = (ArrayList<String>) ois.readObject();
            for (String s : arr) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

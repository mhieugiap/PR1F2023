package Tutorial.TUT10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveObject {
    public static void main(String[] args) {
        try {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("PR1");
            arr.add("POP");
            arr.add("PCO");
            FileOutputStream fos = new FileOutputStream("data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arr);
            System.out.print("Successfully serialize object");
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

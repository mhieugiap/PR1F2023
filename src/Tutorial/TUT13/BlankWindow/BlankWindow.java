package Tutorial.TUT13.BlankWindow;

import javax.swing.*;
import java.awt.*;

public class BlankWindow {
    public static void main(String[] args) {
        JFrame f = new JFrame("Demo");
        JPanel p = new BlankPanel();
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

package Tutorial.TUT13.RedCross;

import javax.swing.*;

public class RedCross {
    public static void main(String[] args) {
        JFrame f = new JFrame("RedCross Demo");
        JPanel p = new RedCrossPanel();
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null); // center the frame
        // make the program terminate when window closes
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make the window visible
        f.setVisible(true);
    }
}

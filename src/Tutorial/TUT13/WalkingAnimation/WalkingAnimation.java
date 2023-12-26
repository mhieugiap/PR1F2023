package Tutorial.TUT13.WalkingAnimation;

import javax.swing.*;
import java.io.IOException;

public class WalkingAnimation {
    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame f = new JFrame("Walking Animation Demo");
        JPanel p = new WalkingAnimationPanel();
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        while (true) {
            p.repaint();
            Thread.sleep(30);
        }
    }
}


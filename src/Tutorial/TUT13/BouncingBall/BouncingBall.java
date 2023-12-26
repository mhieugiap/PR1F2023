package Tutorial.TUT13.BouncingBall;

import javax.swing.*;
import java.awt.*;

public class BouncingBall {
    public static void main(String[] args) throws InterruptedException {
        JFrame f = new JFrame("Bouncing ball");
        JPanel p = new BouncingBallPanel();
        f.add(p, BorderLayout.CENTER);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        while (true) {
            Thread.sleep(5);
            p.repaint(); // refresh
        }
    }
}

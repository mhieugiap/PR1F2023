package Tutorial.TUT13.BouncingBall;

import javax.swing.*;
import java.awt.*;

public class BouncingBallPanel extends JPanel {

    private int posX;
    private int ballDiameter;
    private int posY;
    private int direction = 2;

    public BouncingBallPanel() {
        setPreferredSize(new Dimension(450, 450));
        ballDiameter = 150;
        posX = 0;
        System.out.println(getHeight());
        posY = (450 - ballDiameter) / 2;
    }

    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        g.fillOval(posX, posY, ballDiameter, ballDiameter);
        posX += direction;
        if (posX + ballDiameter >= getWidth() || posX <= 0) {
            direction = -direction;
        }
    }
}

package Tutorial.TUT13.RedCross;

import javax.swing.*;
import java.awt.*;

public class RedCrossPanel extends JPanel {
    public RedCrossPanel() {
        setPreferredSize(new Dimension(450, 450));
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(0, 0, 450, 450);
        g.setColor(Color.WHITE);
        g.fillRect((450 - 110) / 2, (450 - 300) / 2, 110, 300);
        g.fillRect((450 - 300) / 2, (450 - 110) / 2, 300, 110);

    }
}

package Tutorial.TUT13.Demo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DemoPanel extends JPanel {
    BufferedImage img;

    public DemoPanel() throws IOException {
        img = ImageIO.read(new File("pokemon_trainer.png"));

    }


    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, null);

    }
}

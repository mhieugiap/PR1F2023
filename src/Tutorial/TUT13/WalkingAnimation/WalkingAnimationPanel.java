package Tutorial.TUT13.WalkingAnimation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WalkingAnimationPanel extends JPanel {
    BufferedImage[] sprites;
    int index;

    public WalkingAnimationPanel() throws IOException {
        setPreferredSize(new Dimension(420, 420));
        index = 0;
        sprites = new BufferedImage[3];
        BufferedImage full = ImageIO.read(new File("sprites.png"));
        int partialWidth = full.getWidth() / sprites.length;
        int partialHeight = full.getHeight();
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = full.getSubimage(i * partialWidth, 0, partialWidth, partialHeight);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clear panel
        BufferedImage partial = sprites[index];
        int x = (getWidth() - partial.getWidth()) / 2;
        int y = (getHeight() - partial.getHeight()) / 2;
        g.drawImage(partial, x, y, null);
        index = (index + 1) % sprites.length;
    }
}

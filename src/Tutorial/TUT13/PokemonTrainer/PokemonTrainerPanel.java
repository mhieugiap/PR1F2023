package Tutorial.TUT13.PokemonTrainer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PokemonTrainerPanel extends JPanel {
    BufferedImage img;

    public PokemonTrainerPanel() throws IOException {
        img = ImageIO.read(new File("pokemon_trainer.png"));
        setPreferredSize(new Dimension(450, 450));
    }

    @Override
    public void paintComponent(Graphics g) {
        int x = (getWidth() - img.getWidth()) / 2;
        int y = (getHeight() - img.getHeight()) / 2;
        g.drawImage(img, x, y, null);
    }
}


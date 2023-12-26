package Tutorial.TUT13.PokemonTrainer;

import javax.swing.*;
import java.io.IOException;

public class PokemonTrainer {
    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame("Pokemon Trainer Demo");
        JPanel p = new PokemonTrainerPanel();
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null); // center the frame
        // make the program terminate when window closes
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make the window visible
        f.setVisible(true);
    }
}


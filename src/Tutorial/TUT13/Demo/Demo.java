package Tutorial.TUT13.Demo;

import Tutorial.TUT13.BlankWindow.BlankPanel;
import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame("Demo");
        JPanel p = new DemoPanel();
        f.setSize(450, 450);
        f.add(p, BorderLayout.CENTER);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

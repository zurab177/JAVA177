import java.awt.*;
import javax.swing.*;

public class Task3Swing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello Java Applet", 100, 150);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task3");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task3Swing());
        f.setVisible(true);
    }
}
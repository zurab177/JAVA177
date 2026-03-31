import java.awt.*;
import javax.swing.*;

public class Task8Swing extends JPanel {

    int x = 0;

    public Task8Swing() {
        new Timer(100, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        }).start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task8");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task8Swing());
        f.setVisible(true);
    }
}
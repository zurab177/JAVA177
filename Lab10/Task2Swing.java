import java.awt.*;
import javax.swing.*;

public class Task2Swing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 60);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 80, 80);

        g.setColor(Color.BLUE);
        g.drawLine(50, 180, 300, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task2");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task2Swing());
        f.setVisible(true);
    }
}
import java.awt.*;
import javax.swing.*;

public class Task7Swing extends JPanel {

    Color color = Color.BLACK;

    public Task7Swing() {
        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        red.addActionListener(e -> { color = Color.RED; repaint(); });
        green.addActionListener(e -> { color = Color.GREEN; repaint(); });
        blue.addActionListener(e -> { color = Color.BLUE; repaint(); });

        add(red);
        add(green);
        add(blue);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(150, 100, 80, 80);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task7");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task7Swing());
        f.setVisible(true);
    }
}
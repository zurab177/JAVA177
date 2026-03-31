import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task9Swing extends JPanel {

    int x = 0, y = 0;

    public Task9Swing() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task9");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task9Swing());
        f.setVisible(true);
    }
}
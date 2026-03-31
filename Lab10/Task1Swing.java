import javax.swing.*;
import java.awt.*;

public class Task1Swing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Прямоугольник
        g.drawRect(50, 50, 120, 60);
        g.drawString("Прямоугольник", 50, 40);

        // Круг
        g.drawOval(220, 50, 80, 80);
        g.drawString("Круг", 220, 40);

        // Линия
        g.drawLine(50, 180, 300, 180);
        g.drawString("Линия", 50, 170);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Task1Swing());
        frame.setVisible(true);
    }
}
import java.awt.*;
import javax.swing.*;

public class Task10Swing extends JPanel {

    String text = "";
    Color color = Color.BLACK;

    public Task10Swing() {
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("OK");

        btn.addActionListener(e -> {
            text = tf.getText();
            color = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
            );
            repaint();
        });

        add(tf);
        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(150, 100, 100, 50);

        g.setColor(Color.BLACK);
        g.drawString(text, 150, 90);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Task10Swing());
        f.setVisible(true);
    }
}
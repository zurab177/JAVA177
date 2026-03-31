import java.awt.*;
import javax.swing.*;

public class Task5Swing extends JFrame {

    int count = 0;
    JLabel label;

    public Task5Swing() {
        setLayout(new FlowLayout());

        JButton btn = new JButton("Click");
        label = new JLabel("Count: 0");

        add(btn);
        add(label);

        btn.addActionListener(e -> {
            count++;
            label.setText("Count: " + count);
        });

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task5Swing();
    }
}
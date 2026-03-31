import java.awt.*;
import javax.swing.*;

public class Task4Swing extends JFrame {

    JLabel label;

    public Task4Swing() {
        setLayout(new FlowLayout());

        JButton btn = new JButton("Нажми");
        label = new JLabel("");

        add(btn);
        add(label);

        btn.addActionListener(e -> label.setText("Кнопка нажата!"));

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task4Swing();
    }
}
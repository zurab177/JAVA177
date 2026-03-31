import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Калькулятор");
        JTextField field = new JTextField();

        JButton btn = new JButton("=");

        frame.setSize(300, 200);
        frame.setLayout(null);

        field.setBounds(50, 30, 200, 30);
        btn.setBounds(100, 80, 80, 30);

        frame.add(field);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] parts = field.getText().split("\\+");
                    double a = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                    field.setText(String.valueOf(a + b));
                } catch (Exception ex) {
                    field.setText("Ошибка");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
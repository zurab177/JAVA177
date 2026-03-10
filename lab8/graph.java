import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class graph extends JPanel {
    private int[][] adjMatrix;
    private int n;
    private int radius = 20; // радиус вершин

    public graph(int[][] adjMatrix, int n) {
        this.adjMatrix = adjMatrix;
        this.n = n;
        setPreferredSize(new Dimension(600, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // координаты вершин по кругу
        int centerX = 300;
        int centerY = 300;
        int circleRadius = 200;

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            double angle = 2 * Math.PI * i / n;
            x[i] = centerX + (int)(circleRadius * Math.cos(angle));
            y[i] = centerY + (int)(circleRadius * Math.sin(angle));
        }

        // рисуем ребра
        g.setColor(Color.BLACK);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (adjMatrix[i][j] == 1) {
                    g.drawLine(x[i], y[i], x[j], y[j]);
                }
            }
        }

        // рисуем вершины
        g.setColor(Color.RED);
        for (int i = 0; i < n; i++) {
            g.fillOval(x[i] - radius, y[i] - radius, 2 * radius, 2 * radius);
            g.setColor(Color.BLACK);
            g.drawString("" + i, x[i] - 5, y[i] + 5);
            g.setColor(Color.RED);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество вершин: ");
        int n = scanner.nextInt();
        int[][] adjMatrix = new int[n][n];

        System.out.println("Введите матрицу смежности (0 или 1 для каждого ребра):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjMatrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        JFrame frame = new JFrame("Граф");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new graph(adjMatrix, n));
        frame.pack();
        frame.setVisible(true);
    }
}
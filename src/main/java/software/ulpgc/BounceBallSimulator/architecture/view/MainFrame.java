package software.ulpgc.BounceBallSimulator.architecture.view;

import software.ulpgc.BounceBallSimulator.architecture.model.Ball;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final BallPanel ballPanel;

    public MainFrame(Ball ball) {
        setTitle("Bounce Ball Simulator");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Bounce Ball Simulator", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        ballPanel = new BallPanel(ball);
        add(ballPanel, BorderLayout.CENTER);
    }

    public void update() {
        ballPanel.repaint();
    }

    private static class BallPanel extends JPanel {
        private final Ball ball;

        public BallPanel(Ball ball) {
            this.ball = ball;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.GREEN);

            g.setColor(Color.BLACK); // Pelota roja
            int ballY = (int) (getHeight() - ball.getHeight() - ball.getSize() - 50);
            int ballX = getWidth() / 2;
            g.fillOval(ballX - (int) (ball.getSize() / 2), ballY, (int) ball.getSize(), (int) ball.getSize());
        }
    }
}
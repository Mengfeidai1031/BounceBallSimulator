package software.ulpgc.BounceBallSimulator.architecture.control;

import software.ulpgc.BounceBallSimulator.architecture.model.Ball;
import software.ulpgc.BounceBallSimulator.architecture.view.BallSimulatorDisplay;
import software.ulpgc.BounceBallSimulator.architecture.view.MainFrame;

import javax.swing.*;

public class BallSimulatorController {
    private final Ball ball;
    private final MainFrame mainFrame;
    private double elapsedTime;

    public BallSimulatorController(Ball ball, MainFrame mainFrame) {
        this.ball = ball;
        this.mainFrame = mainFrame;
        startSimulation();
    }

    private void startSimulation() {
        Timer timer = new Timer(16, e -> {
            if (ball.isMoving()) {
                ball.update(0.016); // 16 ms por frame
                elapsedTime += 0.016;
            } else {
                ((Timer) e.getSource()).stop();
                JOptionPane.showMessageDialog(mainFrame, "Tiempo total de rebotes: " + String.format("%.2f", elapsedTime) + " segundos.");
            }
            mainFrame.update();
        });
        timer.start();
    }
}
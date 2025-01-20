package software.ulpgc.BounceBallSimulator.apps.windows;

import software.ulpgc.BounceBallSimulator.architecture.control.BallSimulatorController;
import software.ulpgc.BounceBallSimulator.architecture.model.Ball;
import software.ulpgc.BounceBallSimulator.architecture.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        double initialVelocity = 0; // Velocidad inicial en m/s
        double gravity = 129.81;      // Gravedad en m/s^2
        double ballSize = 40;       // Tamaño de la pelota en píxeles
        double ballWeight = 1;    // Peso de la pelota en kg
        double initialHeight = 400; // Altura inicial en píxeles

        Ball ball = new Ball(initialVelocity, gravity, ballSize, ballWeight, initialHeight);
        MainFrame mainFrame = new MainFrame(ball);
        new BallSimulatorController(ball, mainFrame);

        mainFrame.setVisible(true);
    }
}

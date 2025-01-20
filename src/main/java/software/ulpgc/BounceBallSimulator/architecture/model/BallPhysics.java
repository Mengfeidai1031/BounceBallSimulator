package software.ulpgc.BounceBallSimulator.architecture.model;

public class BallPhysics {
    private final Ball ball;
    private final double elasticity = 0.8; // Coeficiente de restitución

    public BallPhysics(Ball ball) {
        this.ball = ball;
    }

    public double nextVelocity(double velocity) {
        return -velocity * elasticity; // Cambia el signo y aplica el coeficiente
    }

    public boolean isMotionStopped(double velocity) {
        return Math.abs(velocity) < 0.5; // Consideramos parado si es < 0.5m/s
    }

    public double getGravity() {
        return ball.getGravity();
    }
}

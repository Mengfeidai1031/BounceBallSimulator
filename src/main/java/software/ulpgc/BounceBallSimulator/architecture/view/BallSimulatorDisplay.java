package software.ulpgc.BounceBallSimulator.architecture.view;

public interface BallSimulatorDisplay {
    void renderBall(int x, int y, int size);
    void displayTotalTime(double time);
}

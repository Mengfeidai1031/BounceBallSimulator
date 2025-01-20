package software.ulpgc.BounceBallSimulator.architecture.model;

public class Ball {
    private double velocity;
    private final double gravity;
    private final double size;
    private final double weight;
    private double height;
    private boolean moving;

    public Ball(double velocity, double gravity, double size, double weight, double initialHeight) {
        this.velocity = velocity;
        this.gravity = gravity;
        this.size = size;
        this.weight = weight;
        this.height = initialHeight;
        this.moving = true;
    }

    public double getSize() {
        return size;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMoving() {
        return moving;
    }

    public void update(double deltaTime) {
        if (!moving) return;

        velocity -= gravity * deltaTime;
        height += velocity * deltaTime;

        if (height <= 0) {
            height = 0;
            velocity = -velocity * 0.7; // Coeficiente de restitución

            if (Math.abs(velocity) < 1) {
                moving = false;
                velocity = 0;
            }
        }
    }

    public double getGravity() {
        return gravity;
    }
}
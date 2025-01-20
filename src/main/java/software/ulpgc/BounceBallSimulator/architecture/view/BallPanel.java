package software.ulpgc.BounceBallSimulator.architecture.view;

import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel {
    private int x, y, size;

    public void setBallPosition(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}

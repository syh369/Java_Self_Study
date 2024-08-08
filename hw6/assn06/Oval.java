
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval implements Sprite {
    private int width;
    private int height;
    private Color color;

    public Oval(int inputWidth, int inputHeight, Color startColor) {
        this.width = inputWidth;
        this.height = inputHeight;
        this.color = startColor;
    }

    // public void drawSingleOval(Graphics surface) {
    // surface.setColor(color);
    // surface.drawOval(x, y, 50, 50);
    // surface.fillOval(x, y, 50, 50);
    // }

    // @Override
    public void draw(Graphics surface, int leftX, int topY) {
        surface.setColor(color);
        surface.fillOval(leftX, topY, width, height);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(leftX, topY, width, height);

        return;
    }

    // @Override
    public int getWidth() {
        return this.width;
    }

    // @Override
    public int getHeight() {
        return this.height;
    }

}
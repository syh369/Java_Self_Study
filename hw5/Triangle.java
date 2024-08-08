package hw5;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle {
    public int[] xPoints = new int[3];
    public int[] yPoints = new int[3];
    public Color color;

    public Triangle(int[] xpoints, int[] ypoints, Color startColor) {
        xPoints = xpoints;
        yPoints = ypoints;
        color = startColor;
    }

    public void drawSingleTriangle(Graphics surface) {
        surface.setColor(color);
        surface.drawPolygon(xPoints, yPoints, 3);
        surface.fillPolygon(xPoints, yPoints, 3);
    }
}

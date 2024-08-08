package hw5;

import java.awt.Color;
import java.awt.Graphics;

public class Polygon {
    int[] xValues;
    int[] yValues;
    Color color;

    public Polygon(int[] xPoints, int[] yPoints, Color startColor) {
        xValues = xPoints;
        yValues = yPoints;
        color = startColor;
    }

    public void drawSinglePolygon(Graphics surface) {
        surface.setColor(color);
        surface.drawPolygon(xValues, yValues, 5);
        surface.fillPolygon(xValues, yValues, 5);
    }

}

package hw5;

//import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;

public class Oval {
    public int x;
    public int y;
    public Color color;

    public Oval(int startX, int startY, Color startColor) {
        x = startX;
        y = startY;
        color = startColor;
    }

    public void drawSingleOval(Graphics surface) {
        surface.setColor(color);
        surface.drawOval(x, y, 50, 50);
        surface.fillOval(x, y, 50, 50);
    }

}

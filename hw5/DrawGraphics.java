package hw5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    Oval circle;
    Triangle triangle;
    Polygon polygon;

    ArrayList<BouncingBox> boxList = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        // Part I
        circle = new Oval(50, 100, Color.ORANGE);
        int[] xTpoints = { 120, 140, 130 };
        int[] yTpoints = { 40, 40, 21 };
        triangle = new Triangle(xTpoints, yTpoints, Color.GREEN);

        int[] xValues = { 150, 180, 171, 129, 120 };
        int[] yValues = { 120, 144, 180, 180, 144 };
        polygon = new Polygon(xValues, yValues, Color.PINK);

        // Part II
        BouncingBox box2 = new BouncingBox(150, 50, Color.BLUE);
        BouncingBox box3 = new BouncingBox(75, 50, Color.GREEN);
        BouncingBox box4 = new BouncingBox(75, 100, Color.YELLOW);

        boxList.add(box);
        boxList.add(box2);
        boxList.add(box3);
        boxList.add(box4);

        box.setMovementVector(1, 0);
        box2.setMovementVector(-1, 0);
        box3.setMovementVector(0, 1);
        box4.setMovementVector(0, -1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        // surface.drawLine(100, 100, 250, 250);
        // box.draw(surface);
        // circle.drawSingleOval(surface);
        // triangle.drawSingleTriangle(surface);
        // polygon.drawSinglePolygon(surface);

        for (BouncingBox box : boxList) {
            box.draw(surface);
        }
    }
}
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    // Bouncer recSpriteOne;
    // private ArrayList<Bouncer> bouncerList = new ArrayList<>();
    // private ArrayList<StraightMover> straightMoverLists = new ArrayList<>();

    private ArrayList<Mover> movers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle recOne = new Rectangle(15, 20, Color.RED);
        Oval ovalOne = new Oval(30, 30, Color.CYAN);
        Rectangle recTwo = new Rectangle(15, 20, Color.BLUE);
        Oval ovalTwo = new Oval(30, 30, Color.ORANGE);

        Bouncer recSpriteOne = new Bouncer(50, 50, recOne);
        StraightMover recStraightOne = new StraightMover(100, 50, recTwo);

        Bouncer ovalSpriteOne = new Bouncer(50, 100, ovalOne);
        StraightMover ovalStraightOne = new StraightMover(70, 150, ovalTwo);

        movers.add(recSpriteOne);
        movers.add(recStraightOne);
        movers.add(ovalSpriteOne);
        movers.add(ovalStraightOne);

        movers.get(0).setMovementVector(3, 1);
        movers.get(1).setMovementVector(1, 2);
        movers.get(2).setMovementVector(2, 2);
        movers.get(3).setMovementVector(2, 1);

    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}

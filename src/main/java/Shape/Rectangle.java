package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        Double a = width/2;
        Double b = height/2;
        for (Double x = -a; x < a; x+=0.5){
            for (Double y = -b; y < b; y+=0.5){
                this.add(new Point2d(x,y));
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        super();
        Double a = dimensions.X()/2;
        Double b = dimensions.Y()/2;
        for (Double x = -a; x < a; x+=0.5){
            for (Double y = -b; y < b; y+=0.5){
                this.add(new Point2d(x,y));
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {

        return this.clone();
    }
}

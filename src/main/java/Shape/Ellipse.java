package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        Double a = widthDiameter/2;
        Double b = heightDiameter/2;

        for (Double x = -a; x < a; x+=0.5) {
            for (Double y = -b; y < b; y++){
                if ((Math.pow(x,2)/Math.pow(a,2)) + (Math.pow(y,2)/Math.pow(b,2)) <= 1) {
                    this.add(new Point2d(x,y));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        super();
        Double a = dimensions.X()/2;
        Double b = dimensions.Y()/2;

        for (Double x = -a; x < a; x+=0.5) {
            for (Double y = -b; y < b; y++){
                if ((Math.pow(x,2)/Math.pow(a,2)) + (Math.pow(y,2)/Math.pow(b,2)) <= 1) {
                    this.add(new Point2d(x, y));
                }
            }
        }
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {

        return this.clone();
    }
}

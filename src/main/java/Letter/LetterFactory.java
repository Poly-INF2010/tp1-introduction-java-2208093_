package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape leftRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape rightRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape middleRect = new Rectangle(halfMaxWidth + 10, stripeThickness);



        leftRect.rotate(leftRect.getCoords(), Math.toRadians(20));
        rightRect.rotate(rightRect.getCoords(), Math.toRadians(-20));
        leftRect.translate(leftRect.getCoords(), new Point2d(0.0, 0.0));
        rightRect.translate(rightRect.getCoords(), new Point2d(maxWidth, 0.0));
        middleRect.translate(middleRect.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape A = new BaseShape();
        A.add(leftRect);
        A.add(rightRect);
        A.add(middleRect);

        return A;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape B = new BaseShape();
        BaseShape topCircle = new Circle(halfMaxHeight);
        BaseShape bottomCircle = new Circle(halfMaxHeight);
        BaseShape middleRemove2 = new Circle(halfMaxHeight/2 + 20);
        BaseShape middleRemove = new Circle(halfMaxHeight/2 + 20);
        BaseShape skeleton = new Rectangle(stripeThickness, maxHeight);

        bottomCircle.translate(bottomCircle.getCoords(), new Point2d(0.0, halfMaxHeight));
        middleRemove2.translate(middleRemove2.getCoords(), new Point2d(0.0, halfMaxHeight));
        skeleton.translate(skeleton.getCoords(), new Point2d(-halfMaxWidth + 2, halfMaxHeight/2));

        B.add(topCircle);
        B.add(bottomCircle);
        B.remove(middleRemove);
        B.remove(middleRemove2);
        B.add(skeleton);

        return B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape C = new Ellipse(maxWidth, maxHeight);
        BaseShape middleCircle = new Ellipse(maxWidth - stripeThickness*2, maxHeight - stripeThickness*2);
        C.remove(middleCircle);
        BaseShape removeRect = new Rectangle(stripeThickness*1.5, halfMaxHeight);
        removeRect.translate(removeRect.getCoords(), new Point2d(halfMaxWidth - 10, 0.0));

        C.remove(removeRect);


        return C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape E = new BaseShape();
        BaseShape skeletonRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape highRect = new Rectangle(maxWidth, stripeThickness);
        BaseShape middleRect = new Rectangle(maxWidth, stripeThickness);
        BaseShape lowRect = new Rectangle(maxWidth, stripeThickness);

        highRect.translate(highRect.getCoords(), new Point2d(halfMaxWidth, -halfMaxHeight + 10));
        middleRect.translate(middleRect.getCoords(), new Point2d(halfMaxWidth, 0.0));
        lowRect.translate(lowRect.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight - 10));

        E.add(skeletonRect);
        E.add(middleRect);
        E.add(lowRect);
        E.add(highRect);
        return E;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape H = new BaseShape();
        BaseShape leftRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape middleRect = new Rectangle(maxWidth, stripeThickness);
        middleRect.translate(middleRect.getCoords(), new Point2d(halfMaxWidth, 0.0));
        BaseShape rightRect = new Rectangle(stripeThickness, maxHeight);
        rightRect.translate(rightRect.getCoords(), new Point2d(maxWidth, 0.0));

        H.add(rightRect);
        H.add(middleRect);
        H.add(leftRect);
        return H;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape N = new BaseShape();
        BaseShape leftRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape rightRect = new Rectangle(stripeThickness, maxHeight);
        BaseShape middleRect = new Rectangle(stripeThickness, maxHeight);

        middleRect.rotate(middleRect.getCoords(), Math.toRadians(-20));
        middleRect.translate(middleRect.getCoords(), new Point2d(halfMaxWidth, 0.0));
        rightRect.translate(rightRect.getCoords(), new Point2d(maxWidth - 5, 0.0));

        N.add(middleRect);
        N.add(rightRect);
        N.add(leftRect);


        return N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape O = new Ellipse(maxWidth,maxHeight);
        BaseShape removeMiddle = new Ellipse(maxWidth - stripeThickness * 2, maxHeight - stripeThickness * 2);
        O.remove(removeMiddle);
        O.translate(O.getCoords(), new Point2d(halfMaxWidth, 0.0));

        return O;
    }

}

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
        BaseShape letterA = new BaseShape();

        Rectangle rectangleAngulaire1 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleAngulaire2 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleHorizontal = new Rectangle(stripeThickness,halfMaxHeight);

        rectangleAngulaire1.rotate(rectangleAngulaire1.getCoords(),0.3490658504);
        rectangleAngulaire2.rotate(rectangleAngulaire2.getCoords(),-0.3490658504 );
        rectangleHorizontal.rotate(rectangleHorizontal.getCoords(),(3.1415926536/2));

        Point2d rectangle1Position = new Point2d(rectangleHorizontal.getMinX(), 50.0);
        Point2d rectangle2Position = new Point2d(rectangleHorizontal.getMaxX(), 50.0);
        Point2d rectangleHorizontalPosition = new Point2d(0.0, 40.0);
        rectangleAngulaire1.translate(rectangleAngulaire1.getCoords(),rectangle1Position );
        rectangleAngulaire2.translate(rectangleAngulaire2.getCoords(),rectangle2Position );
        rectangleHorizontal.translate(rectangleHorizontal.getCoords(),rectangleHorizontalPosition );

        letterA.add(rectangleAngulaire1);
        letterA.add(rectangleAngulaire2);
        letterA.add(rectangleHorizontal);

        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {

        BaseShape letterB = new BaseShape();

        Ellipse ellipse1 = new Ellipse(maxWidth,halfMaxHeight);
        Ellipse Ellipse2 = new Ellipse(maxWidth,halfMaxHeight);
        Ellipse ellipseVide = new Ellipse(maxWidth/1.5, (halfMaxHeight/1.5));
        ellipse1.remove(ellipseVide);
        Ellipse2.remove(ellipseVide);

        Point2d Ellipse1Position = new Point2d(0.0, halfMaxHeight/2);
        Point2d Ellipse2Position = new Point2d(0.0, -(halfMaxHeight/2));
        ellipse1.translate(ellipse1.getCoords(),Ellipse1Position );
        Ellipse2.translate(Ellipse2.getCoords(),Ellipse2Position );

        Rectangle rectangleVertical = new Rectangle(stripeThickness,maxHeight);
        Point2d rectangleVerticalPosition = new Point2d(( ellipse1.getMinX()),0.0);
        rectangleVertical.translate(rectangleVertical.getCoords(),rectangleVerticalPosition);

        letterB.add(ellipse1);
        letterB.add(Ellipse2);
        letterB.add(rectangleVertical);

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterD = new BaseShape();

        Ellipse ellipse1 = new Ellipse(maxWidth,maxHeight);
        Ellipse ellipseVide = new Ellipse(maxWidth/1.5,maxHeight/1.5);

        Rectangle rectangleVertical = new Rectangle(stripeThickness+30,maxHeight/1.5);
        Point2d rectangleVerticalPosition = new Point2d((ellipse1.getMaxX()-10),0.0);
        rectangleVertical.translate(rectangleVertical.getCoords(),rectangleVerticalPosition);

        ellipse1.remove(ellipseVide);
        ellipse1.remove(rectangleVertical);

        letterD.add(ellipse1);

        return letterD;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        Rectangle rectangleHorizontal1 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleHorizontal2 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleHorizontal3 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleVertical = new Rectangle(stripeThickness,maxHeight);

        rectangleHorizontal1.rotate(rectangleHorizontal1.getCoords(),1.5707963268);
        rectangleHorizontal2.rotate(rectangleHorizontal2.getCoords(),1.5707963268);
        rectangleHorizontal3.rotate(rectangleHorizontal3.getCoords(),1.5707963268);

        double offset = 5.0;

        Point2d translateur1 = new Point2d(0.0, -maxHeight + 20);
        rectangleHorizontal1.translate(rectangleHorizontal1.getCoords(), translateur1);

        Point2d translateur2 = new Point2d(0.0, -halfMaxHeight + offset );
        rectangleHorizontal2.translate(rectangleHorizontal2.getCoords(), translateur2);

        Point2d translateur3 = new Point2d(0.0, - offset);
        rectangleHorizontal3.translate(rectangleHorizontal3.getCoords(), translateur3);

        Point2d translateurVertical = new Point2d(rectangleHorizontal2.getMinX(), rectangleHorizontal2.getMaxY());
        rectangleVertical.translate(rectangleVertical.getCoords(), translateurVertical);

        letterE.add(rectangleHorizontal1);
        letterE.add(rectangleHorizontal2);
        letterE.add(rectangleHorizontal3);
        letterE.add(rectangleVertical);

        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();
        Rectangle rectangleVertical1 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleVertical2 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleHorizontal = new Rectangle(stripeThickness,halfMaxHeight);

        rectangleHorizontal.rotate(rectangleHorizontal.getCoords(),1.5707963268);

        Point2d translateur1 = new Point2d(rectangleHorizontal.getMinX(),  0.0);
        rectangleVertical1.translate(rectangleVertical1.getCoords(), translateur1);

        Point2d translateur2 = new Point2d(rectangleHorizontal.getMaxX(),  0.0 );
        rectangleVertical2.translate(rectangleVertical2.getCoords(), translateur2);

        Point2d translateur3 = new Point2d(0.0, -(rectangleVertical1.getMaxY()/2)+30.0);
        rectangleHorizontal.translate(rectangleHorizontal.getCoords(), translateur3);

        letterH.add(rectangleVertical1);
        letterH.add(rectangleVertical2);
        letterH.add(rectangleHorizontal);

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle rectangleVertical1 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleVertical2 = new Rectangle(stripeThickness,maxHeight);
        Rectangle rectangleAngulaire = new Rectangle(stripeThickness,maxHeight);

        rectangleAngulaire.rotate(rectangleAngulaire.getCoords(),-0.7853981634);

        Point2d rectangle1Position = new Point2d(( -50.0),0.0);
        rectangleVertical1.translate(rectangleVertical1.getCoords(),rectangle1Position);

        Point2d rectangle2Position = new Point2d(( 50.0),0.0);
        rectangleVertical2.translate(rectangleVertical2.getCoords(),rectangle2Position);

        Point2d rectangleAngulairePosition = new Point2d(0.0,5.0);
        rectangleAngulaire.translate(rectangleAngulaire.getCoords(),rectangleAngulairePosition);

        letterN.add(rectangleVertical1);
        letterN.add(rectangleVertical2);
        letterN.add(rectangleAngulaire);

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();

        Ellipse ellipse = new Ellipse(halfMaxWidth, maxHeight);

        Ellipse ellipseVide = new Ellipse(halfMaxWidth/1.5, maxHeight/1.5);

        ellipse.removeAll(ellipseVide.getCoords());

        letterO.add(ellipse);

        return letterO;
    }

}
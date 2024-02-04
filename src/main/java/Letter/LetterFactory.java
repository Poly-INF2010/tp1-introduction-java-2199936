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

        // Créer les deux rectangles identiques
        Rectangle leftRectangle = new Rectangle(stripeThickness, maxHeight);
        Rectangle rightRectangle = new Rectangle(stripeThickness, maxHeight);

        // Faire pivoter un rectangle de 30 degrés
        leftRectangle.rotate(leftRectangle.getCoords(), 30.0);

        // Faire pivoter l'autre rectangle de 120 degrés
        rightRectangle.rotate(rightRectangle.getCoords(), 120.0);

        // Créer un autre rectangle entre les deux
        Rectangle centerRectangle = new Rectangle(halfMaxHeight / 2, halfStripeThickness);

        // Positionner le rectangle central entre les deux autres
        double centerY = (leftRectangle.getMaxY() + rightRectangle.getMaxY()) / 2;
        double centerX = (leftRectangle.getMaxX() + rightRectangle.getMinX()) / 2;
        Point2d centerPosition = new Point2d(centerX, centerY);
        centerRectangle.translate(centerRectangle.getCoords(), centerPosition);

        // Ajouter les rectangles à la lettre B
        letterA.addAll(leftRectangle.getCoords());
        letterA.addAll(rightRectangle.getCoords());
        letterA.addAll(centerRectangle.getCoords());

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

        // Créez une grande ellipse pour la forme principale de la lettre D
        double largeEllipseDiameter = 100.0; // Ajustez la taille de l'ellipse selon vos besoins
        Ellipse largeEllipse = new Ellipse(largeEllipseDiameter, largeEllipseDiameter);

        // Ajoutez la grande ellipse à la lettre D
        letterD.add(largeEllipse);

        // Créez une petite ellipse pour former le trou dans la lettre D
        double smallEllipseDiameter = 50.0; // Ajustez la taille de l'ellipse selon vos besoins
        Ellipse smallEllipse = new Ellipse(smallEllipseDiameter, smallEllipseDiameter);

        // Positionnez la petite ellipse à l'intérieur de la grande ellipse pour former le trou
        double distanceFromLargeEllipse = 20.0; // Ajustez la distance de la petite ellipse par rapport à la grande ellipse selon vos besoins
        Point2d smallEllipsePosition = new Point2d(largeEllipseDiameter / 2 - smallEllipseDiameter / 2 - distanceFromLargeEllipse, largeEllipseDiameter / 2 - smallEllipseDiameter / 2);
        smallEllipse.translate(smallEllipse.getCoords(), smallEllipsePosition);

        // Ajoutez la petite ellipse à la lettre D
        letterD.add(smallEllipse);

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


        // Rotation du rectangle d'un angle de 90 (pour etre horizontal)
        rectangleHorizontal1.rotate(rectangleHorizontal1.getCoords(),1.5707963268);
        rectangleHorizontal2.rotate(rectangleHorizontal2.getCoords(),1.5707963268);
        rectangleHorizontal3.rotate(rectangleHorizontal3.getCoords(),1.5707963268);



        Point2d translateur2 = new Point2d(0.0,-40.0);
        rectangleHorizontal2.translate(rectangleHorizontal2.getCoords(),translateur2);

        Point2d translateur3 = new Point2d(0.0,-80.0);
        rectangleHorizontal3.translate(rectangleHorizontal3.getCoords(),translateur2);

        Point2d translateur4 = new Point2d(-65.0,0.0);
        rectangleVertical.translate(rectangleVertical.getCoords(),translateur4);




        letterE.add(rectangleHorizontal1);
        letterE.add(rectangleHorizontal2);
        letterE.add(rectangleHorizontal3);



        return letterE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        // Largeur et hauteur des rectangles
        Double width = 100.0; // Ajustez la largeur selon vos besoins
        Double height = 150.0; // Ajustez la hauteur selon vos besoins

        // Créer le rectangle vertical gauche
        Rectangle leftRectangle = new Rectangle(width / 4, height);

        // Positionner le rectangle vertical gauche
        Point2d leftRectanglePosition = new Point2d(0.0, 0.0);
        leftRectangle.translate(leftRectangle.getCoords(), leftRectanglePosition);

        // Ajouter le rectangle vertical gauche à la lettre H
        letterH.add(leftRectangle);

        // Créer le rectangle horizontal
        Rectangle centerRectangle = new Rectangle(width / 2, height / 4);

        // Positionner le rectangle horizontal
        Point2d centerRectanglePosition = new Point2d(width / 4, height / 2);
        centerRectangle.translate(centerRectangle.getCoords(), centerRectanglePosition);

        // Ajouter le rectangle horizontal à la lettre H
        letterH.add(centerRectangle);

        // Créer le rectangle vertical droit
        Rectangle rightRectangle = new Rectangle(width / 4, height);

        // Positionner le rectangle vertical droit
        Point2d rightRectanglePosition = new Point2d(width / 2, 0.0);
        rightRectangle.translate(rightRectangle.getCoords(), rightRectanglePosition);

        // Ajouter le rectangle vertical droit à la lettre H
        letterH.add(rightRectangle);

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
        // Rotation du rectangle d'un angle de 45 degres
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
        // Créez une BaseShape pour contenir la lettre
        BaseShape letterO = new BaseShape();


        // Créez une ellipse centrée sur (0,0) avec le diamètre spécifié
        Ellipse ellipse = new Ellipse(halfMaxWidth, maxHeight);


        // Créez une ellipse vide sur (0,0) avec le diamètre spécifié
        Ellipse ellipseVide = new Ellipse(halfMaxWidth/1.5, maxHeight/1.5);

        ellipse.removeAll(ellipseVide.getCoords());


        // Ajoutez l'ellipse à la lettre O
        letterO.add(ellipse);

        return letterO;
    }

}
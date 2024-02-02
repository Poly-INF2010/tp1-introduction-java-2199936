package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */
    public Point2d(Double x, Double y) {
        super(new double[] {X, Y});
    }

    /** TODO
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */
    public Point2d(Double[] vector) {
        this(vector[0], vector[1]);
    }

    /**
     * @return X coordinate
     */
    public double X() { return this.vector[0];}

    /**
     * @return Y coordinate
     */
    public double Y() { return this.vector[1];}

    /** TODO
     * Translate the point by the given vector
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public Point2d translate(Double[] translateVector) {
        double x = this.X() + translateVector[0];
        double y = this.Y() + translateVector[1];
        return new Point2d(x, y);
    }

    /** TODO
     * Translate the point by the given 2D Point
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        double newX = this.X() + translateVector.X();
        double newY = this.Y() + translateVector.Y();

        return new Point2d(newX, newY);
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        double x = this.X();
        double y = this.Y();

        double newX = rotationMatrix[0][0] * x + rotationMatrix[0][1] * y;
        double newY = rotationMatrix[1][0] * x + rotationMatrix[1][1] * y;

        return new Point2d(newX, newY);
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {

        double currentX = this.X();
        double currentY = this.Y();

        double newX = currentX * Math.cos(angle) - currentY * Math.sin(angle);
        double newY = currentX * Math.sin(angle) + currentY * Math.cos(angle);

        return new Point2d(newX, newY);

    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {

        double x = this.X();
        double y = this.Y();

        double newX = x / divider;
        double newY = y / divider;

        return new Point2d(newX, newY);
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {

        double x = this.X();
        double y = this.Y();

        double newX = x * multiplier;
        double newY = y * multiplier;

        return new Point2d(newX, newY);
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {

        double x = this.X();
        double y = this.Y();

        double newX = x + adder;
        double newY = y + adder;


        return new Point2d(newX, newY);
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {

        double x = this.X();
        double y = this.Y();

        return new Point2d(x, y);
    }
}
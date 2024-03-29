package Shape;

import Point.Point2d;

import java.util.Collection;


public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        {
            double semiMajorAxis = widthDiameter / 2;
            double semiMinorAxis = heightDiameter / 2;

            for (double x = -semiMajorAxis; x <= semiMajorAxis; x += 0.5) {
                for (double y = -semiMinorAxis; y <= semiMinorAxis; y += 0.5) {
                    double value = (x * x) / (semiMajorAxis * semiMajorAxis) + (y * y) / (semiMinorAxis * semiMinorAxis);
                    if (value <= 1) {
                        this.add(new Point2d(x, y));
                    }
                }
            }
        }
    }



    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X() * 2, dimensions.Y() * 2);
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        Ellipse clonedEllipse = new Ellipse(0.0,0.0);

        for (Point2d point : this.getCoords()) {
            clonedEllipse.add(new Point2d(point.X(), point.Y()));
        }
        return clonedEllipse;
    }
}

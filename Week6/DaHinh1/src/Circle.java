public class Circle extends Shape {
    protected double radius;

    /**
     * Constructor.
     */
    public Circle() {
    }

    /**
     * Constructor.
     * 
     * @param radius - R
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     * 
     * @param radius - R
     * @param color  - Color
     * @param filled - Boolean
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Gets the radius.
     * 
     * @return - R
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

}

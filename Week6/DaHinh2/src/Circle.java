public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Constructor.
     */
    public Circle() {
    }

    /**
     * Constructor.
     * 
     * @param center - point to center
     * @param radius - R
     * @param color  - color
     * @param filled - filled
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
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
        return Math.round(Math.PI * Math.pow(radius, 2) * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius * 10.0) / 10.0;
    }

    @Override
    public String toString() {
        return "Circle[center=" + this.center.toString()
                + ",radius=" + this.radius + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        if (center == null) {
            if (other.center != null) {
                return false;
            }
        } else if (!center.equals(other.center)) {
            return false;
        }
        return true;
    }

    /**
     * in4.
     * @return - in4
     */
    public String info() {
        return "Circle:" + center.toString() + "," + radius;
    }
}

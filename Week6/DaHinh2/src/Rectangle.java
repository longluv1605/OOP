public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a new Rectangle.
     * 
     * @param width  - w
     * @param length - l
     * @param color  - color
     * @param filled - filled
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a new Rectangle.
     * 
     * @param topLeft - point
     * @param width   - w
     * @param length  - l
     * @param color   - color
     * @param filled  - filled
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Math.round(width * length * 10.0) / 10.0;
    }

    public double getPerimeter() {
        return Math.round(2 * (width + length) * 10.0) / 10.0;
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString()
                + ",width=" + this.width + ",length=" + this.length
                + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (topLeft == null) {
            if (other.topLeft != null) {
                return false;
            }
        } else if (!topLeft.equals(other.topLeft)) {
            return false;
        }
        return true;
    }

    /**
     * in4.
     * @return - in4
     */
    public String info() {
        return "Rectangle:" + topLeft.toString() + "," + width + "," + length;
    }
}
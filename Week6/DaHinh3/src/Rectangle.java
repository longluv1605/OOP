import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;
    protected javafx.scene.shape.Rectangle rect = new javafx.scene.shape.Rectangle();

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
        render();
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

    public void render() {
        this.rect.setWidth(width);
        this.rect.setHeight(length);
        this.rect.setX(this.topLeft.getPointX());
        this.rect.setY(this.topLeft.getPointY());
        this.rect.setFill(Color.valueOf(this.color));
        this.rect.setStroke(Color.BLACK);
    }

    public javafx.scene.shape.Rectangle getRect() {
        return rect;
    }

    public void setRect(javafx.scene.shape.Rectangle rect) {
        this.rect = rect;
    }

    public javafx.scene.shape.Circle getCir() {return new Circle();}
    public void setCir(javafx.scene.shape.Circle cir) {}


    public void up() {
        topLeft.setPointY(topLeft.getPointY() - 10);
    }

    public void left() {
        topLeft.setPointX(topLeft.getPointX() - 10);
    }

    public void down() {
        topLeft.setPointY(topLeft.getPointY() + 10);
    }

    public void right() {
        topLeft.setPointX(topLeft.getPointX() + 10);
    }
}
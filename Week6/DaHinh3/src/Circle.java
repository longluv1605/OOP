import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Circle extends Shape {
    protected double radius;
    protected Point center;
    protected javafx.scene.shape.Circle cir = new javafx.scene.shape.Circle();

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
        render();
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

    public void render() {
        this.cir.setCenterX(this.center.getPointX());
        this.cir.setCenterY(this.center.getPointY());
        cir.setRadius(this.radius);
        cir.setFill(Color.valueOf(this.color));
        this.cir.setStroke(Color.BLACK);
    }

    public javafx.scene.shape.Circle getCir() {
        return cir;
    }

    public void setCir(javafx.scene.shape.Circle cir) {
        this.cir = cir;
    }

    //-----------------------------------------------------------------------.
    public javafx.scene.shape.Rectangle getRect() {return new Rectangle();}
    public void setRect(javafx.scene.shape.Rectangle rect) {}
    //-----------------------------------------------------------------------.
    
    public void up() {
        center.setPointY(center.getPointY() - 10);
        render();
    }

    public void left() {
        center.setPointX(center.getPointX() - 10);
        render();
    }

    public void down() {
        center.setPointY(center.getPointY() + 10);
        render();
    }

    public void right() {
        center.setPointX(center.getPointX() + 10);
        render();
    }
}

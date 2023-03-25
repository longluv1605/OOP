public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected Point point;

    public Shape(Point point, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.point = point;
    }

    /**
     * Non-parameter constructor.
     */
    public Shape() {
    }

    /**
     * Two parameters constructor.
     * 
     * @param color - color
     * @param filled - filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter for the color.
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter for the filled.
     * 
     * @return true if the color is filled or false otherwise
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter for the color.
     * 
     * @param color - the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Setter for filled.
     * 
     * @param filled - true if the color is filled or false otherwise
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method.
     */
    public abstract double getArea();

    /**
     * Abstract method.
     */
    public abstract double getPerimeter();

    /**
     * To String method.
     */
    @Override
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }

    public abstract String info();

    public abstract void render();
    public abstract javafx.scene.shape.Circle getCir();
    public abstract void setCir(javafx.scene.shape.Circle cir);
    public abstract javafx.scene.shape.Rectangle getRect();
    public abstract void setRect(javafx.scene.shape.Rectangle rect);

    public abstract void up();
    public abstract void down();
    public abstract void right();
    public abstract void left();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
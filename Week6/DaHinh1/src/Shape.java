public abstract class Shape {
    protected String color;
    protected boolean filled;

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
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
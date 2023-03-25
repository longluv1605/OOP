public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + super.topLeft.toString()
                + ",side=" + getSide()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String info() {
        return "Square:" + super.topLeft.toString() + "," + super.length;
    }
}
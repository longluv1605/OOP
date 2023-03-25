public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Get distance between a and b.
     * 
     * @param b - other point
     * @return distance between a and b
     */
    public double distance(Point b) {
        double ans = Math.sqrt(Math.pow(this.pointX - b.getPointX(), 2)
                + Math.pow(this.pointY - b.getPointY(), 2));

        ans = Math.round(ans * 10.0) / 10.0;

        return ans;
    }

    @Override
    public String toString() {
        return "(" + this.pointX + "," + this.pointY + ")";
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
        Point other = (Point) obj;
        if (Double.doubleToLongBits(pointX) != Double.doubleToLongBits(other.pointX)) {
            return false;
        }
        if (Double.doubleToLongBits(pointY) != Double.doubleToLongBits(other.pointY)) {
            return false;
        }
        return true;
    }

}
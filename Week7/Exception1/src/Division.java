public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " / " + this.right.toString() + ")";
    }

    @Override
    public double evaluate() throws ArithmeticException {
        double ans;
        if (this.right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            ans = this.left.evaluate() / this.right.evaluate();
        }
        return ans;
    }
}

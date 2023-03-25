public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " + " + this.right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }
}
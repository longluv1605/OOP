public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + this.left.toString() + " * " + this.right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
}

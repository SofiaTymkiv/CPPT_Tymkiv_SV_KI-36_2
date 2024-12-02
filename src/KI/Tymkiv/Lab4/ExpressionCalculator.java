package KI.Tymkiv.Lab4;

public class ExpressionCalculator {
    public double calculate(double x) throws ArithmeticException
    {
        double cosValue = Math.cos(4 * x);
        if (cosValue == 0) {
            throw new ArithmeticException("Ділення на нуль: cos(4 * " + x + ") = 0");
        }
        return 1.0 / cosValue;
    }
}

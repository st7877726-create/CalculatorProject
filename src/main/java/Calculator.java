import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculator {

    public double add(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a + b;
    }

    public double subtract(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a - b;
    }

    public double multiply(double a, double b) throws InvalidInputException {
        validate(a, b);
        return a * b;
    }

    public double divide(double a, double b) throws InvalidInputException {
        validate(a, b);
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return a / b;
    }

    private void validate(double a, double b) throws InvalidInputException {
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new InvalidInputException("Вхідне число не може бути NaN");
        }
        if (Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new InvalidInputException("Вхідне число не може бути нескінченністю");
        }
    }
}

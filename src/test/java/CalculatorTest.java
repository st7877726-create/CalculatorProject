import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();
    private static final double DELTA = 0.0001;

    @Test
    void addShouldReturnSum() throws InvalidInputException {
        assertEquals(15.0, calculator.add(10, 5), DELTA);
    }

    @Test
    void subtractShouldReturnDifference() throws InvalidInputException {
        assertEquals(5.0, calculator.subtract(10, 5), DELTA);
    }

    @Test
    void multiplyShouldReturnProduct() throws InvalidInputException {
        assertEquals(50.0, calculator.multiply(10, 5), DELTA);
    }

    @Test
    void divideShouldReturnQuotient() throws InvalidInputException {
        assertEquals(2.0, calculator.divide(10, 5), DELTA);
    }

    @Test
    void divideByZeroShouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void divideWithNaNShouldThrowInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> calculator.divide(Double.NaN, 5));
    }

    @Test
    void addWithPositiveInfinityShouldThrowInvalidInputException() {
        assertThrows(InvalidInputException.class, () -> calculator.add(5, Double.POSITIVE_INFINITY));
    }
}

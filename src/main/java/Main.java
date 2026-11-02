import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Введіть перше число: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double b = scanner.nextDouble();

            System.out.print("Введіть операцію (+, -, *, /): ");
            String operation = scanner.next();

            double result;
            switch (operation) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    result = calculator.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Невідома операція: " + operation);
            }

            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка вхідних даних: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Помилка: введено некоректне число");
        } finally {
            System.out.println("Обробку запиту завершено");
            scanner.close();
        }
    }
}

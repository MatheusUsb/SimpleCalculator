import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        String operation = scanner.next();

        double result;

        switch (operation) {
            case "+":
                result = calculator.add(number1, number2);
                break;
            case "-":
                result = calculator.subtract(number1, number2);
                break;
            case "*":
                result = calculator.multiply(number1, number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Error: Divisor cannot be zero.");
                    scanner.close();
                    return;
                }
                result = calculator.divide(number1, number2);
                break;
            default:
                System.out.println("Error: Invalid operation.");
                scanner.close();
                return;
        }

        System.out.printf("Result: %.2f\n", result);
        scanner.close();
    }
}

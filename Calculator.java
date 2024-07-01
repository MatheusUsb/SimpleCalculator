public class Calculator {

    // Método para adição
    public double add(double a, double b) {
        return a + b;
    }

    // Método para subtração
    public double subtract(double a, double b) {
        return a - b;
    }

    // Método para multiplicação
    public double multiply(double a, double b) {
        return a * b;
    }

    // Método para divisão
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

}
public class Calculator {

    // add() overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // subtract()
    public int subtract(int a, int b) {
        return a - b;
    }

    // multiply()
    public double multiply(double a, double b) {
        return a * b;
    }

    // divide() with exception handling
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}

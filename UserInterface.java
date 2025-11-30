import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Calculator calc = new Calculator();

    // ADD
    public void performAddition() {
        System.out.println("Choose Add Option:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first int: ");
                int a = sc.nextInt();
                System.out.print("Enter second int: ");
                int b = sc.nextInt();
                System.out.println("Result: " + calc.add(a, b));
                break;

            case 2:
                System.out.print("Enter first double: ");
                double x = sc.nextDouble();
                System.out.print("Enter second double: ");
                double y = sc.nextDouble();
                System.out.println("Result: " + calc.add(x, y));
                break;

            case 3:
                System.out.print("Enter first int: ");
                int p = sc.nextInt();
                System.out.print("Enter second int: ");
                int q = sc.nextInt();
                System.out.print("Enter third int: ");
                int r = sc.nextInt();
                System.out.println("Result: " + calc.add(p, q, r));
                break;

            default:
                System.out.println("Invalid option.");
        }
    }

    // SUBTRACT
    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    // MULTIPLY
    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    // DIVIDE
    public void performDivision() {
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + calc.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // MAIN MENU
    public void mainMenu() {

        while (true) {
            System.out.println("\n===== Calculator Application =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: performAddition(); break;
                case 2: performSubtraction(); break;
                case 3: performMultiplication(); break;
                case 4: performDivision(); break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}

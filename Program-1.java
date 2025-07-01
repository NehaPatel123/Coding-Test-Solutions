import java.util.Scanner;

class Calculator {
    double a, b;

    // Constructor to store the numbers
    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Method to perform the operation
    double calculate(String operation) {
        if (operation.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operation.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (operation.equalsIgnoreCase("multiply")) {
            return a * b;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        } else {
            System.out.println("Invalid operation!");
            return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); // Clear buffer
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.nextLine();

        // Create Calculator object and do calculation
        Calculator calc = new Calculator(a, b);
        double result = calc.calculate(op);

        // Show result
        System.out.println("Result: " + result);

        sc.close();
    }
}

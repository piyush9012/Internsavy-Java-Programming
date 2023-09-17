import java.util.Scanner;

// Define a Calculator interface
interface Calculator {
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}

// Implement the Calculator interface
class BasicCalculator implements Calculator {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not-a-Number
        }
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Operations: +, -, *, /");
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = sc.nextLine();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Calculator obj = new BasicCalculator();
        double result = 0;

        switch (operation) {
            case "+":
                result = obj.add(num1, num2);
                break;
            case "-":
                result = obj.subtract(num1, num2);
                break;
            case "*":
                result = obj.multiply(num1, num2);
                break;
            case "/":
                result = obj.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println("Result: " + result);
    }
}

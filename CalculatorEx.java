import java.util.Scanner;

public class CalculatorEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("--- Simple Calculator ---");

        // 1. Get the first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // 2. Get the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // 3. Get the second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // 4. Perform the operation using a switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }

        scanner.close();
    }
}
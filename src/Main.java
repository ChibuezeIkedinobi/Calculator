import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {

            System.out.print("Enter the first number: ");
            double num1;

            try {
                num1 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            System.out.print("Enter the second number: ");
            double num2;

            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            System.out.println("Select an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            int operation;
            try {
                operation = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
                continue;
            }

            double result = 0;

            switch (operation) {
                case 1 -> result = num1 + num2;
                case 2 -> result = num1 - num2;
                case 3 -> result = num1 * num2;
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                }
                case 5 -> {
                    exit = true;
                    continue;
                }
                default -> {
                    System.out.println("Invalid operation");
                    continue;
                }
            }

            System.out.println("The result is: " + result);
        }

        System.out.println("Calculator closed.");
    }
}

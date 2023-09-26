import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /) or 'q' to quit:");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Exiting calculator program...");
                break;
            }

            Calculator calculator = new Calculator(num1, num2);
            double result;

            switch (operator) {
                case '+':
                    result = calculator.add();
                    break;
                case '-':
                    result = calculator.subtract();
                    break;
                case '*':
                    result = calculator.multiply();
                    break;
                case '/':
                    result = calculator.divide();
                    break;
                default:
                    System.out.println("Invalid operator");
                    continue;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char operator;
        double firstNumber;
        double secondNumber;

        System.out.println("Input two number following by operation (ex: 2 5 +)");
        firstNumber = scanner.nextDouble();
        secondNumber = scanner.nextDouble();
        operator = scanner.next().charAt(0);

        Calculator calculator = new Calculator();
        double result = calculator.doCalculation(firstNumber, secondNumber, operator);
        System.out.println(result);
    }
}

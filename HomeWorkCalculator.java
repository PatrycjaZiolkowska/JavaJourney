import java.util.Scanner;

public class HomeWorkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = (float) firstNumber/secondNumber;


        System.out.println("Addition result: " + addition);
        System.out.println("Subtraction result: " + subtraction);
        System.out.println("Multiplication result: " + multiplication);
        System.out.println("Division result: " + division);
    }
}

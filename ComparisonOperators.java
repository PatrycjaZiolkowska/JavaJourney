import java.util.Scanner;

public class ComparisonOperators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;
        System.out.println(result);
        
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
    }
    
}

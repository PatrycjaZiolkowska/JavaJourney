package ForLoop;

import java.util.Scanner;

public class ForLoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();


        for (int i = firstNumber; i <= secondNumber; i++) {
            
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }

    }
}

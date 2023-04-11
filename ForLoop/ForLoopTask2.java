package ForLoop;

import java.util.Scanner;
 // Napisz program, który pobiera od użytkownika liczbę całkowitą n i wyświetla wszystkie liczby od 1 do n włącznie, ale:
 // dla wielokrotności liczby 3 zamiast liczby wyświetl słowo "Fizz"
 // dla wielokrotności liczby 5 zamiast liczby wyświetl słowo "Buzz"
 // dla wielokrotności liczby 3 i 5 zamiast liczby wyświetl słowo "FizzBuzz"
public class ForLoopTask2 {
public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
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

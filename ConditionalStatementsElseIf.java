import java.net.Socket;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class ConditionalStatementsElseIf {

    public static void main(String[] args) {
        
    int number = 10;

    if(number > 0) {
        System.out.println("Number greater than zero");
    } else if (number < 0) {
        System.out.println("Number less than zero");
    } else if (number == 0) {
        System.out.println("Number equal to zero");
    } 
    



// Homework - ask for age, less than 18 - can't buy alkohol, more than 18 - say thank you

    /*Scanner scanner = new Scanner(System.in);
    System.out.println("How old are you");

    int age = scanner.nextInt();
    
    if (age < 18 && age >= 0) {
        System.out.println("Sorry you can't buy alcohol");
    } else if (age < 0) {
        System.out.println("Enter correct age");
    }else {
        System.out.println("Thank you for shopping");
    }*/
    

// Another example 
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the temperature");

double temperature = scanner.nextDouble();

if (temperature < -10) {
    System.out.println("It's very cold");
} else if (temperature >= -10 && temperature < 0) {
    System.out.println("It's cold");
} else if (temperature >= 0 && temperature < 15) {
    System.out.println("It's chilly");
} else if (temperature >= 15 && temperature < 25) {
    System.out.println("It's warm");
} else if (temperature >= 25) {
    System.out.println("It's hot");
}


    }
    
}



package ForLoop;

import java.util.Scanner;

//Napisz program, który pobiera od użytkownika dwie liczby całkowite: początek i koniec przedziału. 
//Następnie program wykorzystuje pętlę for do wyświetlenia wszystkich liczb parzystych w tym przedziale
// Jeśli w podanym przedziale nie ma żadnej liczby parzystej, program powinien wyświetlić komunikat

public class ForLoopTask1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beginning of the range");
        int start = scanner.nextInt();
        System.out.println("End of the range");
        int end = scanner.nextInt();
        boolean foundEvenNumber = false;

        for (int i = start; i <= end; i++) {
            if(i%2==0) {
            System.out.println(i);
            foundEvenNumber =true;
        } 
    }
    if (!foundEvenNumber) {
        System.out.println("There are no even numbers in this range");
    }
   }
}

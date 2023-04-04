import java.util.Scanner;

public class CustomScanner {
    
    public static void main(String[] args) {

        /*  // pobieramy imie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie");
        // pobieramy wartość tekstową którą wprowadza uytkownik, zwróci string

        String name = scanner.nextLine();
        System.out.println("Czesc " + name + " !");*/

        // 2 program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");

        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        // System.out.println(" Kwadrat tej liczby to: " + result);
        System.out.println(" Kwadrat tej liczby to: " + firstNumber * firstNumber);

    }
}

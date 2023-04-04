import java.io.FileReader;

// umoliwiają wykonanie podst. operacji matematycznych 

public class OperatoryMatematyczne {
    
    public static void main(String[] args) {
        int firstNumber =4;
        int secondNumber =6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber; // reszta z dzielenia - ile razy 4 zmiesci sie w 6 -1, zwracamy to co zosatało 2


        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod); 

        firstNumber+=secondNumber; // firstNumber = firstNum + SecondNum
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber;
        System.out.println("Po mnozeniu: " + firstNumber);
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu: " + firstNumber);
        firstNumber%=secondNumber;
        System.out.println("Po modulo: " + firstNumber);

    }

}

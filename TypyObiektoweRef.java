import javax.swing.plaf.synth.SynthStyle;

public class TypyObiektoweRef {
    

public static void main(String[] args) {
    
// Typy obiektowe przechowują aktualną wartość oraz umoliwiają wykonanie akcjii - wywołanie metod na tych danych

// liczby stałoprzecinkowe 
byte firstNumber = 127; // 1 bajt - 128 do 127
short secondNumber = 32689; // 2 bajty -32768 do 32767
int thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1



// liczby zmiennoprzecinkowe
float fifthNumber = 4.99944F; // 4 bajty - max 6-7 po przecinku
double sixthNumber = 3.999999999999990D; // 8 bajtów - max 15 po przecinku


//wartości logiczne
boolean prawda = true;
boolean falsh = false;

//pojedynczy znak
char letter ='A';

String hello = "Hello Pati";

System.out.println(hello.charAt(7));



// contains - czy zawiera np hello zwróci false-true
// charAt - pojedyncza listera która ma konkretny indeks 

}

}
 
// Inkrementacja zwiększenie wartości o 1 post/pre
// Dekrementacja zmniejszenie wartości o 1 post/pre


public class InkrementacjaDekrementacjaRef {

    public static void main(String[] args) {
       int a =0;
       System.out.println("Wartość a: " + a); //0
       int b =a++; // incrementacja ++ o 1, jeśli po zmiennej to post
       System.out.println("Wartość b: " + b); // zwraca wartość a przed inkrementacją 0
       System.out.println("Wartość a: " + a); //1
       int c = ++a; // pre najpierw zwiększamy wartość a  a pozniej przypisujemy do zmiennej c
       System.out.println("Wartość c: " + c); // 2
       System.out.println("Wartość a: " +a); // 2

       /*int x = 5;
        x++;     // inkrementacja zmiennej x o 1
        System.out.println(x); // wynik: 6 */


        // dekremenacja
        int d =0;
        System.out.println("Watrość d: " + d); //0
        int e = d--;
        System.out.println("Wartość e: " + e); //0
        System.out.println("Wartość d: " + d); //-1
        int f = --d;
        System.out.println("Wartość f: " + f); //-2
        System.out.println("Wartość d: " + d); //-2

        // często w pętlach

        /*int a, b = 13, c;
        
        a = ++b * 2;
        c = a++ + b;
        b = ++a + a-- - c++ - --c;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c); */

        int g = 7;
        int h = 3;
        int i;

        i = g-- * ++h + 2;

        System.out.println("g=" + g + ", h=" + h + ", i=" + i);

        }
}

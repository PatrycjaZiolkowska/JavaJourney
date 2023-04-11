package ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        
        // stosuje się i lub j
    for (int i = 40; i < 100; i = i+2) {
        System.out.println(i);
    }
        // czy liczba i jest podzielna przez 5 bez reszty
    for (int i =0; i <100; i++) {
        if(i%5==0)
        System.out.println(i);
    }
        // wyświetla na ekranie tekst "Bede robila zadania domowe"
    for (int sth =0; sth < 20; sth++) {
        System.out.println("Bede robila zadania domowe");
    }

}
}

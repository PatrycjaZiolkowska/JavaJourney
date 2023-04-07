import java.util.Scanner;

import javax.sound.midi.Soundbank;

import org.jcp.xml.dsig.internal.dom.DOMKeyValue;

public class Switch {
    public static void main(String[] args) {
        
        String dish = "Pizza";

        switch (dish) {
        case "Pizza":
            System.out.println("Price is 22$");
            break; // aby przerwać 
        case "Salomon":
            System.out.println("Price is 35$");
            break;
        case "French fries":
            System.out.println("Price is 5$");
            break;
        default:
        System.out.println("No dish");
        }

        // TASK

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7 to represent the day of the week:");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Error: Invalid day number");
        }



    }
}
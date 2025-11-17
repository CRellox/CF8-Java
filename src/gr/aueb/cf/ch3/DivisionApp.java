package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δώσει αριθμητή και
 * παρονομαστή και το πρόγραμμα πρέπει
 * να ελέγξει αν ο παρονομαστής είναι 0, γιατί
 * δεν μπορεί γίνει διαίρεση με το μηδέν.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

     while (true) {
        System.out.println("Παρακαλώ δώστε τον αριθμητή");
        numerator = scanner.nextInt();

        System.out.println("Δώστε παρανομαστή");
        denominator = scanner.nextInt();

        if (denominator == 0 ) {
            System.out.println("Παρονομαστής δεν πρέπει να είναι 0, Προσπαθήστε ξανά");
            //break;
            continue;
        }

        result = numerator / denominator;
        System.out.printf("%d / %d = %d\n", numerator,  denominator, result);
     }
    }
}

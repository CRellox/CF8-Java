package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει μια τιμή και το πρόγραμμα
 * υπολογίζει την τιμή με το ΦΠΑ. Για παράδειγμα, αν
 * ο ΦΠΑ είναι 24% (0.24) και ο χρήστης δώσει τιμή 100
 * το αποτέλεσμα θα είναι 124.
 */
public class PriceWithVat {

    public static void main(String[] args) {
            // Δήλωση μεταβλήτών και αρχικοποίηση.
            Scanner scanner = new Scanner(System.in);
            double inputPrice = 0.0;
            double priceWithVat = 0.0;
            double computedVat = 0.0;
            final double VAT_RATE = 0.24;

            // Εντολές.
            System.out.println("Παρακαλώ εισάγετε την τιμή");
            inputPrice = scanner.nextDouble();
            computedVat = inputPrice * VAT_RATE;
            priceWithVat = inputPrice + (inputPrice * VAT_RATE);

            // Αποτέλεσμα.
            System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, computedVat, priceWithVat);



    }
}

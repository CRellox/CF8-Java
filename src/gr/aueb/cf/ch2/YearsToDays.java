package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακαίρεος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσμα είναι 7300 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {
        // Δήλωση μεταβλήτών και αρχικοποίηση.
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        // Εντoλές.
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας.");
        inputAgeInYears= scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_PER_YEAR;

        // Αποτέλεσμα.
        System.out.printf("Ηλικία σε έτη: %d , Ηλικία σε ημέρες: %d", inputAgeInYears, ageInDays);


    }

}

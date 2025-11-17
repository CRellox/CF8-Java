package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών με την χρήση μεθόδων.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Επιτυχείς Εισαγωγή");
                case 2 -> System.out.println("Επιτυχείς Διαγραφή");
                case 3 -> System.out.println("Επιτυχείς Ενημέρωση");
                case 4 -> System.out.println("Επιτυχείς Αναζήτηση");
                case 5 -> System.out.println("Επιτυχείς Έξοδος");
                default -> System.out.println("Λάθος");
            }
        } while (choice != 5);    // 5 is Quit.
    }

    public static void printMenu() {
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω\n");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }
}

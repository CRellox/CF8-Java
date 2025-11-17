package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το
 * stdin (keyboard) διαβάζει και υπολογίζει το αποτέλεσμα
 */

public class ScannerAddApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.print("παρακαλώ εισάγετε δύο ακεραίους");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("το άθροισμα των %d και %d είναι ισο με %d", num1, num2, sum);
    }
}

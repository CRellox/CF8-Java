package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψήφιο ακέραιο και το πρόγραμμα
 * υπολογίζει το άθροισμα των ψηφίων του ακεραίου.
 * Για παράδειγμα, αν ο χρήστης δώσει το 32, τότε
 * το άθροισμα των ψηφίων είναι 3 + 2 = 5
 */
public class DigitsCount {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών.
        Scanner scanner = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;
        int inputNum = 0;

        // Εντολές.
        System.out.println("Παρακαλώ εισάγετε ένα διψήφιο ακέραιο");
        inputNum = scanner.nextInt();

        inputNum = inputNum / 10;
        rightDigit = inputNum % 10;
        sumOfDigits = leftDigit + rightDigit;

        // Αποτέλεσμα.
        System.out.printf("Input number: %d, Left Digit: %d , Right Digit: %d, Sum of digits: %d",
                inputNum, leftDigit, rightDigit, leftDigit);



    }
}

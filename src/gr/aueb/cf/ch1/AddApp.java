package gr.aueb.cf.ch1;

/**
 * Προσθέτει δυο ακεραίους και εμφανίζει το
 * αποτελέσμα στην κονσόλα.
 */

public class AddApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος (%d=εμφανίζει ακέραιους αριθμούς. Και το \n παράγει ενα καινό προς τα κάτω.)
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το αποτέλεσμα των: " + num1 + " και " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το αποτέλεσμα των: %d και %d είναι ίσο με: %d \n", num1, num2, result);
    }
}
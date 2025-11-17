package gr.aueb.cf.ch3;

/**
 * Δίνουμε αρχική τιμή, τελική τιμή, βήμα αύξησης
 * και υπολογίζει το πλήθος των interations (επαναλήψεων).
 */

public class GenericWhileApp {

    public static void main(String[] args) {
        int start = 1;
        int endVal = 10;
        int step = 1;
        int interations = 0;

        while (start <= endVal) {
            interations++;
            start += step;      // start = start + step
        }

        System.out.println("Αποτέλεσμα επαναλήψεων: " + interations);
    }
}

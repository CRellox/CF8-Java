package gr.aueb.cf.ch20_review_challenges;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας ακεραίων.
 * Να υπολογιστεί το άθροισμα των στοιχείων του.
 */
public class SumOfArray1b {

    public static void main(String[] args) {

    }

    public static int sumOFArray(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}



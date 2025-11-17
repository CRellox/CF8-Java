package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 σειρές με αστεράκια (*)
 * όπου 1η σειρά 1 αστεράκι, στη
 * 2η σειρά 2 αστεράκια, κλπ μέχρι
 * τη 1η σειρά με 10 αστεράκια.
 */
public class StarsAsc10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println('*');
            }
            System.out.println();
        }
    }
}

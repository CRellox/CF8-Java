package gr.aueb.cf.ch7;

/**
 * Ελέγχει ένα String είναι παλινδρομικό.
 * Για παράδειγμα, το "AttA" είναι παλινδρομικό.
 * Hint. Ο StringBuilder παρέχει τη sb.reverse()
 * Hint. Ο StringBuilder παρέχει τη sb.toString()
 */
public class StrPalindrome {

    public static void main(String[] args) {
        String s = "AttA";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}

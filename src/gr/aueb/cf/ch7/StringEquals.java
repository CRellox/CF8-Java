package gr.aueb.cf.ch7;

/**
 *
 */
public class StringEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "ATHENS";

        boolean equals1 = s1 == s2;     // True, γιατί και το s1 και το s2 δείχνουν στην ίδια θέση.
        boolean equals2 = s1  == s3;    // False,

        boolean equals3 = s1.equals(s2);    // True
        boolean equals4 = s1.equals(s3);    // True

        boolean equals5 = s1.equals(s4);                // False
        boolean equals6 = s1.equalsIgnoreCase(s4);      // True
    }
}

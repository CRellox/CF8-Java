package gr.aueb.cf.ch2;

/**
 * Προσθέτει δυο ακεραίους αλλά το αποτέλεσμα
 * δημιουργεί υπερχείλιση (overflow)
 */

public class OverflowApp {

    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 1;
        int result = 0;

            result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι: " + result);

    }
}

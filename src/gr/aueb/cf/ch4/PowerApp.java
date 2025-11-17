package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το base^power με επαναηπτική
 * for. Διαβάζει τα base, power από τον χρήστη
 * και εκτυπώνει το αποτέλεσμα.
 */
public class PowerApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους, base και power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.printf("%d^%d = %d", base, power, result);

    }
}

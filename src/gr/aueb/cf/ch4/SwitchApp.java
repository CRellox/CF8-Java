package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Η switch-case χρησιμοποιείται αντί των
 * πολλαπλών if-then-else.
 */
public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Παρακαλώ εισάγετε ένα απο τα παρακάτω: ");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team game");
        System.out.println("4. Exit");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("One-player game started");
                break;
            case 2:
                System.out.println("Two-player game started");
                break;
            case 3:
                System.out.println("Team game started");
                break;
            case 4:
                System.out.println("Exit game");
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
    }
}

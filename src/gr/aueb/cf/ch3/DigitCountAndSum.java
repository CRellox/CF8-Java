package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο. Το πρόγραμμα
 * υπολογίζει το πλήθος των ψηφίων του ακεραίου και
 * το άθροισμα των ψηφίων. Για παράδειγμα αν ο χρήστης
 * εισάγει τον ακέραιο 12345, τότε το πλήθος των ψηφίων
 * είναι 5 και το άθροισμα είναι 1 + 2 + 3 + 4 + 5 = 15.
 */
public class DigitCountAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int digitsCount = 0;
        int digitsSum = 0;
        int num;
        int rightDigit;


        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        inputNum = scanner.nextInt();
        num = inputNum;

        do {
                    //System.out.println("Loop: " + digitsCount);
            rightDigit = num % 10;
                    //System.out.println("to right digit einai " + rightDigit);
            digitsCount++;
                    //System.out.println("to digit count einia " + digitsCount);
            digitsSum += rightDigit;
                    //System.out.println("to digit sum einai " +digitsSum);
            num = num / 10;
                    //System.out.println("to num sto telos tou loop einai " + num);
        } while (num != 0);
        System.out.println("Δώστε τον ακέραιο: " + inputNum);
        System.out.printf("Πλήθος ψηφιών: %d, Άθροισμα ψηφιών: %d", digitsCount, digitsSum);
        }
    }

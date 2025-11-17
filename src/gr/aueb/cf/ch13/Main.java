package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1, "GR12345", "Alice", "W.", "F0765430", 100);

        try {
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(50,"F0765430");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "F0123");        // Δίνει Exception.

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

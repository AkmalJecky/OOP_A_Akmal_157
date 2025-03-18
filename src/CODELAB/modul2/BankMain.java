// BankMain.java
public class BankMain {
    public static void main(String[] args) {
        // Create two accounts
        BankAccount account1 = new BankAccount("157", "Akmal", 6000);
        BankAccount account2 = new BankAccount("155", "Dika", 5000);

        // Display initial account info
        account1.displayInfo();
        account2.displayInfo();

        // Transactions for account1
        account1.depositAccount(50000);
        account1.withDraw(65000);

        // Transactions for account2
        account2.depositAccount(50000);
        account2.withDraw(65000);
    }
}
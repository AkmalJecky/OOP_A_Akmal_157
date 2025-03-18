// BankAccount.java
class BankAccount {
    private String customerNumber;
    private String custName; // Fixed variable name
    private double balance;

    // Constructor
    public BankAccount(String customerNumber, String custName, double balance) {
        this.custName = custName;
        this.customerNumber = customerNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void depositAccount(double amount) {
        balance += amount;
        System.out.println(this.custName + " setor Rp." + amount + ". Saldo saat ini: Rp. " + balance);
    }

    // Method to withdraw money
    public void withDraw(double amount) {
        if (amount > balance) {
            System.out.println(this.custName + " menarik Rp. " + amount + ". Saldo tidak cukup. Saldo saat ini: Rp. " + balance + "\n");
        } else {
            balance -= amount;
            System.out.println(this.custName + " menarik Rp. " + amount + ". Sisa saldo sekarang: Rp. " + balance);
        }
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("\nNama Rekening: " + this.custName);
        System.out.println("Nomor Rekening: " + this.customerNumber);
        System.out.println("Saldo Rekening: Rp. " + this.balance + "\n");
    }
}
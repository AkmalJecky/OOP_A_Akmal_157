class bank {
    private String customer_number;
    private String name;
    private double balance;

    bank (String customer_number, String name, double balance){
        this.name = name;
        this.customer_number = customer_number;
        this.double = balance;
    }

    public double DepositAccount (double amount){
        this.balance += amount;
    }
}
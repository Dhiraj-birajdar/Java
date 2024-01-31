package encapsulation;

class BankAccount {
    // Private variables (encapsulated)
    private String accountNumber;
    private double balance;
    private String accountHolder;

    // Public constructor
    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Public getter methods to access private variables (encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful. New balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

}


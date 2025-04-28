package bank;

public class CheckingAccount {
    private double balance;

    public CheckingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}

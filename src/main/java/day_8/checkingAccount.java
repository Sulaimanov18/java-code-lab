package day_8;

public class checkingAccount {
    private double balance;

    public checkingAccount(double balance){
        this.balance=balance;
    }

    public void add(double num){
        this.balance+=num;
    }

    public double getBalance(){
        return balance;
    }
}

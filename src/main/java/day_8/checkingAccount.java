package day_8;

public class checkingAccount {
    private double balance;

    public checkingAccount(double balance){
        this.balance=balance;
    }

    public void add(double num){
        this.balance+=num;
    }

    public void substring(double num) {
        this.balance-=balance-num;
    }

    public void multiply(double balance){
        this.balance *= balance;
    }

    public void divide(double num){
        this.balance/=num;
    }

    public double getBalance(){
        return balance;
    }


}

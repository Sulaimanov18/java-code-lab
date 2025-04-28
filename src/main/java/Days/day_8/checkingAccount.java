package Days.day_8;

public class checkingAccount {
    private double balance;

    public checkingAccount(double balance){
        this.balance=balance;
    }

    public void add(double num){
        this.balance+=num;
    }

    public void withdraw(double num) {
        this.balance-=balance-num;
    }
    public void reset(){
        this.balance=0;
    }

    public double getBalance(){
        return balance;
    }


}

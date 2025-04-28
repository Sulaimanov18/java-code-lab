package Days.day_8;

public class test_checkingAccount {

    public static void main(String[] args) {
        checkingAccount account = new checkingAccount(0);
        account.add(11);
        account.add(11);
        System.out.println(account.getBalance());
        account.withdraw(4);
        System.out.println(account.getBalance());
        account.reset();
        System.out.println(account.getBalance());


    }
}

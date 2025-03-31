import java.util.Scanner;

public class test_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstname = scanner.next();
        System.out.println("What is your last name?");
        String lastname = scanner.next();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Your full name is: " + firstname +" " + lastname);
        System.out.println(checkAge(age) ? "Your age is legal" : "Your age is illegal");

        }

    private static boolean checkAge(int a){
        if(a>=18){
            return true;
        }
        return false;
    }


}

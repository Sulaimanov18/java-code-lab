import java.util.HashMap;
import java.util.Map;
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
        System.out.println(countLetters("Timur"));
        }

    private static boolean checkAge(int a){
        if(a>=18){
            return true;
        }
        return false;
    }


    private static Map<Character, Integer> countLetters(String word){
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : word.toCharArray()){
            if(Character.isLetter(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
        }
        return map;
    }

}


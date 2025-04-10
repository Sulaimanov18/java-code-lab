package day_4;

import java.util.HashMap;
import java.util.Map;

public class count_words {

    public static void main(String[] args) {

        System.out.println(countLetters("Timur"));
        System.out.println(countLetters(""));
        System.out.println(countLetters("11111"));
        System.out.println(countLetters("aa"));
        System.out.println(countLetters("a12a"));
        System.out.println(countLetters("*&*@"));
        System.out.println(countLetters("@#$@"));

    }


    private static Map<Character, Integer> countLetters(String str){
        Map<Character, Integer> count = new HashMap<>();
        str = str.toLowerCase();

        for (Character ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }

        return count;
    }

    private static Map<Character, Integer> countLetters1(String str){
        Map<Character, Integer> count = new HashMap<>();
        str = str.toLowerCase();

        for (Character ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }

        return count;
    }
}

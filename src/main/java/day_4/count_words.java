package day_4;

import java.util.HashMap;
import java.util.Map;

public class count_words {

    public static void main(String[] args) {

        System.out.println(countLetters("aaaaaaa"));

    }


    private static Map<Character, Integer> countLetters(String str){
        Map<Character, Integer> count = new HashMap<>();

        for (Character ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }

        return count;
    }
}

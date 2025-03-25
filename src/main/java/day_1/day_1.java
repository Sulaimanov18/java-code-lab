package day_1;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class day_1 {

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return  new StringBuilder(input).reverse().toString(); // ✅ CORRECT
    }

    public static String reverseWithLoop(String input){
        String reversed = "";
        for (int i = input.length()-1; i>=0 ; i--) {
            reversed+=input.charAt(i);
        }
        return  reversed;
    }

    private static int reverseNum(int num){
        int reversed = 0 ;

        while (num!=0){
            int digit = num%10;
            reversed = reversed*10+digit;
            num/=10;

        }
        return reversed;
    }

    public static void main(String[] args) {

        String name1="Timur Sulaimanov";
        String name2="Andrew Tate";
        String name3="Conor Macgregor";
        System.out.println(reverse(name1));
        System.out.println(reverseWithLoop(name2));
        System.out.println(reverseWithLoop(name3));
        System.out.println(reverseNum(1234));
        System.out.println(reverseNum(987654321));
    }

    @Test
    public void testReverse_withRegularNames() {
        assertEquals("vonamialuS rumiT", reverse("Timur Sulaimanov"));
        assertEquals("htimS nhoJ", reverse("John Smith"));
        assertEquals("etaT werdnA", reverse("Andrew Tate"));
        assertEquals("rumiT", reverseWithLoop("Timur") );
    }

    @Test
    public void testReverse_withEmptyString() {
        assertEquals("", reverse(""));
    }

    @Test
    public void testReverse_withSingleChar() {
        assertEquals("A", reverse("A"));
    }

    @Test
    public void testReverse_withNull() {
        assertEquals(null, reverse(null));
    }

    @Test
    public void testReverse_withUnicode() {
        assertEquals("界世 好你", reverse("你好 世界"));
    }
}

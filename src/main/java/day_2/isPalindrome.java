package day_2;

/**
 * Utility class for common string-related operations.
 */
public class isPalindrome {

    // Private constructor to prevent instantiation

    /**
     * Checks whether a given string is a palindrome.
     *
     * This implementation:
     * - Ignores case sensitivity
     * - Skips non-alphanumeric characters (e.g., punctuation, spaces)
     * - Operates in O(n) time and O(1) space
     *
     * @param input The string to evaluate
     * @return true if the input is a palindrome; false otherwise
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("momuu"));
        System.out.println(isPalindrome("moooom"));
        System.out.println(isPalindrome("Mom"));
        System.out.println(isPalindrome("mo12213m"));
    }
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Define null and empty strings as non-palindromes for safety
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // Advance left pointer to next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) {
                left++;
            }

            // Advance right pointer to previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(input.charAt(left));
            char rightChar = Character.toLowerCase(input.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

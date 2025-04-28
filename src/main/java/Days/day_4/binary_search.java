package Days.day_4;

import java.util.*;

public class binary_search {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 9, 12};  // отсортированный массив
        int target = 3;
        // число, которое нужно найти
        int[] input = {1, 2, 2, 3, 4, 4, 5, 55,5};

        System.out.println(searchBinary(nums, target));
        System.out.println(Arrays.toString(removeDuplicates(input)));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(4));
        System.out.println(isFibonacci(0));
        System.out.println(isFibonacci(1));
    }

    private static int searchBinary(int []arr, int target){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return  mid;
            } else if (arr[mid]>target) {
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

    private static void newMethod(){

    }




    private static Object[] removeDuplicates(int[] arr){

        Set<Integer> sorted = new HashSet<>();
        for (int i = 0; i<arr.length; i++) {
            sorted.add(arr[i]);
        }

        return sorted.toArray();
    }

    private static boolean isFibonacci(int num) {
        if (num == 0 || num == 1) return true;

        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == num;
    }

    private static Map<Character, Integer> countWords(String str){
        Map<Character, Integer> countedMap = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if(Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                countedMap.put(ch, countedMap.getOrDefault(ch, 0)+1);
            }
        }
        return countedMap;
    }

}

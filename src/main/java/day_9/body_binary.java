package day_9;

public class body_binary implements binary {

    @Override
    public int binarySearch(int [] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low<+high){
            int mid =(low+high) /2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
            high++;
            low--;
        }
        return -1;
    }


    @Override
    public boolean isPalindrome() {
        return false;
    }
}

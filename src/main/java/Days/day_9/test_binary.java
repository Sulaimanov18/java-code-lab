package Days.day_9;

public class test_binary {

    public static void main(String[] args) {
        body_binary body = new body_binary();
        int [] arr = {1,4, 5,7,8, 10, 14, 20,40, 99 };
        System.out.println(body.binarySearch(arr, 7));
        System.out.println(body.binarySearch(arr, 20));
        System.out.println(body.binarySearch(arr, 99));
        System.out.println(body.binarySearch(arr, 1));
    }
}

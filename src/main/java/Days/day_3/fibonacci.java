package Days.day_3;

public class fibonacci {
    public static void main(String[] args) {

        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(13));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(11));
        System.out.println(isFibonacci(10));



    }

    private static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }

}

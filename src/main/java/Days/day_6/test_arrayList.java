package Days.day_6;

public class test_arrayList {

        public static void main(String[] args) {
            array_list list = new array_list();

            list.add(10);
            list.add(20);
            list.add(30);
            list.print(); // 10 -> 20 -> 30 -> null

            list.remove(20);
            list.print(); // 10 -> 30 -> null

            System.out.println("Size: " + list.size()); // Size: 2

    }


}

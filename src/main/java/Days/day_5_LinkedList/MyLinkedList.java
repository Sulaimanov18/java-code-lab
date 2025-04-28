package Days.day_5_LinkedList;

public class MyLinkedList {

    // Внутренний класс — Узел списка
    private static class Node {
        int data;       // значение
        Node next;      // ссылка на следующий узел

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;  // голова списка (первый элемент)

    // Метод добавления элемента в конец списка
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;  // если список пуст, добавляем в голову
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // идём до конца
            }
            current.next = newNode;  // добавляем в конец
        }
    }

    // Метод вывода всех элементов списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void removeLastElement() {
        if (head == null) {
            // Пустой список — нечего удалять
            return;
        }

        if (head.next == null) {
            // В списке только один элемент — удаляем голову
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;  // Идем до предпоследнего элемента
        }
        current.next = null;  // Удаляем последний элемент
    }


    // Тестируем в main
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();
        list.removeLastElement();
        list.printList();  // Результат: 10 -> 20 -> 30 -> null

    }
}

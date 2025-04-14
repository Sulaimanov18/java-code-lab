package day_6;

public class array_list {
    // Ссылка на первый элемент (узел) списка
    private Node head;

    // Внутренний класс - определяет один узел списка
    private static class Node {
        int data;      // значение, которое хранит узел
        Node next;     // ссылка на следующий узел

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Метод для добавления элемента в конец списка
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode; // если список пустой — новый узел становится головой
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // идём до конца списка
            }
            current.next = newNode; // добавляем новый узел в конец
        }
    }

    // Метод для вывода всех элементов списка
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Метод для удаления элемента по значению
    public void remove(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next; // если удаляемый — первый элемент
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // пропускаем узел, который хотим удалить
        }
    }

    // Метод возвращает размер (кол-во узлов)
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}




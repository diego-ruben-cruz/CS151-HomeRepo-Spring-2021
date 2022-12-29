package ch05;

public class MyLL {
    int index = 0;
    int index2 = 1;
    Node head = null;

    public void addValueToHead(int value) {
        /*
        1 -> 2 -> null
        add 5
        5 -> 1 -> 2 -> null
         */
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }
}

class TestLL {
    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.addValueToHead(2);
        list.addValueToHead(1);
        list.addValueToHead(5);

        Node current = list.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
            current.next = null;
        }

    }
}

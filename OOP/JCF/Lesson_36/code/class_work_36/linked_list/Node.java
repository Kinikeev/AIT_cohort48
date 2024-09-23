package class_work_36.linked_list;

public class Node <E> {
    // fields
    Node<E> prev; // тип Node - взялся от Java8 prev - предыдущий
    E data;
    Node<E> next;

    // constructor
    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

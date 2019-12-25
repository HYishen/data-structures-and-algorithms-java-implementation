package list.link.single;

import java.util.Objects;

/**
 * <pre>
 * Single Link List。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class SingleLinkList<T> {

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void add(T t) {
        if (this.head == null) {
            this.head = new Node(t);
            this.tail = this.head;
        } else {
            this.tail.next = new Node(t);
            this.tail = this.tail.next;
        }
        size++;
    }

    public boolean remove(T t) {
        if (head == null) {
            return false;
        }
        if (Objects.equals(head.data, t)) {
            head = head.next;
            size--;
            if (size == 0) {
                this.tail = head;
            }
            return true;
        }

        Node preNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            if (Objects.equals(currentNode.data, t)) {
                if (this.tail == currentNode) {
                    this.tail = preNode;
                }
                preNode.next = currentNode.next;
                size--;
                return true;
            }
            preNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.data.toString() + ",");
            currentNode = currentNode.next;
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    private class Node {
        private T data;
        private Node next;

        public Node() {
        }

        public Node(T data) {
            this.data = data;
        }
    }

}

package s2.w9;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SingleLinkedList<T> {

    @Nullable
    Node<T> head;

    @Nullable
    Node<T> tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {

            @Nullable
            Node<T> temp = head;

            while (temp != null) {
                System.out.print((temp.data) + " -> ");
                temp = temp.next;
            }

        } else {
            System.out.println("The linked list is empty");
        }
    }

    public void addFirst(T payload) {

        Node<T> temp = new Node<T>(payload, null);

        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

    }


    public void addLast(T payload) {

        Node<T> temp = new Node<T>(payload, null);

        if (isEmpty()) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

    }

    public void insertAfter(T key, T payload) {

        Node<T> nodePayload = new Node<T>(payload, null);
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data == key) {
                nodePayload.next = temp.next;
                temp.next = nodePayload;
                if (temp.next == null) tail = nodePayload;
                break;
            }
            temp = temp.next;
        }

    }

    // Task Here :
    public void insertBefore(T key, T payload) {
        Node<T> nodePayload = new Node<T>(payload, null);
        Node<T> temp = head;

        while (temp != null) {

            if (temp.next.data == key) {
                Node<T> temporary = temp.next;
                temp.next = nodePayload;
                nodePayload.next = temporary;
                break;
            }

            temp = temp.next;
        }

    }

    @NotNull
    public Node<T> getDataByIndex(int targetIndex) {

        int i = 0;

        assert head != null;
        @NotNull
        Node<T> temp = head;

        while (i < targetIndex) {
            assert temp.next != null;
            temp = temp.next;
            i++;
        }

        return temp;
    }

    @NotNull
    public Integer getDataByKey(T key) {

        Node<T> temp = head;

        int counter = 0;

        while (temp != null && temp.data != key) {
            counter++;
            temp = temp.next;
        }

        return counter;

    }

}

package s2.quiz2;

import org.jetbrains.annotations.Nullable;

public class LinkedBuyer {

    @Nullable
    Buyer head;

    @Nullable
    Buyer tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String name, String phoneNumber) {
        if (isEmpty()) {
            head = new Buyer(null, name, phoneNumber, null);
        } else {
            Buyer buyer = new Buyer(null, name, phoneNumber, head);
            head = buyer;
        }
    }

    public void addLast(String name, String phoneNumber) {
        if (isEmpty()) {
            addFirst(name, phoneNumber);
        } else {
            Buyer temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Buyer payload = new Buyer(temp, name, phoneNumber, null);
            temp.next = payload;
        }
    }

    // TODO : Never throw an exception if you dont know to catch it :D
    @Nullable
    public Buyer removeFirst() {
        if (isEmpty()) {
            System.out.println("EMPTY");
            return null;
        } else {
            Buyer temp = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return temp;
        }
    }

    public void print() {
        int tempIndex = 1;
        if (!isEmpty()) {
            Buyer temp = head;
            while (temp != null) {
                System.out.printf("%5s %10s %20s \n", tempIndex, temp.name, temp.phoneNumber);
                tempIndex++;
                temp = temp.next;
            }
        } else {
            System.out.println("EMPTY");
        }
    }

}

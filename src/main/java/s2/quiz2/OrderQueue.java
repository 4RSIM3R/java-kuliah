package s2.quiz2;

import org.jetbrains.annotations.Nullable;

public class OrderQueue {

    @Nullable
    Order head;

    @Nullable
    Order tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int number, String name, int total) {
        if (isEmpty()) {
            head = new Order(null, number, name, total, null);
        } else {
            Order order = new Order(null, number, name, total, head);
            head = order;
        }
    }

    public void addLast(int number, String name, int total) {
        if (isEmpty()) {
            addFirst(number, name, total);
        } else {
            Order temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Order payload = new Order(temp, number, name, total, null);
            temp.next = payload;
        }
    }

    public double calculateIncome() {

        double result = 0;

        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            Order temp = head;
            while (temp != null) {
                result += temp.total;
                temp = temp.next;
            }
        }

        return result;
    }

    // In-place sorting
    public void sortByName() {

        Order temp = head;
        Order index;

        while (temp != null) {

            index = temp.next;

            while (index != null) {

                if (temp.name.compareTo(index.name) == 1) {

                    int tempNumber = temp.number;
                    int tempTotal = temp.total;
                    String tempName = temp.name;


                    temp.name = index.name;
                    temp.total = index.total;
                    temp.number = index.number;

                    index.name = tempName;
                    index.number = tempNumber;
                    index.total = tempTotal;

                }

                index = index.next;
            }

            temp = temp.next;
        }

    }

    public void print() {
        if (!isEmpty()) {
            Order temp = head;
            while (temp != null) {
                System.out.printf("%5s %10s %20s \n", temp.number, temp.name, temp.total);
                temp = temp.next;
            }
        } else {
            System.out.println("EMPTY");
        }
    }

}

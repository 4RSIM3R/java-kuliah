package s2.uas;

import org.jetbrains.annotations.Nullable;

public class LinkedTransaction {

    int counter = 1;

    @Nullable
    TransactionNode head;

    @Nullable
    TransactionNode tail;

    LinkedItem linkedItem;

    public LinkedTransaction(LinkedItem linkedItem) {
        this.linkedItem = linkedItem;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int quantity, String itemCode, boolean isMember) {
        ItemNode item = linkedItem.searchItemByCode(itemCode);

        assert item != null;
        int total = quantity * item.price;

        if (total > 50000) {
            total = (int) (total - (total * 0.05));
        }

        if (isMember) {
            total = (int) (total - (total * 0.02));
        }

        if (isItemEmpty(item)) {
            System.out.println("Item is empty");
            return;
        }

        if (isEmpty()) {
            head = new TransactionNode(null, null, counter, quantity, item, total);
        } else {
            head = new TransactionNode(null, head, counter, quantity, item, total);
        }

        linkedItem.updateStock(itemCode, item.stock - quantity);
        counter++;
    }

    public void addLast(int quantity, String itemCode, boolean isMember) {
        ItemNode item = linkedItem.searchItemByCode(itemCode);

        if (item == null) {
            System.out.printf("ITEM WITH CODE %s NOT FOUND \n", itemCode);
            return;
        }

        if (isItemEmpty(item)) {
            System.out.println("Item is empty");
            return;
        }

        if (isEmpty()) {
            addFirst(quantity, itemCode, isMember);
        } else {
            TransactionNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            int total = quantity * item.price;

            if (total > 50000) {
                total = (int) (total - (total * 0.05));
            }

            if (isMember) {
                total = (int) (total - (total * 0.02));
            }

            temp.next = new TransactionNode(temp, null, counter, quantity, item, total);
            linkedItem.updateStock(itemCode, item.stock - quantity);
            counter++;
        }

    }

    public boolean isItemEmpty(ItemNode item) {
        return item.stock == 0;
    }

    public void print() {
        TransactionNode temp = head;
        int totalTransaction = 0;
        while (temp != null) {
            System.out.printf("CODE : %d, Item Name : %s, Quantity : %d, Total Price : %d \n", temp.code, temp.item.name, temp.quantity, temp.totalPrice);
            totalTransaction += temp.totalPrice;
            temp = temp.next;
        }
        System.out.printf("Total Transaction : %d \n", totalTransaction);
    }


}

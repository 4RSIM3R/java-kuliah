package s2.uas;

import org.jetbrains.annotations.Nullable;

public class LinkedItem {

    @Nullable
    ItemNode head;

    @Nullable
    ItemNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String name, String code, int price, int stock) {
        if (isEmpty()) {
            head = new ItemNode(null, null, code, name, price, stock);
        } else {
            head = new ItemNode(null, head, code, name, price, stock);
        }
    }

    public void addLast(String name, String code, int price, int stock) {
        if (isEmpty()) {
            addFirst(name, code, price, stock);
        } else {
            ItemNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            ItemNode payload = new ItemNode(temp, null, code, name, price, stock);
            temp.next = payload;
            tail = payload;
        }
    }

    @Nullable
    public ItemNode searchItemByCode(String code) {

        @Nullable
        ItemNode temp = head;

        @Nullable
        ItemNode result = null;
        while (temp != null) {
            if (temp.code.equals(code)) {
                result = temp;
                break;
            }
            temp = temp.next;
        }

        return result;
    }

    public void updateStock(String code, int newStock) {
        @Nullable
        ItemNode pointedItem = searchItemByCode(code);

        if (pointedItem != null) {
            pointedItem.setStock(newStock);
        } else {
            System.out.printf("ITEM WITH CODE %s NOT FOUND \n", code);
        }
    }

    public void print() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.printf("CODE : %s, NAME : %s, PRICE : %d, STOCK : %d \n", temp.code, temp.name, temp.price, temp.stock);
            temp = temp.next;
        }
    }


}

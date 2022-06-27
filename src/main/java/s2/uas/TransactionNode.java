package s2.uas;

import org.jetbrains.annotations.Nullable;

public class TransactionNode {

    @Nullable
    TransactionNode prev;

    @Nullable
    TransactionNode next;

    int code;

    int quantity;

    @Nullable
    ItemNode item;

    int totalPrice;

    public TransactionNode(
            @Nullable TransactionNode prev,
            @Nullable TransactionNode next,
            int code, int quantity,
            @Nullable ItemNode item,
            int totalPrice
    ) {
        this.prev = prev;
        this.next = next;
        this.code = code;
        this.quantity = quantity;
        this.item = item;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "TransactionNode{" +
                "prev=" + prev +
                ", next=" + next +
                ", code=" + code +
                ", quantity=" + quantity +
                ", item=" + item +
                ", totalPrice=" + totalPrice +
                '}' + "\n";
    }
}

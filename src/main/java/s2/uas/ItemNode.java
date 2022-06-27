package s2.uas;

import lombok.Setter;
import org.jetbrains.annotations.Nullable;

public class ItemNode {

    @Nullable
    ItemNode prev;

    @Nullable
    ItemNode next;

    String code;

    String name;

    int price;

    @Setter
    int stock;

    public ItemNode(@Nullable ItemNode prev, @Nullable ItemNode next, String code, String name, int price, int stock) {
        this.prev = prev;
        this.next = next;
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ItemNode{" +
                "prev=" + prev +
                ", next=" + next +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}' + "\n";
    }
}

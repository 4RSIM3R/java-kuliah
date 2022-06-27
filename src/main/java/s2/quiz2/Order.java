package s2.quiz2;

import org.jetbrains.annotations.Nullable;

public class Order {

    @Nullable
    Order prev;

    int number;

    String name;

    int total;

    @Nullable
    Order next;

    public Order(@Nullable Order prev, int number, String name, int total, @Nullable Order next) {
        this.prev = prev;
        this.number = number;
        this.name = name;
        this.total = total;
        this.next = next;
    }


}

package s2.quiz2;

import org.jetbrains.annotations.Nullable;

public class Buyer {

    @Nullable
    Buyer prev;

    String name;

    String phoneNumber;

    @Nullable
    Buyer next;

    public Buyer(@Nullable Buyer prev, String name, String phoneNumber, @Nullable Buyer next) {
        this.prev = prev;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = next;
    }
}

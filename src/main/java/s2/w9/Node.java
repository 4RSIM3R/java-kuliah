package s2.w9;

import org.jetbrains.annotations.Nullable;

public class Node<T> {

    T data;

    @Nullable
    Node<T> next;

    public Node(T data, @Nullable Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

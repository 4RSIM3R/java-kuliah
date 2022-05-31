package s2.w9;

import java.util.Stack;

public class StackToLinkedList {

    public static Stack<String> stack = new Stack<>();

    public static void initStack() {
        stack.push("Android");
        stack.push("Computer");
        stack.push("Database");
        stack.push("Mathematics");
        stack.push("Algorithm");
        stack.push("Statistics");
        stack.push("Multimedia");
    }

    public static void main(String[] args) {

        initStack();

        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<String>();

        while (!stack.isEmpty()) {
            String payload = stack.pop();
            singleLinkedList.addLast(payload);
        }

        singleLinkedList.print();

    }

}

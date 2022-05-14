package s2.w8;

public class CustomQueue {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        arrayQueue.dequeue();

        arrayQueue.peek();

        arrayQueue.peekAt(0);
        arrayQueue.peekPosition(3);

//        arrayQueue.print();
    }

}

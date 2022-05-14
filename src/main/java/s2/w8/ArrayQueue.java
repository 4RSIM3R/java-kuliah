package s2.w8;

public class ArrayQueue {

    int max = 0;
    int[] data;
    int front = -1;
    int rear = -1;
    int size = 0;

    ArrayQueue(int n) {
        max = n;
        data = new int[max];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if(isEmpty()) {
            System.out.println("NO ELEMENT");
        } else {
            System.out.println(data[front]);
        }
    }

    void peekAt(int index) {
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            System.out.println(data[index]);
        }
    }

    int peekPosition(int payload) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == payload){
                result = i;
            }
        }
        return result;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("NO ELEMENT");
        } else {
            int i = front;
            while (i != rear) {
                System.out.printf("%d, ", data[i]);
                i = (i + 1) % max;
            }
            System.out.printf("%d ", data[i]);
        }
    }

    void enqueue(int payload) {
        if (isFull()) {
            System.out.println("FULL");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
            data[rear] = payload;
            size++;
        }
    }

    int dequeue() {
        int out = 0;
        if (isEmpty()) {
            System.out.println("EMPTY");
        } else {
            out = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return out;
    }



}

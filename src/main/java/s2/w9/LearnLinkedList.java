package s2.w9;

public class LearnLinkedList {

    public static void main(String[] args) {

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<Integer>();

        singleLinkedList.addFirst(10);
        singleLinkedList.addFirst(11);
        singleLinkedList.addLast(9);

        singleLinkedList.insertAfter(10, 2);

        singleLinkedList.insertBefore(10, 1);

        singleLinkedList.insertBefore(2, 3);

        singleLinkedList.print();

//        Node<Integer> result = singleLinkedList.getDataByIndex(1);
//
//        System.out.println(result.data);

    }

}

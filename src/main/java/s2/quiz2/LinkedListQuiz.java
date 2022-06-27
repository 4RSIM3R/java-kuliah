package s2.quiz2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedListQuiz {

    static LinkedBuyer linkedBuyer = new LinkedBuyer();
    static OrderQueue orderQueue = new OrderQueue();
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Runnable> mapMenuToAction = new HashMap<>();

    public static void initAction() {
        mapMenuToAction.put(1, LinkedListQuiz::addBuyerQueue);
        mapMenuToAction.put(2, LinkedListQuiz::printBuyerQueue);
        mapMenuToAction.put(3, LinkedListQuiz::removeBuyerQueue);
        mapMenuToAction.put(4, LinkedListQuiz::sortOrderQueueByName);
        mapMenuToAction.put(5, LinkedListQuiz::calculateIncomeFromOrder);
        mapMenuToAction.put(6, () -> System.exit(0));
    }

    public static void main(String[] args) {
        initAction();
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1. Add Queue");
        System.out.println("2. Print Queue");
        System.out.println("3. Remove Queue");
        System.out.println("4. Sort Queue By Name");
        System.out.println("5. Calculate Total Income");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("Choose 1 - 6 : ");
        int picked = scanner.nextInt();
        System.out.println();

        // Instead of using old-fashion `if-else`
        // just store the entire function to map and then invoke it like this
        mapMenuToAction.get(picked).run();
    }

    public static void addBuyerQueue() {
        System.out.println();
        System.out.print("Input Buyer Name : ");
        String name = scanner.next();
        System.out.print("Input Buyer Phone Number : ");
        String phoneNumber = scanner.next();
        linkedBuyer.addLast(name, phoneNumber);
        displayMenu();
    }

    public static void printBuyerQueue() {
        System.out.printf("%5s %10s %20s \n", "NUMBER", "NAME", "PHONE NUMBER ");
        System.out.println("-------------------------------------------------");
        linkedBuyer.print();
        displayMenu();
    }

    public static void removeBuyerQueue() {
        Buyer removedBuyer = linkedBuyer.removeFirst();

        System.out.println();
        System.out.print("Input Order Number : ");
        int orderNumber = scanner.nextInt();
        System.out.print("Input Order Name : ");
        String orderName = scanner.next();
        System.out.print("Input Order Total : ");
        int orderTotal = scanner.nextInt();

        orderQueue.addLast(orderNumber, orderName, orderTotal);

        displayMenu();
    }

    public static void sortOrderQueueByName() {

        orderQueue.sortByName();

        System.out.printf("%5s %10s %20s \n", "NUMBER", "NAME", "TOTAL ");
        System.out.println("-------------------------------------------------");

        orderQueue.print();

        displayMenu();

    }

    public static void calculateIncomeFromOrder() {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        double result = orderQueue.calculateIncome();

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.printf("Total Income %s \n", kursIndonesia.format(result));

        displayMenu();
    }

}

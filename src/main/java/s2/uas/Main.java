package s2.uas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static LinkedItem linkedItem = new LinkedItem();
    public static LinkedTransaction linkedTransaction = new LinkedTransaction(linkedItem);
    public static Map<Integer, Runnable> actions = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void initAction() {
        actions.put(1, Main::seeAllItem);
        actions.put(2, Main::addTransactions);
        actions.put(3, Main::seeAllTransaction);
        actions.put(4, () -> System.exit(0));
    }

    public static void seedItems() {
        linkedItem.addLast("Milk", "MILK", 15000, 100);
        linkedItem.addLast("Rice", "RICE", 7500, 100);
        linkedItem.addLast("Flour", "FLOUR", 12500, 100);
    }

    public static void seedTransactions() {
//        linkedTransaction.addLast(5, "MILK");
//        linkedTransaction.addLast(100, "RICE");
    }

    public static void displayMenu() {
        System.out.println("");
        System.out.println("1. See All Items");
        System.out.println("2. Add Transactions");
        System.out.println("3. See All Transactions");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Choose 1 - 4 : ");
        int picked = scanner.nextInt();
        actions.get(picked).run();
        System.out.println("");
    }

    public static void main(String[] args) {
        seedItems();
        seedTransactions();
        initAction();
        displayMenu();
    }

    public static void seeAllItem() {
        System.out.println("");
        linkedItem.print();
        displayMenu();
    }

    public static void addTransactions() {
        System.out.println("");
        System.out.print("Item Code : ");
        String itemCode = scanner.next();
        System.out.print("Quantity : ");
        int quantity = scanner.nextInt();
        System.out.print("Is Member : ");
        boolean isMember = scanner.next().equalsIgnoreCase("y");
        linkedTransaction.addLast(quantity, itemCode, isMember);
        System.out.println("");
        displayMenu();
    }

    public static void seeAllTransaction() {
        System.out.println("");
        linkedTransaction.print();
        System.out.println("");
        displayMenu();
    }


}

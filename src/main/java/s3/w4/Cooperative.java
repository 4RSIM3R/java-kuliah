package s3.w4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cooperative {

    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Runnable> mapMenuToAction = new HashMap<>();
    static Member member = new Member("James", 10000, 0);

    public static void main(String[] args) {
        initAction();
        displayMenu();
    }

    public static void initAction() {
        mapMenuToAction.put(1, Cooperative::addDebt);
        mapMenuToAction.put(2, Cooperative::payDebt);
        mapMenuToAction.put(3, Cooperative::displayInformation);
        mapMenuToAction.put(4, () -> System.exit(0));
    }

    public static void displayMenu() {
        System.out.println("");
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1. Add Debt");
        System.out.println("2. Pay Debt");
        System.out.println("3. Display Information");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.print("Choose 1 - 4 : ");
        int picked = scanner.nextInt();
        System.out.println("");
        mapMenuToAction.get(picked).run();
    }

    public static void addDebt() {
        System.out.print("Debt amount : ");
        int amount = scanner.nextInt();
        member.addDebt(amount);
        displayMenu();
    }

    public static void payDebt() {
        System.out.print("Pay Debt amount : ");
        int amount = scanner.nextInt();
        try {
            member.payDebt(amount);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(0);
        }
        displayMenu();
    }

    public static void displayInformation() {
        System.out.println(member.toString());
        displayMenu();
    }

}

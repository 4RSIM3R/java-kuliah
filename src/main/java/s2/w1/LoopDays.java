package s2.w1;

import java.util.HashMap;
import java.util.Scanner;

public class LoopDays {

    static HashMap<Integer, String> days = new HashMap<Integer, String>();

    public static void main(String[] args) {

        init();

        Scanner sc = new Scanner(System.in);

        System.out.print("Input The ID : ");
        String id = sc.next();

        String lastTwo = id.substring(id.length() - 2);
        int realValue = Integer.parseInt(lastTwo);
        int loopValue = realValue < 10 ? (realValue += 10) : realValue;

        for (int i = 1; i <= loopValue; i++) {
            if (i < 8) {
                System.out.println(days.get(i));
            } else {
                int parsedValue = i % 7;
                System.out.println(days.get(parsedValue));
            }
        }

    }

    public static void init() {
        days.put(1, "senin");
        days.put(2, "selasa");
        days.put(3, "rabu");
        days.put(4, "kamis");
        days.put(5, "jum'at");
        days.put(6, "sabtu");
        days.put(7, "minggu");
    }

}

package s2.w1;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class RoyalGardenProblems {

    static HashMap<Integer, String> flowers = new HashMap<Integer, String>();
    static HashMap<Integer, Integer> prices = new HashMap<Integer, Integer>();
    static Locale locale = new Locale("in", "ID");
    static NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public static void main(String[] args) {

        int[][] datas = new int[][]{
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        initFlowers(flowers);
        initPrices(prices);

        countStockByFlowerName(datas, flowers);
        countRoyalGarden1(datas);
        showAllData(datas);

    }

    public static void initFlowers(HashMap<Integer, String> flowers) {
        flowers.put(0, "Aglonema");
        flowers.put(1, "Keladi");
        flowers.put(2, "Alocasia");
        flowers.put(3, "Mawar");
    }

    public static void initPrices(HashMap<Integer, Integer> prices) {
        prices.put(0, 75000);
        prices.put(1, 50000);
        prices.put(2, 60000);
        prices.put(3, 10000);
    }

    public static void countStockByFlowerName(int[][] datas, HashMap<Integer, String> flowers) {

        System.out.println("== COUNT FLOWER BY NAME | ARRAY 1 && FUNCTION 2 ==");

        for (int i = 0; i < datas.length; i++) {
            int temp = 0;
            for (int j = 0; j < datas[i].length; j++) {
                temp += datas[j][i];
            }
            String name = flowers.get(i);
            System.out.printf("Stock of %s is %d \n", name, temp);
        }
    }

    public static void countRoyalGarden1(int[][] datas) {

        System.out.println("== ROYAL GARDEN 1 PROFIT | ARRAY 2 ==");

        int[] cloned =new int[datas[0].length];
        int totalPrice = 0;

        cloned[0] = datas[0][0] - 1;
        cloned[1] = datas[0][1] - 2;
        cloned[2] = datas[0][2];
        cloned[3] = datas[0][3] - 5;

        for (int i = 0; i < cloned.length; i++) {
            totalPrice += (cloned[i] * prices.get(i));
        }



        System.out.printf("Total profit of Royal Garden 1 : %s \n", numberFormat.format(totalPrice));

    }

    public static void showAllData(int[][] datas) {
        System.out.println("== SHOW ALL DATA | ARRAY 1 ==");
        Arrays.stream(datas).forEach((first) -> {
            Arrays.stream(first).forEach((second) -> {
                System.out.print(second + " ");
            });
            System.out.println("");
        });
    }

}

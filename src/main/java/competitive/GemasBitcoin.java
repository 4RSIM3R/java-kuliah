package competitive;

public class GemasBitcoin {

    public static void main(String[] args) {

        int[] datas = new int[]{10, 7, 15, 20, 12, 16, 14};
        int buy = 0;
        int sell = 1;
        int totalProfit = 0;

        for (int i = 0; i < datas.length; i++) {
            int tempProfit = 0;
            for (int j = 1; j < datas.length; j++) {
                sell = j;
                int profit = datas[sell] - datas[i];
                if (profit > tempProfit && j > i) {
                    System.out.printf("buy : %d - sell : %d - profit : %d \n", buy, j, profit);
                    tempProfit = profit;
                    sell++;
                }
            }

            if (tempProfit > totalProfit) {
                totalProfit += tempProfit;
            }

        }


    }

}

package s2.w5;

import java.util.ArrayList;
import java.util.Random;

public class SumArray {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            numbers.add(random.nextInt(10));
        }

        int bruteForce = sumBruteForce(numbers);
        int divideAnConquer = sumDivideAndConquer(numbers, 0, numbers.size() - 1);

        System.out.printf("%d %d", bruteForce, divideAnConquer);

    }

    public static int sumBruteForce(ArrayList<Integer> payload) {

        int total = 0;

        for (int i = 0; i < payload.size(); i++) {
            total += payload.get(i);
        }

        return total;

    }

    public static int sumDivideAndConquer(ArrayList<Integer> payload, int l, int r) {

        if (l == r) {
            return payload.get(l);
        } else if (l < r) {
            int middleIndex = (l+r) / 2;
            int leftSum = sumDivideAndConquer(payload, l, middleIndex - l);
            int rightSum = sumDivideAndConquer(payload, middleIndex + l, r);
            return leftSum + rightSum + payload.get(middleIndex);
        } else {
            return 0;
        }

    }

}

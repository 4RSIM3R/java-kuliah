package s2.w5;

public class RankNumber {

    public static void main(String[] args) {

        long startFirst = System.nanoTime();
        for (int i = 1; i <= 20; i++) {
            int bruteForce = rankBruteForce(2, 10);
        }
        long endFirst = System.nanoTime();

        long startSecond = System.nanoTime();
        for (int i = 1; i <= 20; i++) {
            int divideAndConquer = rankDivideAndConquer(2, 10);
        }
        long endSecond = System.nanoTime();

        System.out.printf("Brute Force : %f Second \n", ((endFirst - startFirst) / 1e9));
        System.out.printf("Divide Conquer : %f second \n", ((endSecond - startSecond) / 1e9));


    }

    public static int rankBruteForce(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    public static int rankDivideAndConquer(int a, int n) {

        if (n == 0) return 1;
        else {
            if (n % 2 == 1) return (rankDivideAndConquer(a, n / 2) * rankDivideAndConquer(a, n / 2) * a);
            else return (rankDivideAndConquer(a, n / 2) * rankDivideAndConquer(a, n / 2) );
        }

    }

}

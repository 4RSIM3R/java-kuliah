package s2.w5;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
* Unfortunately i can't run the factorialDivideAndConquer() in 20 times, or fewer than 20
* Because it will cause the most famous error : `StackOverFlow`, ~(^_^)~
* */
public class Factorial {

    public static void main(String[] args) throws Exception {

        Random random = new Random();

        /*
        * Here i add the `Benchmark` for observing the total execution time
        * */
        long startFirst = System.nanoTime();
        for (int i = 1; i <= 20; i++) {
            long bruteForce = factorialBruteForce(7);
        }
        long endFirst = System.nanoTime();

        long startSecond = System.nanoTime();
        for (int i = 1; i <= 20; i++) {
            long divideConquer = factorialDivideAndConquer(7);
        }
        long endSecond = System.nanoTime();

        long startThird = System.nanoTime();
        for (int i = 1; i <= 20; i++) {
            long another = anotherBruteForce(7);
        }
        long endThird = System.nanoTime();

        System.out.printf("Brute Force : %f Second \n", ((endFirst - startFirst) / 1e9));
        System.out.printf("Another Brute Force : %f Second \n", ((endThird - startThird) / 1e9));
        System.out.printf("Divide Conquer : %f second \n", ((endSecond - startSecond) / 1e9));

    }

    public static long factorialBruteForce(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    /*
    * This function is the answer of question number 3
    * */
    public static long anotherBruteForce(int n) {
        int i = 1;
        int factor = 1;
        while (i <= n) {
            factor *= i;
            i++;
        }
        return factor;
    }

    /*
    * I think this function is not represent Divide And Conquer Approach, Why ?
    * Because in this function, we use a `recursive` to generate an `n` number firstly, and then multiply it, ie :
    * we call `factorialDivideAndConquer(5)`, what happen in background is, first the function will check the base line `n == 1`
    * if pass, return 1, and then else it will call factorialDivideAndConquer() again, and again, until the args is `1` (divide)
    * and finally do the multiplication of returns (combine).
    *
    * illustration : factorialDivideAndConquer(5) -> factorialDivideAndConquer(4) -> factorialDivideAndConquer(3) ->
    * factorialDivideAndConquer(2) -> factorialDivideAndConquer(1),
    *
    * So, the notation of this process is O(N), because the total process to call is same as the how much the data or
    * argument that passed in this function is
    *
    * And, i think, the notation of Divide and Conquer approach is not O(N), because in Divide and Conquer, we divide a `process`
    * to a `sub-process` to reducing the total process that run in a function.
    *
    * But, the labeling of Divide and Conquer to this function, is not totally false, because, maybe, someone who create
    * this task, want to telling the student that this function not running in a `single` execution of process, but in several
    * process execution (divide). And also its true in this function we do a `combine` step as i mentioned before
    * */
    static public long factorialDivideAndConquer(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialDivideAndConquer(n - 1);
        }
    }

}

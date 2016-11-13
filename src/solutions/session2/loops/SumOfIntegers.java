package solutions.session2.loops;

/**
 * User: junaid
 * Date: 30/10/2016
 */
public class SumOfIntegers {
    /**
     * Write a loop function to sum from number 1 to 100 and print result.
     */
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}

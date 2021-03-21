package algorithm.implementation;

public class LeetCode29 {
    public int divide(int dividend, int divisor) {
        // FAIL : ah... 2147483648
        boolean sign = ((long) dividend * (long) divisor) > 0;
        int result = Math.abs(dividend) / Math.abs(divisor);
        return sign ? result : -result;
    }
}

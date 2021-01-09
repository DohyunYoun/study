package algorithm;

public class LeetCode1395 {
    public int numTeams(int[] rating) {
        final int LEN = rating.length;

        int result = 0;
        for (int i = 0; i < LEN; i++) {
            for (int j = i + 1; j < LEN; j++) {
                for (int k = j + 1; k < LEN; k++) {
                    if (isValid(rating[i], rating[j], rating[k])) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    boolean isValid(int i, int j, int k) {
        return (i < j && j < k) || (i > j && j > k);
    }
}

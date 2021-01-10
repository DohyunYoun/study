package algorithm;

import java.util.Arrays;

//TODO: TIME LIMIT EXCEEDED
public class LeetCode718 {
    static int LEN;
    public int findLength(int[] A, int[] B) {
        LEN = A.length;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    if (max == 0) {
                        max = checkRepeated(A, B, i, j, max);
                    } else {
                        if (Arrays.equals(
                                Arrays.copyOfRange(A, i, i + max ),
                                Arrays.copyOfRange(B, j, j + max ))) {
                            max = checkRepeated(A, B, i + max, j + max, max);
                        }
                    }
                }
            }
        }
        return max;
    }

    int checkRepeated(int[] A, int[] B, int i, int j, int max) {
        while (i < LEN && j < LEN) {
            if (A[i] == B[j]) {
                max++;
                i++;
                j++;
            } else
                break;
        }
        return max;
    }
}

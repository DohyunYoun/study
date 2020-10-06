package algorithm.array;

public class LeetCode832 {
    public int[][] flipAndInvertImage(int[][] A) {

        final int LEN1 = A.length;
        final int LEN2 = A[0].length;

        int[][] answer = new int[LEN1][LEN2];
        for (int i = 0; i < LEN1; i++) {
            int newJ = 0;
            for (int j = LEN2 - 1; j >= 0; j--) {
                answer[i][newJ++] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return answer;
    }
}

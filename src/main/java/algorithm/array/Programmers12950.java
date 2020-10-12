package algorithm.array;

public class Programmers12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        final int LEN0 = arr1.length;
        final int LEN1 = arr1[0].length;

        int[][] answer = new int[LEN0][LEN1];
        for(int i = 0; i < LEN0; i++){
            for(int j = 0; j < LEN1; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

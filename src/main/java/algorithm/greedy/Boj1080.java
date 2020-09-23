package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1080 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] column = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(column[j]) == 0 ? -1 : 1;
            }
        }
        for (int i = 0; i < N; i++) {
            String[] column = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(column[j]) == 0 ? -1 : 1;
            }
        }

        int count = 0;

        for (int i = 0; i <= N - 2 ; i++) {
            for (int j = 0; j <= M -2 ; j++) {
                if (A[i][j] != B[i][j]) {
                    A = reverse(A, i, j);
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepEquals(A, B) ? count : -1);
    }

    static int[][] reverse(int[][] A, int x, int y) {
        //N-2 번째까지 for문을 돌릴 경우, A의 크기가 1일때 A[3]은 존재하지 않음.
        //for문에서 예외처리가 아니라, reverse시 예외처리가 필요함.
        if (x + 2 >= A.length || y + 2 >= A[0].length) return A;

        A[x][y] *= -1;
        A[x][y + 1] *= -1;
        A[x][y + 2] *= -1;
        A[x + 1][y] *= -1;
        A[x + 1][y + 1] *= -1;
        A[x + 1][y + 2] *= -1;
        A[x + 2][y] *= -1;
        A[x + 2][y + 1] *= -1;
        A[x + 2][y + 2] *= -1;
        return A;
    }
}

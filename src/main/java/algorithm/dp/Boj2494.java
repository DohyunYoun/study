package algorithm.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2494 {
    // 실패실패
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String strScrew = br.readLine();
        String strGoal = br.readLine();
        int screw = 0;
        int goal = 0;


        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = Character.getNumericValue(strScrew.charAt(i));
            int b = Character.getNumericValue(strGoal.charAt(i));

            screw = Integer.parseInt(strScrew);
            int move = b - a;
            int aa = Math.abs(a - b);
            int bb = (10 - a) + b ;
            if (a < b) {
                if (aa < bb) {
                    //왼쪽
                    screw += moveLeft(N-i, aa);
                } else {
                    //오른쪽
                    screw += moveRight(N-i, aa);
                }
                move = aa;
            } else if (a > b) {
                if (aa < bb) {
                    //오른쪽
                    screw += moveRight(N-i, aa);
                } else {
                    //왼쪽
                    move = Math.abs(bb);
                    screw += moveLeft(N-i, Math.abs(bb));
                }
            }
            count += Math.abs(move);
            ans.append(i + 1 + " " + move + "\n");
            if (Math.log10(screw) + 1 > N) {
                String tmp = Integer.toString(screw);
                tmp = tmp.substring(((int) Math.log10(screw) + 1) - N);
                screw = Integer.parseInt(tmp);
            }
            strScrew = Integer.toString(screw);
        }
        System.out.println(count);
        System.out.println(ans.toString());
    }

    static int moveLeft(int n, int move) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(move);
        }
        return Integer.parseInt(sb.toString());
    }

    static int moveRight(int n, int move) {
        int a = (int) Math.pow(10, n);
        return move * a;
    }



        private static int[][] D;

        private static int[] from;
        private static int[] to;

        private static int[][] dir;
        private static int[][] cost;

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            from = new int[n];
            String current = br.readLine();
            for(int i=0; i<current.length(); i++) {
                from[i] = current.charAt(i) - '0';
            }

            to = new int[n];
            String want = br.readLine();
            for(int i=0; i<want.length(); i++) {
                to[i] = want.charAt(i) - '0';
            }

            D = new int[n][10];
            dir = new int[n][10];
            cost = new int[n][10];

            for (int i = 0; i < n; i++) {
                Arrays.fill(D[i], -1);
            }

            System.out.println(f(0, n, 0));
            print(0, n, 0);
        }

        private static int f(int index, int n, int turn) {
            if (index == n) return 0;
            if (D[index][turn] != -1) return D[index][turn];

            int current = (from[index] + turn) % 10;

            // left
            int leftTurn = (to[index] - current + 10) % 10;
            int leftCostSum = f(index + 1, n, (turn + leftTurn) % 10) + leftTurn;

            // right
            int rightTurn = (current - to[index] + 10) % 10;
            int rightCostSum = f(index + 1, n, turn) + rightTurn;

            if (rightCostSum > leftCostSum) {
                D[index][turn] = leftCostSum;
                dir[index][turn] = 1;
                cost[index][turn] = leftTurn;
            } else {
                D[index][turn] = rightCostSum;
                dir[index][turn] = -1;
                cost[index][turn] = rightTurn;
            }
            return D[index][turn];
        }

        private static void print(int index, int n, int turn) {
            if(n == index) return;

            int move = dir[index][turn] * cost[index][turn];
            if(move != 0) System.out.println((index + 1) + " " + move);

            if(dir[index][turn] > 0) print(index+1, n, (turn + move + 10) % 10);
            else print(index+1, n, turn);
        }


}

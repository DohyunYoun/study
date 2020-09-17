package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2494 {
    // 실패실패 
    public static void main(String[] args) throws IOException {
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
}

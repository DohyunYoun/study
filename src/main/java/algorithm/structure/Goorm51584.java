package algorithm.structure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 효율성 2개 통과못함
 */
public class Goorm51584 {
    private static int n;
    private static int m;
    private static int[][] lamp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        lamp = new int[n][m];
        for (int i = 0; i < n; i++) {
            //" "를 지우고 toCharArray로 ?
            lamp[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(Arrays.toString(lamp[i]));
        }
        int p = Integer.parseInt(br.readLine());
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            turnOnOff(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) - 1);
        }

//        Arrays.stream(lamp)
//                .map(String::valueOf)
//                .forEach(l->System.out.println(Arrays.stream(l)));

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(lamp[i][j]);
                sb.append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

    static void turnOnOff(int direction, int line) {
        boolean isHorizontal = direction == 0;
        if (isHorizontal) {
            for (int i = 0; i < m; i++) {
                lamp[line][i] = lamp[line][i] == 0 ? 1 : 0;
            }
        } else {
            for (int i = 0; i < n; i++) {
                lamp[i][line] = lamp[i][line] == 0 ? 1 : 0;
            }
        }
    }
}

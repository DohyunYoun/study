package algorithm.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj14501 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] scedules = new int[N][2];
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            scedules[i][0] = Integer.parseInt(st.nextToken());
            scedules[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scedules, ((o1, o2) -> Integer.compare(o2[1],o1[1])));

    }
//    static int maxValue(int[][] scedules){
//        int maxValue += maxValue;
//    }

}

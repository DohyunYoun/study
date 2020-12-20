package algorithm.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Goorm47878 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        long[] result = new long[tc];
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long season = Long.parseLong(st.nextToken());
            long normal = Long.parseLong(st.nextToken());

            long sMaximum = season / 5;
            long leftSeason = season % 5;

            result[i] = (sMaximum <= (leftSeason + normal) / 7) ? sMaximum : (season + normal) / 12;
        }
        Arrays.stream(result).forEach(x->System.out.println(x));
    }
}

package algorithm.binarySerach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE : https://www.acmicpc.net/problem/2869
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        System.out.println(new Boj2869().solve(a, b, v));

    }

    int solve(int A, int B, int V) {

        //SOLUTION 1
//        int a = V-B;
//        int b = A-B;
//        int result = a/b;
//        if(a%b!=0) result++;
//
//return result;

        //SOLUTION 2
//        int days = 1;
//        double div = (double) (V - A) / (A - B); //if V==A 분모가 아니라 분자가 0이어서 괜춘
//        days += (int) Math.ceil(div);
//        return days;


        //달팽이는 하루에 (A - B) 미터 씩 총 V미터를 올라가면 된다.
        //하지만 달팽이가 목표 지점에 도달한 날에는 미끄러지는 것을 감안하면 안되니
        // 총 (V - B)미터를 올라가게 되는 것과 같다.
        // 만약 (V - B)가 (A - B)로 딱 나눠 떨어지지 않으면 몫에 + 1 한 것이 정답이다 (하루 더 가니까).
        // 근데 int형 이라서 나눠 떨어지는지 구분하기 귀찮으니까 (V -B)에 1을 미리 빼놓고 몫에 무조건 1을 더하는 것으로 처리한다.
//        return (V-B-1) / (A-B) +1;


        //2분탐색
        int low = 1;
        int high = V;
        int mid; //날짜 수

        int gap = A - B;
        int curr;
        int days = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            curr = gap * (mid - 1) + A; //마지막날엔 A만큼 올라가니까 mid에선 -1 함

            if (curr >= V) {
                days = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return days;
    }
}

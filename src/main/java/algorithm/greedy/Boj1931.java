package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by DohyunYoun on 2020-06-15
 * SITE : https://www.acmicpc.net/problem/1931
 * <p>
 * Used Algorithm : Greedy Algorithm
 * Used Data Structure :
 * Time Complexity :
 * Point : 앞에서 부터 시작하며, 끝나자마자 시작할 수 있는 강의를 찾는다?
 * >> 일찍 끝나는 순으로 찾는다.
 */
public class Boj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] sessions = new int[N][2];
        for(int i = 0 ; i < N ; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sessions[i][0] = Integer.parseInt(st.nextToken());
            sessions[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(new Boj1931().assignRoom(sessions));
    }

    int assignRoom(int[][] sessions){
//        Arrays.sort(sessions, Comparator.comparingInt(n->n[1]));
        Arrays.sort(sessions, ((o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0],o2[0]);
            }else{
                return Integer.compare(o1[1],o2[1]);
            }
        }));

        int cnt = 1;
        int end = sessions[0][1];

        for( int i = 1, len = sessions.length ; i < len ; i++){
            int start = sessions[i][0];
            if(start >= end){
                cnt++;
                end = sessions[i][1];
            }
        }
        return  cnt;
    }
//    int assignRoom(int[][] sessions){
//        int cnt = 1;
//        boolean full = false;
//        int end = sessions[0][1];
//        if(sessions[0][0] == sessions[0][1] ){
//            full = true;
//        }
//        for(int i = 1, len = sessions.length ; i < len ; i ++){
//            int start = sessions[i][0];
//            if(start < end){
//                continue;
//            }
//            //start > end - can start
//            //can start
//            if(start == sessions[i][1]){
//                if(full){
//                    continue;
//                }else{
//                    full = true;
//                }
//            }
//            end = sessions[i][1];
//            cnt++;
//        }
//        return cnt;
//    }
}

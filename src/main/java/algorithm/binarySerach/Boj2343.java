package algorithm.binarySerach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by DohyunYoun on 2020-06-11
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj2343 {

    /**
     * 접근 방식 2
     * 값이 주어졌을때 해당 값으로 m개의 블루레이를 찍어낼 수 있는지 확인하는 check 함수를 작성한다.
     * mid < arr[i]인 경우 해당 값으로 블루레이를 다 담아내지 못하므로 무조건 false를 반환해준다.
     * 최소 크기를 구하는 것이므로 최대와 반대로 check가 true를 반환할때 r를 줄여주고 false를 반활할때 l를 줄여준다.
     */
    static int n,m = 0;
    static int[] lessones;

   static boolean check(int mid){
        int sum = 0 ;
        int cnt = 0 ;  // 블루레이 수

        for(int i = 0 ; i < n ; i++){
            //곡 하나가 최대 녹음시간보다 길 수 없다.
            if(lessones[i] > mid){
                return false;
            }
            sum+=lessones[i];
            if(sum > mid){
                sum = lessones[i];
                cnt++;
            }
        }

        return m>=cnt;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        lessones = new int[n];
        st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            lessones[i] = Integer.parseInt(st.nextToken());
             sum += lessones[i];
        }
        int low = 1 , high = sum;
        int result = 0 ;
        while(low<=high){
            //low와 high가 변하면 계속 mid를 변경시킴.
            int mid = (low+high)/2;
            if(check(mid)){
                result = mid;
                high = mid -1;
                continue;
            }
            low = mid +1;
        }
        System.out.println(result);

    }
    /**
     * 접근 방식 1
     * 1. 최소값은(left) 레슨의 수 중 가장 큰 값으로 한다.
     *  * 2. 임의로 정한 블루레이 크기((left + right)/2)에 레슨을 순차적으로 담는다.
     *  * 2-1. 레슨의 길이가 블루레이의 크기를 초과하게 된다면 블루레이 크기를 증가시킨다.
     *  * 3. 블루레이의 개수가 m 보다 작다면 최대값(right)를 줄인다.
     *  * 3.-1. 블루레이의 개수가 m 보다 같거나 크다면 최소값을 줄인다.
     */
    /*
    static int n, m = 0;
    static int[] lessones;
    static int left, right = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        lessones = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lessones[i] = Integer.parseInt(st.nextToken());
            left = left > lessones[i] ? left : lessones[i];
            right += lessones[i];
        }
        new Boj2343().solve();
    }

    void solve() {
        while (left <= right) {
            //임의로 정한 블루레이 크기
            int mid = (left + right) / 2;
            //계산중인 크기
            int sum = 0;
            //블루레이 장수(max: m)
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (sum + lessones[i] > mid) {
                    //새롭게 블루레이의 크기를 측정해 본다.
                    sum = 0;
                    cnt++;
                }
                sum += lessones[i];
            }
            //아직 남은 레슨이 있음
            if (sum != 0) {
                cnt++;
            }
            if (cnt <= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
*/
}

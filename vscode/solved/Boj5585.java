
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Boj5585 {
    /**
     * 그리디 알고리즘
     * https://www.acmicpc.net/problem/5585
     */
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");

        new Boj5585().solve();
    }

    int change = 0;
    int[] changes = new int[]{500,100,50,10,5,1};
    int i = 0 ;

    void solve(){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            //br.readLine();
            int money = 1000 - Integer.parseInt(br.readLine());
            while(money !=0){
                //잔돈 개수
                change += money / changes[i];
                //빼고남은 잔돈
                money =  money % changes[i];
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(change);
    }



}

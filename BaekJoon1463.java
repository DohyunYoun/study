import java.util.Scanner;

public class BaekJoon1463 {
    /**
    * 1로 만들기
    * 
    * 셋 중에 하나를 실행한다.
    * 1. N%3 == 0
    * 2. n%2 == 0
    * 3. n-1
    */
    
    
    static  int[] d;
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1];
        System.out.println(new BaekJoon1463().go(n));

        
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //   int  n = Integer.parseInt(br.readLine());
        //     memo = new int[n+1];
            
        //     new BaekJoon1463().solve(n);
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        
    }
    
    
     int go(int n) {
        if (n == 1) {
            return 0;
        }
        if (d[n] > 0) {
            return d[n];
        }
        d[n] = go(n-1) + 1;
        if (n%2 == 0) {
            int temp = go(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n%3 == 0) {
            int temp = go(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
}

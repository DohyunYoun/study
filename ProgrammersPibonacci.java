
public class ProgrammersPibonacci {

    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        
    }

    /*
    * Problem
    * 그냥 계산할 경우 int/long 둘다 최대값 초과로 에러(testCase : 9927)
    * 나머지를 저장 하며, 마지막에 혹시 또 나눠지는 경우를 대비해서 n번째의 나머지를 출력
    */
    static int mod = 1234567;
    public int solution(int n) {
        int[] fib  = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i <= n ; i++){
            //fib[i] = (fib[i-1]+fib[i-2])%mod;
            fib[i] = fib[i-1]%mod+fib[i-2]%mod;
        }
        //return fib[n]
        return fib[n]%mod;


        //청님ver
        // int answer = 0, sum1=1, sum2=1, bukit=0;
        
        // if( n == 0 ) answer = 0;
        // else if (n == 1) answer = 1;
        
        // for(int i=3; i<=n; i++){
        //     answer = (sum1 + sum2)%1234567;  
        //     sum1 = sum2%1234567; 
        //     sum2 = answer%1234567;
        // }
        
        
        // return answer;
    }
}
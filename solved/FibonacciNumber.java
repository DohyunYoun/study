//509
public class FibonacciNumber{
    public static void main(String[] args) {
        int result = fib(0);
        System.out.println("result is "+result);
        
    }
    
    public static int fib(int N) {
        //arr[n-1] + arr[n-2]
        if(N<1){
            return 0;
        }
        int[] arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 1;
        if(N<2){
            return arr[N];
        }
        for(int i = 2 ; i < N ; i ++){
            arr[i] = arr[i-1]+ arr[i-2];
        }
        return arr[N-1] + arr[N-2];

        //SOLUTION : Recursive
        // if (N <= 1) {
        //     return N;
        // }
        // return fib(N-1) + fib(N-2);
    }
}

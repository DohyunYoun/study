//62
public class UniquePaths{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    public int uniquePaths(int m, int n) {
        //SOLUTION
        //7*3, 3*7

        //x : 8
        int x = m + n - 2;
        //y : 2
        int y = Math.min(m, n) - 1;
        long res = 1;
        
        for (int i = 1; i <= y; i++) {
            //x = 8, i = 1
            res *= (x-i+1);
            res /= i;
        }
        
        return (int)res;

        //JAVA SOLUTION??
        // long value = 1;
        // for (int i = 1; i <= n - 1; i++) {
        //     value *= ((double) (m + i - 1) / (double) i);
        // }
        // return (int) Math.round(value);
    }
}

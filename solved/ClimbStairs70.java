public class ClimbStairs70{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    /*
    #	Solutions	Runtime	Space	Preference
    1	Dynamic Programming: Recursive	O(n)	O(n)	-
    2	Dynamic Programming: Iterative	O(n)	O(n)	-
    3	Iterative, no array	O(n)	O(1)	Favorite
    */
    static int climbStairs(int n){
        int a = 1, b = 1;
        while (n-- > 0)
             a = (b += a) - a;
        return a;
        
        
        
        /*
        //fibonacci
        if (n <= 2) return n;    
        
        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;
        
        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
        
        //Recursive
        if (n <= 2) return n;    
        return climbStairs(n - 1) + climbStairs(n - 2);
        
        // dynamic
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
        */
    }
}

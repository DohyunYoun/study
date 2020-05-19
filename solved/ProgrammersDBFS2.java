import java.util.ArrayList;

public class ProgrammersDBFS2 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        
        int[][] c = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println("result is"+ solution(3,c));
        
    }
    
    static void dfs(ArrayList<Integer>[] a, boolean[] c, int x) {
        if (c[x]) {
            return;
        }
        c[x] = true;
        for (int y : a[x]) {
            if (c[y] == false) {
                dfs(a, c, y);
            }
        }
    }
    
    static int solution(int n, int[][] computers) {
        ArrayList<Integer>[] a =  (ArrayList<Integer>[]) new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        
        for (int i=0; i<computers.length; i++) {
            for(int j = 0 ; j < computers[i].length;j++){
                if(computers[i][j] == 1){
                    a[i+1].add(j+1);
                    a[j+1].add(i+1);
                }
            }
        }
        boolean[] check = new boolean[n+1];
        int ans = 0;
        for (int i=1; i<=n; i++) {
            if (check[i] == false) {
                dfs(a, check, i);
                ans += 1;
            }
        }
        return ans;
    }
    
}

import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int max = 0;

        int[] cloth = new int[n+1];
        Arrays.fill(cloth, 1);
        cloth[0] = 0;

        for(int i : lost){
            cloth[i]--;
        }
        for(int i : reserve){
            cloth[i]++;
        }

        for(int i = 1; i < n; i++){
            if(cloth[i] == 0 && cloth[i-1] != 2 && cloth[i+1]!=2){
                continue;
            }
                if(cloth[i-1]>1) cloth[i-1]--;
                else if(cloth[i+1]>1) cloth[i+1]--;
                max++;
       }
       
       if(cloth[n] > 0 || (cloth[n] == 0 && cloth[n-1]>1)) max++;

       return max;
    }
}

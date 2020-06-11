import java.util.Stack;

//122
public class BestTimeToBuy2{
    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input)+"");
    }
    
    static int maxProfit(int[] prices) {

        int profit = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i =0; i < prices.length; i++){
            if(min < prices[i]){
                profit =prices[i]-min;
                if(max < profit){
                    max = profit;
                }else{

                }
                min = Integer.MAX_VALUE;
            }else{
                min = prices[i];
            }
        }

        return profit;

    }
    
    
    
}

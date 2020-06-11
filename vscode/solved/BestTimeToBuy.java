//121
public class BestTimeToBuy{
    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input)+"");
    }
    
    static int maxProfit(int[] prices) {
        //MY SOLUTION
        if(prices.length < 2){
            return 0;
        }
        
        int min = prices[0];
        int result = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                if((prices[i]-min)>result){
                    result = prices[i]-min;
                }
            }
        }
        return result;
/* 
        //SOLUTION
        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }else if((prices[i]-min)>result){
                result = prices[i]-min;
            }
        }
        return result;
         */
    }
    
    
    
}

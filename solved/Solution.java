public class Solution {
    
    public static void main(String[] args) {
        int value = 121;
        
        System.out.println(func(value)+"");
        
    }
    
    public static Boolean func(int x) {
        
        if(x<0){
            return false;
        }
        int value = x;
        int rev = 0;
        while(value!=0){
            rev = rev*10 + value%10;
            value = value/10;
        }
        System.out.println("Rev is "+rev);
        System.out.println("x is "+x);
        if(x==rev){
            return true;
        }else{
            return false;
        }
        
        
    }
}
public class SumOfTwoIntegers371{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        getSum(1,2);
    }
    
    static int getSum(int a, int b) {
        //time error
        int result=0;
        while(a!=0 || b!=0){
            if(a!=0){
                if(a<0){
                    result--;
                    a++;
                }else{
                    result++;
                    a--;
                } 
            }
            if(b!=0){
                if(b<0){
                    result--;
                    b++;
                }else{
                    result++;
                    b--;
                }
            }
        }
        return result;

        // while (b != 0) {
        //     //filter out identical component
        //     int carry = a & b;
        //     //filter out complementary component
        //     a = a ^ b;
            
        //     //shift b to the left the common components. and assign it to b
        //     //on the next iteration there will be fewer and fewer common components
        //     //and gradually b will converge to 0 conce we have shifted the integer left 
        //     //the appropriate amount of times. 
        //     b = carry << 1;
        //     }
        //     return a;
    }
}

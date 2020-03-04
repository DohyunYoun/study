import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//412
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz2(5).toString());
    }
    
    static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for(int i = 1 ; i <n+1 ; i++){
            if(i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(Integer.toString(i));
                // result.add(i+"");
            }
        }
        return result;
    }
    
    
    static List<String> fizzBuzz2(int n) {
        String[] arr = new String[n];
        for(int i = 1 ; i <=n; i++){
            arr[i-1]= Integer.toString(i);
        }
        for(int i = 2 ; i <n; i+=3){
            arr[i]= "Fizz";
        }
        for(int i = 4 ; i <n; i+=5){
            arr[i]= "Buzz";
        }
        for(int i = 14 ; i < n; i+=15){
            arr[i]= "FizzBuzz";
        }
        return new ArrayList<String>(Arrays.asList(arr));
    }
}

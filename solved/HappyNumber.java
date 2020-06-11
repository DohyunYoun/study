package solved;
import java.util.HashSet;

// 202
public class HappyNumber{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    //1. 양수로 시작
    //2. 각 수의 제곱의 합을 반복했을때 1이 나오거나 무한반복됨
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            int tmp = n;
            int sum = 0;
            
            while (tmp > 0) {
                int digit = tmp % 10;
                sum += digit * digit;
                tmp /= 10;
            }
            
            n = sum;
            
            if (set.contains(n))
                return false;
            else
                set.add(n);
        }
        
        return true;


        // HashSet<Integer> inLoop = new HashSet<Integer>();
        // int squareSum,remain;
        // while (inLoop.add(n)) {
        //     squareSum = 0;
        //     while (n > 0) {
        //         remain = n%10;
        //         squareSum += remain*remain;
        //         n /= 10;
        //     }
        //     if (squareSum == 1)
        //         return true;
        //     else
        //         n = squareSum;
            
        // }
        // return false;
    }
}

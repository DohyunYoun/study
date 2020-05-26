import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NaverCodingtest {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        // Test("baaabbaabbba");
        // getShiftCountToHighestNum(9736);
        Time(2,3,2,3);

    }

    static int Test(String s){
        int moves = 0;
        for (int i = 0 ; i < s.length(); i++) {
            int runLength = 1;
            for (; i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1); i++) {
                runLength++;
            }
            moves += runLength / 3;
        }
        return moves;
    }


    static int Time(int A, int B, int C, int D) {
        // 첫번째 자리 : 0~2
        // 두번째 자리 : 0~9 // 첫번째자리가 2일때는 0~4
        // 세번째 자리 : 0~6
        // 네번째 자리 : 0~9
        
        int[] arr = {A,B,C,D};
        Arrays.sort(arr);
        
        HashSet<Integer> cnt = new HashSet<>();

        for(int i = 0 ; i < 4 ; i ++){
            for(int j = 0 ; j < 4 ; j ++){
                if(i==j){
                    continue;
                }
                for(int k = 0 ; k < 4 ; k ++){
                    if(i==k || j==k){
                        continue;
                    }
                    
                    int first = arr[i];
                    int second = arr[j];
                    int third = arr[k];
                    
                    if(first<3){
                        if(first == 2){
                            if(second < 5){
                                if(third < 6){
                                    int time = first*100 + second*10 + third;
                                    cnt.add(time);
                                }
                            }else{
                                continue;
                            }
                        }else{
                            if(third<6){
                                int time = first*100 + second*10 + third;
                                cnt.add(time);
                            }else{
                                continue;
                            }
                        }
                    }else{
                        continue;
                    }
                }
            }
        }
        
        return cnt.size();
        
    } 
    

    static int bit(int N){
        int largest = N;
        int shift = 0;
        int temp = N;
        for (int i = 1; i < 30; i++) {
            int index = (temp & 1);
            //N의 값은 양수이기 때문에 >>>를 쓰지 않아도 됨.
            temp = ((temp >> 1) | (index << 29));
            if (temp > largest) {
                largest = temp;
                shift = i;
            }
        }
        return shift;


    // private static final int MAX_N = 0x3fffffff;
    // private static final int MAX_SHIFT = Integer.toBinaryString(MAX_N).length();
    
    // static int getShiftCountToHighestNum(int N) {
    //     long largest = N;
    //     int shift = 0;
    //     for (int i = 1; i < MAX_SHIFT; i++) {
    //         long temp = (N >>> i)  | (N << (MAX_SHIFT - i) );
    //         if (temp > largest) {
    //             largest = temp;
    //             shift = i;
    //         }
    //     }
    //     return shift;
    // }
    }

}
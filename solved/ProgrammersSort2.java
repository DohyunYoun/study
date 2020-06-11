package solved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProgrammersSort2 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        int[] num = new int[]{3, 21, 981, 811, 80, 800};
        solution(num);
    }
    //앞에서부터 비교
    // 첫자리 정렬
    // 둘째자리 확인 // 둘째짜리가 없을경우 그녀석이 가장큼.
    static String solution(int[] numbers) {
        String answer = "";
        // int tmp[][] = new int[numbers.length][];
        //자릿수로 정렬됨
        // Arrays.sort(numbers);
        // for(int i = 0 ; i < numbers.length ; i ++){
        //     int value = numbers[i];
        //     tmp[i] = new int[Integer.toString(value).split("").length];
        //     tmp[i] = Arrays.stream(Integer.toString(value).split("")).mapToInt(Integer::parseInt).toArray();
        // }
        //tmp[0][0] - tmp[1][0] - tmp[2][0]



        //%10 으로 자리수 줄여나가기.
        //가장큰수부터 answer 문자열에 붙이기
        //전체 자리수 구하기 (int)(Math.log10(num)+1)
        
        Arrays.sort(numbers);
        int big = Integer.parseInt(Integer.toString(numbers[0]).split("")[0]);
        int pos = 0;
            for(int i = 1 ; i<numbers.length ; i++){
                int first = Integer.parseInt(Integer.toString(numbers[i]).split("")[0]);
                if(big > first){
                    //그대로둠 && 둘째자리 비교해야함??
                }

                if(big == first){
                    //둘째자리 비교..........
                    int j = 1 ;
                    if(Integer.parseInt(Integer.toString(numbers[pos]).split("")[j])
                     > Integer.parseInt(Integer.toString(numbers[i]).split("")[j])){
                        //아무것도 안함.
                    }

                    if(Integer.parseInt(Integer.toString(numbers[pos]).split("")[j])
                     == Integer.parseInt(Integer.toString(numbers[i]).split("")[j])){
                       //3번째 자릿수 비교
                    }
                    if(Integer.parseInt(Integer.toString(numbers[pos]).split("")[j])
                     < Integer.parseInt(Integer.toString(numbers[i]).split("")[j])){
                        
                        pos = i;
                    }
                }

                if(big < first){
                    big = first;
                    pos = i;
                }
            }
            answer += Integer.toString(big);

        return answer;
    }
}

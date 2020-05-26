import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProgrammersSort3 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        //1,7,0,1,6,4 - 3
        // int[] num = new int[]{1,1,3,5,6};
        int[] num = new int[]{1,7,0,1,6,4};
        
        solution(num);
    }
    //발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 
    //나머지 논문이 h번 이하 인용되었다면 
    //h의 최댓값이 이 과학자의 H-Index입니다.
    static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int size = citations.length;
        for(int i = 0 ; i <citations.length ; i++){
            if(citations[i] >= size){
                return size;
            }else{
                size --;
            }
        }
        
        //1,1,3,5,6 - 3
        //SOLUTION
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        
        
        
        return answer;
        
        
        
        
    }
}

package solved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProgrammersSearch1 {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        //1,7,0,1,6,4 - 3
        // int[] num = new int[]{1,1,3,5,6};
        int[] num = new int[]{3,3,1,1,2,2,4,4,5,5,1,2,3,4,5,1,2,3,4,5};
        
        solution(num);
    }
    static int[] solution(int[] answers) {
        
        int[] count1 = {1,2,3,4,5};
        int[] count2 = {2,1,2,3,2,4,2,5};
        int[] count3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1=0;
        int score2=0;
        int score3=0;
        
        for(int i = 0 ; i < answers.length ; i++){
            //1번 : 12345~
            
            //2번 : 2123242521 : 1>1, 3>3, 5>4, 7>5, 9>1 , 11>3, 13>4, 15>5, 17>1
            //      0123456789
            //3번 : 3311224455 : 
            
            if(count1[i%5] == answers[i]){
                score1++;
            }
            if(count2[i%8] == answers[i]){
                score2++;
            }
            if(count3[i%10] == answers[i]){
                score3++;
            }
        }
        
        
        if(score1 > score2){
            if(score1>score3){
                return new int[]{1};
            }else if(score1 == score3){
                return new int[]{1,3};
            }else{
                return new int[]{3};
            }
        }else if(score1 == score2){
            if(score1>score3){
                return new int[]{1,2};
            }else if( score1 == score3){
                return new int[]{1,2,3};
            }else{
                return new int[]{3};
            }
        }else{
            if(score2 > score3){
                return new int[]{2};
            }else if (score2 == score3){
                return new int[]{2,3};
            }else{
                return new int[]{3};
            }
        }
        
        
        // int max = Math.max(Math.max(score1,score2), score3);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class ProgrammersMakeBigNumber {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        new ProgrammersMakeBigNumber().solve("1231234", 3);
    }
    
    
    int max(int a, int b){
        return a > b ? a : b;
    }

    String solve(String number, int k){
/**
 * 뒤에 남아있어야 할 자리수를 남겨놓고 앞에서 제일 큰값을 찾음.
 * 하나 찾은다음에 그 이후부터 뒤에 남아있어야 할 만큼 남겨놓고 앞에 범위를 지정한 곳에서 찾음.
 * 앞에 범위를 잡아놔야함.
 */
        //총 출력될 자리수
        int len = number.length() - k ;
        String[] numbers = number.split("");

        Stack<Integer> result = new Stack<>();
        result.push(Integer.parseInt(numbers[0]));

        while(k!=0){
            for(int i = 1 ; i < numbers.length; i++){
                int value = Integer.parseInt(numbers[i]);
                //큰 수가 들어오면 이전 숫자를 없애고 k값을 감소시킨다.
                    if(value > result.peek()){
                        result.pop();
                        k--;
                        break;
                    }else{
        
                    }
                
            }
        }
       


        
        //2차시도 : 이건 그리디가 아니었어 ...............
        //1231234
        //delete 1 > 231234
        //delete 1 > 23234
        //delete 2 > 3234
        // String[] numbers = number.split("");

        // ArrayList<Integer> index = new ArrayList<>();
        // for(int i = 0 ; i < numbers.length; i++){
        //     index.add(i);
        // }
        
        // //최소값을 찾아서 지우면 됨? 맨앞에서부터 돌면서
        // int deleteCount = 0;
        // int deleted = Integer.parseInt(numbers[deleteCount]);
        // int cnt = 0;

        // while(k!=0){
        //     for(int i = 0, len = numbers.length; i < len ; i++){
        //         if(index.get(deleteCount) == i){
        //             continue;
        //         }
        //         int value = Integer.parseInt(numbers[i]);
        //         if(deleted <= value){
        //             cnt++;
        //             if(cnt == len-1){
        //                 numbers[index.get(deleteCount)]= "99";
        //                 index.remove(deleteCount);
        //                 k--;
        //                 cnt = 0;
        //                 deleteCount=0;
        //             }
        //         }else{
        //             deleteCount++;
        //             cnt = 0;
        //             break;
        //         }
        //     }
        //     deleted = Integer.parseInt(numbers[index.get(deleteCount)]);
        // }
        
        
        // StringBuilder sb = new StringBuilder();
        // for(String s : numbers){
        //     if(!s.equals("99")){
        //         sb.append(s);
        //     }
        // }
        
        // return sb.toString();
                            //1차 시도
                            //그리디로 풀어야함. 정렬하면안됨
                            // String[] numbers = number.split("");
                            // Arrays.sort(numbers, Collections.reverseOrder());
                            
                            // StringBuilder b = new StringBuilder();
                            // for (String n : Arrays.copyOfRange(numbers, 0, numbers.length-k)) {
                                //     b.append(n);
                                // }
                                // return b.toString();
                            }
                        }
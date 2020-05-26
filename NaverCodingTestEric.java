import java.util.Arrays;

public class NaverCodingTestEric {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        // System.out.println(test("BAABAB"));
        // test2(154784565);
        System.out.println(test3("apple","rear"));
        // System.out.println(test3("rather","harder"));
        //apple pear
        //melon lemon
    }
    
   

    public static int test3 (String A, String B) {
        StringBuilder totalWordBuilder = new StringBuilder(A).append(B);
        String totalWord = totalWordBuilder.toString();
        int count = 0;
        String[] totalWordArray = totalWord.split("");
        Arrays.sort(totalWordArray);

        for (int i = 0; i < totalWordArray.length +1 ; i++) {                        
            if(i == totalWordArray.length - 1  ) {
                count++;
                break;
            }
                if(totalWordArray[i].equals(totalWordArray[i+1])){
                    i++;
                } else {
                    count++;    
                } 
                     
        }
        // if(totalWordArray.length % 2 == 1) {
        //     count++;
        // }
        return count;
    }

    public static int test (String S) {
        int deleteCount = 0;
        boolean first = true;
        for (int i = 0; i < S.length(); i++) {
            // //첫번째 A면 삭제안하고 아니면 삭제카운트 셈
            // if(first) {
            //     if(S.charAt(i)=='A'){
            //         continue;
            //     }                
            //     else {
            //         deleteCount++;                
            //     }
            //     first = false;
            // } else {                
            //     if(S.charAt(i)=='A') { //에이일 경우 앞에거랑 다르면 삭제 아니면 진행
            //         if(S.charAt(i) == S.charAt(i-1)) {
            //             continue;                    
            //         } else {
            //             deleteCount++;
            //         }
            //     } else if(S.charAt(i)=='B'){ //비일경우 앞에거랑 다르면 계속 아니면 삭제
            //         if(S.charAt(i) == S.charAt(i-1)) {
            //             continue;                    
            //         } else {
            //             deleteCount++;
            //         }
            //     }            
            // }
        }
        return deleteCount;        
    }

    // public static void test2 (int N) {
    //     int enable_print = N % 10;
    //     while (N > 0) {
    //         if (enable_print == 0 && N % 10 != 0) {
    //             enable_print = 1;
    //         }
    //         if (enable_print == 1) {
    //             System.out.print(N % 10);
    //         }
    //         N = N / 10;
    //     }
    // }
}

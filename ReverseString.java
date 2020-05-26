//344
public class ReverseString{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }

    /*
    Input: ["h","e","l","l","o","c"]
    Output: ["c","o","l","l","e","h"]
    //0->5
    //1->4
    //2->3
    //3->2
    //4->1
    //5->0
    */
    static void reverseString(char[] s) {

        //1. for문절 안에서 s.length를 호출할 경우 반복 호출되기때문에, 밖에서 호출해주는 것이 더 좋다.
        //2. 배열 안의 인덱스 계산이 복잡하면 더 시간이 오래걸린다?
        //      s[len-i-1]이 미리 len-1을 right에 선언해놓은 s[right-i]보다 runtime이 오래걸린다.


        //MY SOLUTION
        // 1ms / 47.8mb
        // int len = s.length;
        // for(int i = 0 ; i < len/2 ; i++){
        //     char tmp = s[i];
        //     s[i] = s[len-i-1];
        //     s[len-i-1] = tmp;
        // }

        //1ms / 45.8mb
        // int left = 0 , right = s.length -1;
        // for(int i = 0 ; i<s.length/2 ; i++){
        //            char tmp = s[left];
        //         s[left++] = s[right];
        //         s[right--] = tmp;
        // }

        //0ms / 46.4mb
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }

        //0ms / 46.8mb
        int right = s.length - 1;
        int size = s.length / 2;
        for(int i = 0 ; i<size ; i++){
            char tmp = s[i];
            s[i] = s[right-i];
            s[right-i] = tmp;
        }
    }
}

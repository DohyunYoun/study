public class Numberof1Bits191{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        hammingWeight(11);
    }
    
    static int hammingWeight(int n) {
        
        
        //O(n) 비트연산자로 마스킹하여 카운트
        /* 
        int count = 0;
        for(int i=0; i<32; i++){
            count += n & 1; //마지막 bit가 1이면 count함 (AND로 확인)
            //자바에서 >>를 쓰게 되면 음수의 경우 왼쪽의 비트가 1로 채워지기 때문에 >>>를 써서 0으로 채워지도록 한다.
            n >>>= 1; //마지막 bit를 삭제함
        }
        return count;
         */
        //Brian Kernighan’s Algorithm
        //어떤 수에서 1을 빼면 내림 수 아래의 모든 비트가 뒤집힘
        //제일 오른쪽에 1이 사라지고, 이걸 반복하면 어느순간 0이됨.
        /* 
        int count = 0;
        
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
        */
        
        
        //timeout
        int result = 0;
        while(n>0){
            if(n%2 == 1){
                result++;
            }
            n = (int)n/2;
        }
        return result;
    }
}

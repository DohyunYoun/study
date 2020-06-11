import java.util.Stack;

public class ProgrammersDoubleDelete {
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        
    } 
    
    public int solution(String s)
    {
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        // String result =doubleDelete(s);
        // if(result.equals("error")){
        //     return 0;
        // }else{
        //     return 1;
        // }

      return  doubleDelete2(s);
    }
    

    //효율성을 통과하지 못함.
    String doubleDelete(String s){
        if(s.equals("error")||s.equals("")){
            return s;
        }
        
        for(int i = 1, len = s.length(); i<len ; i++){
            if( s.charAt(i-1) ==  s.charAt(i)){
                StringBuilder sb = new StringBuilder(s);
                //뒤에서 부터 지워야됨.
                //앞에서 부터 지우면 이미 앞에 하나 지워졌기때문에, index가 변동됨
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                return doubleDelete(sb.toString());
            }
        }
        return "error";
    }
    
    //1. Stack을 이용?
    int doubleDelete2(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1, len = s.length(); i<len ; i++){
            Character c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

}
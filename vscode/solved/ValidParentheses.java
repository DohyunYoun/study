import java.util.Stack;
//20
public class ValidParentheses{
    public static void main(String[] args) {
        System.out.println("valid? : "+ isValid("(()("));
    }
    
    public static boolean isValid(String s) {
        //(()
        if(s.length()%2 ==1){
            return false;
        }
        //Solution 1 : Runtime 6ms / Memory 38.2mb
        // Stack<String> stack = new Stack<String>();
        // String[] arr = s.split("");
        
        
        // for (int i=0; i<arr.length;i++){
        //     if(arr[i].equals("(")){
        //         stack.push(")");
        //     }else if(arr[i].equals("{")){
        //         stack.push("}");
        //     }else if(arr[i].equals("[")){
        //         stack.push("]");
        //     }else if(stack.isEmpty()||!arr[i].equals(stack.pop())){
        //         return false;
        //     }
        // }
        // return stack.isEmpty();

        //Solution 2 : Runtime 0ms / Memory 37.3mb
        char[] stack = new char[s.length()];
		int head = 0;
		for(char c : s.toCharArray()) {
			switch(c) {
				case '{':
				case '[':
				case '(':
					stack[head++] = c;
					break;
				case '}':
					if(head == 0 || stack[--head] != '{') return false;
					break;
				case ')':
					if(head == 0 || stack[--head] != '(') return false;
					break;
				case ']':
					if(head == 0 || stack[--head] != '[') return false;
					break;
			}
		}
        return head == 0;
        
        //Solution 3 : Runtime 1ms / Memory 37.5mb
        // char[] chars = s.toCharArray();
        // Map<Character,Character> pairs = new HashMap<Character,Character>();
        // pairs.put('(', ')');
        // pairs.put('{', '}');
        // pairs.put('[', ']');
        
        // Stack<Character> stack = new Stack<Character>();
        // for (char c:chars) {
        //     if (pairs.containsKey(c)) {
        //         stack.push(pairs.get(c));
        //     } else {
        //         if (stack.isEmpty() || c != stack.pop()) return false;
        //     }
        // }
        // return stack.isEmpty();
    }
    
}

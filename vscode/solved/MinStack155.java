package solved;
import java.util.ArrayList;
import java.util.Stack;

public class MinStack155{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        MinStack155 a = new MinStack155();
        a.push(-2);
        a.push(0);
        a.push(-3);
        int b = a.getMin();
        a.pop();
        
    }
    //USING ArrayList
    // ArrayList<Integer> stack;
    // public MinStack155() {
    //     stack = new ArrayList<>();
    // }
    
    // public void push(int x) {
    //     stack.add(x);
    // }
    
    // public void pop() {
    //     stack.remove(stack.size()-1);
    // }
    
    // public int top() {
    //     return stack.get(stack.size()-1);
        
    // }
    
    // public int getMin() {
    //     int min = Integer.MAX_VALUE;
    //     for(int i = 0 ; i < stack.size(); i ++){
    //         if(stack.get(i)< min){
    //             min = stack.get(i);
    //         }
    //     }
    //     return min;
    // }
    
    //Using LinkedList
    class Node {
        int val;
        int min;
        Node next;
        Node(int x, int min) {
            val = x; 
            this.min = min;
        }
        
        // private Node(int val, int min, Node next) {
            //     this.val = val;
            //     this.min = min;
            //     this.next = next;
            // }
        }
        Node stack = null;
        
        public void push(int x) {
            //앞에 push
            if(stack == null){
                stack =   new Node(x, x);
            }else{
                Node a = new Node(x, Math.min(x, stack.min));
                a.next = stack;
                stack = a;
            }
            
        }
        
        public void pop() {
            stack = stack.next;
        }
        
        public int top() {
            return stack.val;
        }
        
        public int getMin() {
            return stack.min;
        }
    }
    
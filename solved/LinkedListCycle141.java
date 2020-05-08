import java.util.HashMap;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class LinkedListCycle141{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    public boolean hasCycle(ListNode head, int pos) {
        
        //12 ms	43.7 MB
        //Time complexity : O(n) / Space complexity : O(n)
        HashSet<ListNode> set = new HashSet<>();
        while(head != null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
                head = head.next;
            }
        }
        
        return false;
        
        
        //SOLUTION : Two Pointers
        //1 ms	41.8 MB
        //Time complexity : O(n) / Space complexity : O(1)
        //runner가 head.next일 경우 .next.next
        /* 
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null && runner.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
 */
    }
}

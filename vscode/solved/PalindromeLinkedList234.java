package solved;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PalindromeLinkedList234{
    public static void main(String[] args) {
        
        ListNode tmp = new ListNode(0);
        ListNode tmp2 = new ListNode(0);
        tmp.next = tmp2;
        // System.out.println("Default Main Fuction Sample    "+isPalindrome(tmp));
    }
 /*    
    static boolean isPalindrome(ListNode head) {
        ListNode origin = head;
        
        ListNode reverse = null;
        //reverse
        while(origin!=null){
            ListNode curr = origin.next;
            origin.next = reverse;
            reverse = origin;
            origin  = curr;
        }
        
        while(head != null || reverse != null){
            //check odd
            if(head!=null&&reverse ==null){
                return false;
            }
            if(head==null&&reverse!=null){
                return false;
            }

            if(head.val != reverse.val){
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        
        return true;
        

        if (head == null) return true;

        ListNode prev = null;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode prev2 = slow.next;
            slow.next = prev;
            prev = slow;
            slow = prev2;
        }
        //slow에 뒤 반쪽짜리 리스트 넣음.
        if (fast != null) { // if it is odd, 
            slow = slow.next;
        }

        while (slow != null && prev != null) {
            if (prev.val != slow.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        if (slow != null || prev != null) {
            return false;
        }

        return true;
        //linked list를 for문돌려서 list에 넣고 list에서 인덱스로 첫값과 끝값 비교.
    }
 */


    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        ref = head;        
        return check(head);
    }
    
    public boolean check(ListNode node){
        if(node == null) return true;
        boolean ans = check(node.next);
        boolean isEqual = (ref.val == node.val)? true : false; 
        ref = ref.next;
        return ans && isEqual;
    }
}

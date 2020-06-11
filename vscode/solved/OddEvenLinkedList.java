//328
package solved;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class OddEvenLinkedList{
    
    public static void main(String[] args) {
        
        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(2);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(4);
        ListNode r5 = new ListNode(5);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        
        ListNode result = oddEvenList(r1);
        System.out.println(result.val+"");
    }
    
    static ListNode oddEvenList(ListNode head) {
        if (head == null ) {
            return null;
        }
        
        ListNode odd = head;
        ListNode eHead = head.next;
        ListNode even = eHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = eHead;
        return head;
    }
    
}

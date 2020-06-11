package solved;
//206. ReverseLinkedList
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseLinkedList{
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
        
        ListNode result = reverseList(r1);
        System.out.println(result.val+"");
        
    }
    // 1->2->3->4->5
    static ListNode reverseList(ListNode head) {
        /*
        //[1] iterative
        if(head == null){
            return null;
        }
        // 1(->2->3->4->5)
        ListNode tmp = head;
        // 1
        ListNode reHead = new ListNode(head.val);
        
        while(tmp != null && tmp.next!=null){
            
            // 2 // 3
            ListNode firstNode = new ListNode(tmp.next.val);
            
            //2 -> 1(->2->3->4->5) // 3-> 2 -> 1(->2->3->4->5)
            firstNode.next = reHead;
            reHead = firstNode;
            
            //2(->3->4->5)
            tmp = tmp.next;
        }
        return reHead;
      
        //SOLUTION
        //next가 NULL일 경우 그 뒤에 따라서 안붙음..
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;

        */

        //JAVA
        ListNode prev = null;
        while (head != null) {
            //2->3->4->5 // 3->4->5
            ListNode curr = head.next;
            //1->null // 2->1->null
            head.next = prev;
            //1->null
            prev = head;
            //2->3->4->5
            head = curr;
        }
        return prev;

/*
        //PYTHON - Better than java
        ListNode prev = null;
        while (head != null) {
            //1->2->3->4->5 // 2->3->4->5
            ListNode curr = head;
                                //2->3->4->5 // 3->4->5
                                head = head.next;
            //1->null
            curr.next = prev;
            //1->null
            prev = curr;
        }
        return prev;
*/
        /*
        /**
        //[2] recursive
        if(head != null && head.next != null){
            ListNode firstNode = new ListNode(tmp.next.val);
            firstNode.next = 
            
            return  reverseList(head.next).next = reHead;
        }else{
            return head;
        }
        */
        //SOLUTION
        // if (head == null || head.next == null) {
        //     return head;
        // }
        
        //P : (->4->
        // 1->2->3 4 5
        //HEAD  : 4->NULL
        //3->4->NULL
        // ListNode p = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return p;

        //USING HELPER
        // CALL helper(null, head);
        // ListNode helper(ListNode reversed, ListNode remaining) {
        //     if(remaining==null) return reversed;
        //     ListNode tmp = remaining.next;
        //     remaining.next = reversed;
            
        //     return helper(remaining, tmp);
        // }
        
    }
}

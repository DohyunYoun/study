 class ListNode{ 
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists21{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        // ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        // ListNode a3 = new ListNode(4);
        ListNode b1 = new ListNode(1);
        // ListNode b2 = new ListNode(3);
        // ListNode b3 = new ListNode(4);
        // a1.next = a2;
        // a2.next = a3;
        // b1.next = b2;
        // b2.next = b3;
        
        ListNode empty = null;
        mergeTwoLists(a2,b1);
        
    }
    
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode head = null;
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        
        if(l1.val < l2.val){
            result = new ListNode(l1.val);
            l1 = l1.next;
        }else{
            result = new ListNode(l2.val);
            l2 = l2.next;
        }
        
        head = result;
        
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            result = result.next;
            
        }
        
        if(l1 == null){
            result.next = l2;
        }
        if(l2 == null){
            result.next = l1;
        }
        return head;
        
        
        
        // Solution Reference
        /* 
        ListNode fakeHead = new ListNode(0);
        ListNode curr = fakeHead;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                fakeHead.next = l1;
                l1 = l1.next;
            }else{
                fakeHead.next = l2;
                l2 = l2.next;
            }
            fakeHead = fakeHead.next;
        }
        
        if(l1 == null){
            fakeHead.next = l2;
        }else if(l2 == null){
            fakeHead.next = l1;
        }
        return curr.next;
         */
     
    }
}

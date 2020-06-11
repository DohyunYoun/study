 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    
    public String toString() {
        return "val = " + val;
    }
}

public class IntersactionNode{
    public static void main(String[] args) {
        ListNode a1 =new ListNode(4);
        ListNode a2 =new ListNode(1);
        ListNode a3 =new ListNode(2);
        ListNode b1 =new ListNode(2);
        a1.next = a2;
        a2.next = a3;
        // System.out.println("a1 "+a1.val);
        // System.out.println("a2 "+a1.next.val);
        System.out.println(getIntersectionNode(a1, b1).toString());

    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA, pb = headB;
        while (pa != pb) {
            pa = (pa != null) ? pa.next : headA;
            pb = (pb != null) ? pb.next : headB;
            if(pa == pb){
                return pa;
            }
        }
        return pa;
    }

    // static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode tmpNode = headB;
        
    //     if(headA == null || headB == null){
    //         return null;
    //     }
    //     while(headA != tmpNode){
    //         if(tmpNode.next == null){
    //             if(headA.next == null){
    //                 return null;
    //             }
    //             headA = headA.next;
    //             tmpNode = headB;
    //         }else{
    //             tmpNode = tmpNode.next;
    //         }
          
    //     }
        
    //     if(headA == tmpNode){
    //         return tmpNode;
    //     }else{
    //         return null;
    //     }
    // }
    
    
}

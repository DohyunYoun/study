import java.util.Hashtable;
import java.util.Set;

class ListNode{ 
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class IntersectionOfTwoLinkedLists160{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");

           ListNode a1 = new ListNode(1);
           ListNode a2 = new ListNode(2);
           ListNode a3 = new ListNode(4);
           ListNode b1 = new ListNode(1);
           ListNode b2 = new ListNode(3);
           ListNode b3 = new ListNode(4);
           ListNode b4 = new ListNode(2);
           ListNode b5 = new ListNode(4);
           a1.next = a2;
           a2.next = a3;
           b1.next = b2;
           b2.next = b3;
           b3.next = b4;
           b4.next = b5;

           getIntersectionNode(a1,b1);

    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //brute force 813 ms	42.2 MB
        ListNode b = headB;
        while(headA!=null){
            while(headB!=null){
                if(headA == headB){
                    return headB;
                }else{
                    headB =  headB.next;
                }
            }
            headB = b;
            headA=headA.next;
        }
        return null;

        //length check 1 ms	42.6 MB
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            if(a==null){
                a = headB;
            }else{
                a = a.next;
            }

            if(b==null){
                b = headA;
            }else{
                b = b.next;
            }
        }
        return a;



        
        //hashSet 12 ms	42.6 MB//O(m+n), O(n)
        // Set<ListNode> seta = new HashSet<>();
        // Set<ListNode> setb = new HashSet<>();
        // while(headA != null || headB != null) {
        //     if(headA == headB)
        //         return headA;
        //     if(seta.contains(headB))
        //         return headB;
        //     if(setb.contains(headA))
        //         return headA;
        //     seta.add(headA);
        //     headA = headA == null? null : headA.next;
        //     setb.add(headB);
        //     headB = headB == null? null : headB.next;
        // }
        //  return null;
    }
}

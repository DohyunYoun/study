
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }



public class AddTwoNumbers2{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        addTwoNumbers(a1,b1);
    }

    
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        int value = (l1.val+l2.val)/10;
        int remain = (l1.val+l2.val)%10;

        if(l1.next != null && l2.next != null){
            result.val = remain;
            l1.next.val = l1.next.val + value;
            result.next = addTwoNumbers(l1.next, l2.next);
        }
        return result;
    }

    public ListNode resList = new ListNode(0);
    public ListNode head = resList;
    public int carry = 0;

    //solution
    public ListNode addTwoNumbers22(ListNode l1, ListNode l2) { 
        int sum = l1.val + l2.val + carry;
        carry  = sum / 10;
        resList.next = new ListNode(sum % 10);
        resList = resList.next;
    
        if(l1.next != null && l2.next != null)
            addTwoNumbers(l1.next, l2.next);  
        else if (l1.next != null)
            addTwoNumbers(l1.next, new ListNode(0)); 
        else if (l2.next != null)
            addTwoNumbers(new ListNode(0), l2.next);   
        else if (carry > 0)
        {
            resList.next = new ListNode(1);
            resList = resList.next;
        }     
        return head.next;
    }
}

class LeetCode2{
    //Kotlin
    /*
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var additionalDigit = 0
        var head: ListNode? = null

        var node1 = l1
        var node2 = l2
        var result = head
        while(node1 != null || node2 != null) {
            val sum = additionalDigit + (node1?.`val`?:0) + (node2?.`val`?:0)
            val sumListNode = ListNode(sum % 10)
            if (result != null) {
                result.next = sumListNode
                result = result.next
            } else {
                result = sumListNode
                head = result
            }
            additionalDigit = sum / 10
            node1 = node1?.next
            node2 = node2?.next
        }
        if(additionalDigit != 0){
            result?.next = ListNode(additionalDigit)
        }
        return head
    }
    */
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode result = head;

        int round = 0;

        while(l1 != null || l2!=null){
          int value = round;
          if(l1 != null){
            value+=l1.val;          
            l1 = l1.next;
          }
            
          if(l2 != null){
            value+=l2.val;
            l2 = l2.next;
          }
                     
          ListNode node = new ListNode(value%10);
          if(result != null){
              result.next = node;
              result = result.next;
          }else{
            result = node;
            head = result;
          }
          round = value/10;
        }

        if(round > 0){
          result.next = new ListNode(round);
        }
        return head;
    }

    public  static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
      public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;


        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
    
        l21.next = l22;
        l22.next = l23;

        addTwoNumbers(l11, l21);

      }
}

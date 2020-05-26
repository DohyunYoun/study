public class RemoveNthNodeFromEndofList19{

  static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(4,a1);
        ListNode a3 = new ListNode(3,a2);
        ListNode a4 = new ListNode(2,a3);
        ListNode a5 = new ListNode(1,a4);
        removeNthFromEnd(a5,4);
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode tmp =head;
        ListNode result = tmp;
        for(int i = 0 ; i < n ; i++){
            if(i == n-1){
                tmp.next = head.next;
                return result;
            }
            tmp = head;
            head = head.next;
        }
        return result;
    }
}

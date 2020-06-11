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

public class MergeTwoLists{
    
    public static void main(String[] args) {
        
        ListNode a1 =new ListNode(5);
        // ListNode a2 =new ListNode(2);
        // ListNode a3 =new ListNode(4);
        ListNode b1 =new ListNode(1);
        ListNode b2 =new ListNode(2);
        ListNode b3 =new ListNode(4);
        // a1.next = a2;
        // a2.next = a3;
        b1.next = b2;
        b2.next = b3;
        
        ListNode result = mergeTwoLists(a1, b1);
        while(result.next != null){
            System.out.println(result.val+"");
            result = result.next;
        }
        
    }
    
    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while(l2!=null){
            if(l1.val < l2.val){
                return mergeTwoLists(l1,l2).next;
            }

        }
        return null;
    }
}


//brute solution
// public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    //     ListNode result = new ListNode(0);
    //       while(l1 != null || l2 != null){
        //           if(l1 == null){
            //               result.next = new ListNode(l2.val);
            //               result = result.next;
            //               l2 = l2.next;
            //           }else if( l2 == null){
                //               result.next = new ListNode(l1.val);result = result.next;
                //               l1 = l1.next;
                //           }else{
                    //               if(l1.val == l2.val){
                        //                   if(result.val != 0){
                            //                       if(l1 != null){
                                
                                //                           result.next = new ListNode(l1.val);
                                //                           result = result.next;
                                //                       }
                                //                   }else{
                                    //                       if(l1 != null)
                                    //                       result = new ListNode(l1.val);
                                    //                       if(l2 != null){
                                        
                                        //                           result.next = new ListNode(l2.val);
                                        //                           result = result.next;
                                        //                       }
                                        //                   }
                                        
                                        
                                        //                   l1 = l1.next;
                                        //                   l2 = l2.next;
                                        //               }else if(l1.val < l2.val){
                                            //                   if(result .val != 0){
                                                //                       if(l1 != null){
                                                    
                                                    //                           result.next = new ListNode(l1.val);
                                                    //                           result = result.next;
                                                    //                       }
                                                    //                   }else{
                                                        //                       if(l1 != null)
                                                        //                       result = new ListNode(l1.val);
                                                        //                   }
                                                        //                   l1 = l1.next;
                                                        //               }else{
                                                            //                   if(result .val != 0){
                                                                //                       if(l2 != null){
                                                                    
                                                                    //                           result.next = new ListNode(l2.val);
                                                                    //                           result = result.next;
                                                                    //                       }
                                                                    //                   }else{
                                                                        //                       if(l2 != null)
                                                                        //                       result = new ListNode(l2.val);    
                                                                        //                   }
                                                                        
                                                                        //                   l2 = l2.next;
                                                                        //               }
                                                                        //           }
                                                                        //       }
                                                                        //       return result;
                                                                        //   }
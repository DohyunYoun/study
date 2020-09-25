package algorithm;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode234 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    //5 ms	43.4 MB
    public static boolean isPalindromeSolution1(ListNode head) {
        Deque<Integer> d1 = new ArrayDeque<>();
        Deque<Integer> d2 = new ArrayDeque<>();

        while (head != null) {
            d1.addFirst(head.val);
            d2.addLast(head.val);
            head = head.next;
        }

        int length = d1.size() / 2;
        for (int i = 0; i < length; i++) {
            if (!d1.pollFirst().equals(d2.pollFirst())) {
                return false;
            }

        }

        return true;
    }

    //0 ms	42.2 MB
    public boolean isPalindromeSolution2(ListNode head) {
        //[] or [1]
        if (head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode newHead = null;

        while (fast != null) {
            if (fast.next == null) {
                //slow, go to middle
                head = head.next;
                break;
            } else {
                fast = fast.next.next;
            }

            //reverse head == newHead
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        while (newHead != null) {
            if (newHead.val != head.val) return false;
            newHead = newHead.next;
            head = head.next;
        }

        return true;
    }
}

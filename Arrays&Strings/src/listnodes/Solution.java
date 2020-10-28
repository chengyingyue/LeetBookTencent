package listnodes;

import com.arraysandstrings.Main;

public class Solution {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;

        }

        /**
         * 反转一个单链表。
         * <p>
         * 示例:
         * <p>
         * 输入: 1->2->3->4->5->NULL
         * 输出: 5->4->3->2->1->NULL
         * 进阶:
         * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
         */
        public static ListNode reverseList(ListNode head) {
            //return helper(head,null);
            ListNode curr = head;
            ListNode re = null;
            ListNode result = null;
            while (curr != null) {
                re = new ListNode(curr.val);
                re.next = result;
                result = re;
                curr = curr.next;
            }
            return result;
        }

        public static ListNode helper(ListNode head, ListNode tail) {
            if (head == null) {
                return tail;
            }
            ListNode a = new ListNode(head.val);
            a.next = tail;
            return helper(head.next, a);
        }
    }
}
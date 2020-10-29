package listnodes;

public class AddTwoNumbers {
    /**给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
     * 并且它们的每个节点只能存储 一位 数字。

     如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

     您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

     示例：

     输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     输出：7 -> 0 -> 8
     原因：342 + 465 = 807
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = null;
        ListNode curr=null;
        ListNode newNode;
        int value;
        boolean add1=false;
        boolean first = true;
        while(!(curr1==null && curr2 ==null && add1==false)){
            if(curr1==null){
                curr1=new ListNode(0);
            }
            if(curr2==null){
                curr2=new ListNode(0);
            }
            value = curr1.val+curr2.val;
            if(add1){
                value++;
            }
            if(value>9){
                add1=true;
                value = value % 10;
            }else{
                add1=false;
            }
            newNode = new ListNode(value);
            if(first){
                curr = newNode;
                head = curr;
                first=false;
            }else{
                curr.next=newNode;
                curr=curr.next;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return head;
    }

}

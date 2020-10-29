package listnodes;

public class ListNode {

    /**
     * Definition for singly-linked list.
     */
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode curr=this;
        String str = "";
        while(curr!=null){
            str+=curr.val+"->";
            curr=curr.next;
        }
        str +="null";
        return str;
    }
}

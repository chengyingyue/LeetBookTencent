package com.company;

import listnodes.*;

public class Main {
    public static void main(String[] args){
        ListNode lll1 = new ListNode(9);
        ListNode ll1 = new ListNode(9);
        ListNode l1 = new ListNode(9);
        l1.next=ll1;
        ll1.next=lll1;
        ListNode l2 = new ListNode(9);
        ListNode ll2 = new ListNode(9);
        ListNode lll2 = new ListNode(9);
        ListNode llll2 = new ListNode(9);
        l2.next=ll2;
        ll2.next=lll2;
        lll2.next=llll2;
        System.out.println(AddTwoNumbers.addTwoNumbers(l1, l2).toString());
    }
}

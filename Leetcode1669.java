
 //Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }



public class Leetcode1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2){
        ListNode leftNode=list1;
        ListNode rightNode=list1;
        ListNode headNode=list2;
        for(int i=0;i<a-1;i++){
            leftNode=leftNode.next;
        }
        for(int i=0;i<b;i++){
            rightNode=rightNode.next;

        }
        leftNode.next=headNode;
        while(headNode.next!=null){
            headNode=headNode.next;
        }
        headNode=rightNode.next;
        return leftNode;
    }
}


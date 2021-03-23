 class ListNode {
	 	int val;
 		ListNode next;
		ListNode(int x) { val = x; }
  }
  public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
    	ListNode dummy=new ListNode(0);
    	dummy.next=head;
    	ListNode prev=dummy;
    	
    	
    	while(head!=null&&head.next!=null){
    		prev.next=head.next;
    		head.next=prev.next.next;
    		prev.next.next=head;
    		prev=prev.next.next;
    		head=prev.next;
    		
    	}
    	
        return dummy.next;
    }
    public static void main(String[]args){
    	ListNode l1=new ListNode(1);
    	ListNode l2=new ListNode(2);
    	ListNode l3=new ListNode(3);
    	ListNode l4=new ListNode(4);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	l4.next=null;
    	System.out.println(new LeetCode24().swapPairs(l3).val);

    }
}

 public class ListNode {
	 	int val;
 		ListNode next;
		ListNode(int x) { val = x; }
  }
 
class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode dummy=new ListNode(0);
    	dummy.next=head;
    	ListNode prev=dummy;
    	while(prev!=null){
    		prev=reverse(prev,k);
    	}
    	return dummy.next;
        
    }
    public ListNode reverse(ListNode prev,int k){
    	ListNode last=prev;
    	for(int i=0;i<k+1;i++){
    		last=last.next;
    		if(i!=k&&last==null) return null;
    		ListNode tail=prev.next;
    		ListNode cur=prev.next.next;
    		while (cur!=last){
    			ListNode next=cur.next;
    			cur.next=prev.next;
    			prev.next=cur;
    			tail.next=next;
    			cur=next;
    		}
    		return tail;
    	}
    }
}
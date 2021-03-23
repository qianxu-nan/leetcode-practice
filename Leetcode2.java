
/*You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.*/

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
	}
}
class Leetcode2
{
	public Node addTwoSum(Node l1, Node l2)
	{
		if(l1==null)
			return l2;
		if (l2==null)
			return l1;
		int carry=0;
		Node p1=l1, p2=l2;
		Node head=new Node(0);
		Node p3=head;
		while(p1!=null||p2!=null)
		{
			int x=(p1!=null)? p1.data:0;
			int y=(p2!=null)? p2.data:0;
			int sum=x+y+carry;
			carry=sum/10;
			Node newnode=new Node(sum%10);
			p3.next=newnode;
			p3=p3.next;
			p1=p1.next;
			p2=p2.next;
		}
		if(carry>0)
		
			p3.next=new Node(carry);
			return head.next;
		
	}
}
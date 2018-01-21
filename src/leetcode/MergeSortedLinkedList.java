package leetcode;

class MergeSortedLinkedList {
Node head;
static Node a,b;
static class Node{
	int data;
	Node next;
	
	public Node(int d)
	{
		data=d;
		next=null;
	}
}

public static void main(String args[])
{
	MergeSortedLinkedList list = new MergeSortedLinkedList();
	Node result=null;
	list.a=new Node(5);	
	list.a.next=new Node(10);
	list.a.next.next=new Node(15);
	printlist(a);
	
	list.b=new Node(6);
	list.b.next=new Node(12);
	list.b.next.next=new Node(18);
	printlist(b);
	
	result=mergeLists(a,b);
	printlist(result);
}

private static Node mergeLists(Node first, Node second) {
	if(first==null && second ==null)
		return null;
	Node result=null;
	while(first!=null && second!=null)
	{
		if(first.data<=second.data)
		{
			Node temp=first.next;
			first.next=result;
			result=first;
			first=temp;
		}
		else
		{
			Node temp=second.next;
			second.next=result;
			result=second;
			second=temp;
		}
	}
	
	while(first!=null)
	{
		Node temp=first.next;
		first.next=result;
		result=first;
		first=temp;
	}
	while(second!=null)
	{
		Node temp=second.next;
		second.next=result;
		result=second;
		second=temp;
	}
	return result;
	// TODO Auto-generated method stub
	
	
}

private static void printlist(Node node) {
	// TODO Auto-generated method stub
	//Node node=head;
	System.out.println();
	while(node!=null)
	{
		
		System.out.print(node.data+" ");
		
		node=node.next;
	}
	
}
}

package leetcode;


public class LinkedList {
	static Node head;
	
	static class Node {
		public int data;
		public Node next;
		
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	
	
public static void main(String args[])
{
	insertAtHead(1);
	insertAtHead(2);
	insertAtEnd(3);
	insertAtEnd(10);
	insertAtPosition(12,3);
	//deleteAtHead();
	//deleteAtEnd();
	deleteAtPos(2);
	printList();
	
}



private static void deleteAtPos(int pos) {
	// TODO Auto-generated method stub
	Node n=head;
	Node temp=head;
	//navigate till two steps before the position
	for(int i=0;i<pos-2;i++)
	{
		n=n.next;
		temp=temp.next;
	}
	//navigate the temp also till the next item in the list and connect the pos-1 link to pos+1 link so that the item in the pos will be lost 
	temp=temp.next;
	n.next=temp.next;
	
	
}



private static void deleteAtEnd() {
	// TODO Auto-generated method stub
	Node n=head;
	int size=0;
	while(n!=null)
	{
		n=n.next;
		size++;
	}
	System.out.println("size of list :"+size);
	n=head;
	for(int i=0;i<size-2;i++)
	{
		n=n.next;
	}
	n.next=null;
	
}



private static void deleteAtHead() {
	// TODO Auto-generated method stub
	Node newhead=head;
	head=head.next;
	newhead.next=head;
}



private static void insertAtHead(int data) {
	// TODO Auto-generated method stub
	Node newNode=new Node(data);
	newNode.next=head;
	head=newNode;
	
}

private static void insertAtEnd(int data) {
	// TODO Auto-generated method stub
	Node newNode=new Node(data);
	if(head==null)
	{
		head=new Node(data);
		return;
	}
	newNode.next=null;
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=newNode;
	return;
	
}

private static void insertAtPosition(int data, int pos) {
	// TODO Auto-generated method stub
	Node newnode=new Node(data);
	Node temp=head;
	int i=0;
	// minus 2 because of the index.. usually minus 1 but since we are having head we gotta reduce length minus 2
	while(i<pos-2)
	{
		temp=temp.next;
		i++;
	}
	newnode.next=temp.next;
	temp.next=newnode;
	return;
	
	
}



private static void printList() {
	// TODO Auto-generated method stub
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
	}
	
}





}

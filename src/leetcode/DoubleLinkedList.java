package leetcode;

public class DoubleLinkedList {
	static Node head;
static class Node{
	int data;
	Node prev;
	Node next;
	
	public Node(int d)
	{
		data=d;
		prev=null;
		next=null;
	}
}

public static void main(String args[])
{
	insertAtHead(3);
	insertAtHead(2);
	insertAtHead(1);
	insertAtEnd(4);
	insertAtPos(5,3);
	printList();
}

private static void insertAtPos(int data, int pos) {
	// TODO Auto-generated method stub
	Node newnode=new Node(data);
	Node temp=head;
	Node n=head;
	int size=0;
	while(n!=null)
	{
		n=n.next;
		temp=temp.next;
		size++;
	}
	n=head;
	temp=head;
	for(int i=0;i<pos-2;i++)
	{
		n=n.next;
		temp=temp.next;
	}
	temp=temp.next;
	newnode.next=n.next;
	n.next=newnode;
	temp.prev=newnode;
	newnode.prev=n;
}

private static void insertAtEnd(int data) {
	// TODO Auto-generated method stub
	Node newnode=new Node(data);
	newnode.next=null;
	Node n=head;
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=newnode;
	newnode.prev=last;
	return;
	
}



private static void printList() {
	// TODO Auto-generated method stub
	Node n=head;
	int size=0;
	while(n!=null)
	{
		System.out.print(n.data+"  ");
		n=n.next;
		size++;
	}
	n=head;
	for(int i=0;i<size-1;i++)
		n=n.next;
	System.out.println("\nreverse direction");
	while(n!=null)
	{
		
		System.out.print(n.data+"  ");
		n=n.prev;
	}
	
}

private static void insertAtHead(int data) {
	// TODO Auto-generated method stub
	Node newnode=new Node(data);
	newnode.next=head;
	newnode.prev=null;
	if(head!=null)
		head.prev=newnode;
	head=newnode;
	
}




}

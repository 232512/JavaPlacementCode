//Write a java program to perform the singly list opereation
class SinglyExample{
	Node head;
	class Node{
		int data;
		Node next;
		
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	//display Node of the list
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	//Insert at front
	void insertFront(int d) {
		Node newnode=new Node(d);
		if(head==null) {
			head=newnode;
			newnode.next=null;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}
	//Insert at Middle
	void insertMiddle(int d) {
		Node newnode=new Node(d);
		if(head==null) {
			head=newnode;
			newnode.next=null;
		}
		else {
			newnode.next=head.next;
			head.next=newnode;
		}
		
	}
	//Insert at End
	void insertEnd(int d) {
		Node newnode=new Node(d);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=null;
	}
	//Search in the list
	void Search(Node head,int item) {
		Node temp=head;int flag=0;
		while(temp!=null) {
			if(temp.data==item) {
				flag=1;
				break;
			}
			temp=temp.next;
		}
	  if(flag==1)
		  System.out.println("present");
	  else
		  System.out.println("Not present");
	}
	//Delete at Front
	void deleteFront() {
		if(head==null) {
			System.out.println("Not deleted");
		}
		else {
		   head=head.next;
		}
	}
	//Delete at Mid
	void deleteMid() {
		if(head==null) {
			System.out.println("Not deleted");
		}
		else {
			head.next=head.next.next;
		}
	}
	//Delete at End
	void deleteEnd() {
		if(head==null) {
			System.out.println("Not deleted");
		}
		head.next.next=null;
	}
}
public class LinkedList_Singly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyExample list=new SinglyExample();
		list.head=list.new Node(10);
		SinglyExample.Node second=list.new Node(20);
		SinglyExample.Node third=list.new Node(30);
		//linking part
		list.head.next=second;
		second.next=third;
		
		//list.insertEnd(40);
		//list.Search(list.head,30);
		//list.deleteMid();
		list.deleteEnd();
		list.display();
		
		

	}

}

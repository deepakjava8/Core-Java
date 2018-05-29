package com.ds1;

public class LinkedListClient {
public static void main(String[] args) {
	LinkedList head=new  LinkedList(10);
	LinkedList second=new  LinkedList(8);
	LinkedList third=new  LinkedList(1);
	LinkedList fourth=new  LinkedList(11);
	head.next=second;
	second.next=third;
	third.next=fourth;
	LinkedListClient client=new LinkedListClient();
	client.display(head);
	LinkedList insertAtFirst = client.insertAtFirst(head, 9);
	client.display(insertAtFirst);
	LinkedList insertAtLast = client.insertAtLast(head, 15);
	client.display(insertAtLast);
	client.insertAfter(head, 5);
	client.display(head);
	System.out.println(client.length(head));
	LinkedList insertAtGivenPoistion = client.insertAtGivenPoistion(head, 99);
	client.display(insertAtGivenPoistion);
	//LinkedList deleteFirstNode = client.deleteFirstNode(head);
	//client.display(deleteFirstNode);
	LinkedList deleteLastNode = client.deleteLastNode(head);
	client.display(deleteLastNode);
	LinkedList deleteNodeFromGivenPosition = client.deleteNodeFromGivenPosition(head);
	client.display(deleteNodeFromGivenPosition);
	
	boolean searchElementInLinkedList = client.searchElementInLinkedList(head, 100);
	System.out.println(searchElementInLinkedList);
}
public void display(LinkedList head) {
	LinkedList current=head;
	while(current!=null) {
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.println(current);
}

public LinkedList insertAtFirst(LinkedList head,int data) {
	LinkedList newNode=new LinkedList(data);
	//LinkedList current=head;
	newNode.next=head;
	head=newNode;
	return head;
}

public LinkedList insertAtLast(LinkedList head,int data) {
	LinkedList newNode=new LinkedList(data);
	LinkedList current=head;
	while(current.next!=null) {
		current=current.next;
	}
	current.next=newNode;
	return head;
}

public void insertAfter(LinkedList previous,int data) {
	LinkedList newNode=new LinkedList(20);
	newNode.next=previous.next;
	previous.next=newNode;
}

public int length(LinkedList head) {
	LinkedList current=head;
	int count=0;
	while(current!=null) {
		count=count+1;
		current=current.next;
	}
	return count;
}

public LinkedList insertAtGivenPoistion(LinkedList head,int data) {
	LinkedList newNode=new LinkedList(data);
	LinkedList previous=head;
	int count=1;
	int position=4;
	while(count<position-1) {
		previous=previous.next;
		count++;
	}
	LinkedList current=previous.next;
	newNode.next=current;
	previous.next=newNode;
	return head;
}

public LinkedList deleteFirstNode(LinkedList head) {
	LinkedList temp=head;
	head=head.next;
	temp.next=null;
	System.out.println("Deleted Node is : "+temp.data);
	return head;
}
public LinkedList deleteLastNode(LinkedList head) {
	LinkedList last=head;
	LinkedList previousToLast=null;
	
	while(last.next!=null) {
		previousToLast=last;
		last=last.next;
	}
	previousToLast.next=null;
	return head;
}
public LinkedList deleteNodeFromGivenPosition(LinkedList head) {
	LinkedList previous=head;
	int count=1;
	int position=4;
	while(count<position-1) {
		previous=previous.next;
		count++;
	}
	LinkedList current=previous.next;
	previous.next=current.next;
	current.next=null;
	
	return head;
}

public boolean searchElementInLinkedList(LinkedList head,int searchKey) {
	LinkedList current=head;
	while(current!=null) {
		if(current.data==searchKey) {
			return true;
		}
		current=current.next;
	}
	return false;
}

}

package com.rbr.datastr;

public class LinkedList {

	Node head;

	//print list
	void printList(){
		Node d = head;

		while(d != null){
			System.out.print(" "+d.data);
			d = d.next;
		}

	}

	//print using recursion
	void printListUsingrec(Node head1){
		Node d = head1;

		if(d != null){
			System.out.println(d.data);
			printListUsingrec(d.next);
		}

	}
	//print reverse list using recursion
	void printRevUsingRec(Node head1){
		Node d  = head1;

		if(d != null){
			printRevUsingRec(d.next);
			System.out.println(d.data);
		}
	}

	//add at the beginning

	void addAtBegin(Node node){

		node.next = head;
		head = node;

	}
	//add at the end
	void addAtEnd(Node node){
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;

		}

		temp.next = node;
		//node.next = null;

	}
	//add new node after given value of node
	void addAtAfter(int value, Node newNode){
		Node temp = head;
		while(temp.data != value){

			temp = temp.next;

		}

		newNode.next = temp.next;
		temp.next = newNode;
	}
	//delete first node
	void deleteAtBegin(){
		if(head==null){
			return;
		}
		else{
			head = head.next;
		}
	}
	//delete the end node
	void deleteAtEnd(){
		Node temp = head;

		if(temp == null){
			return;
		}
		else if(temp.next == null){
			head = null;
		}
		else{
			while(temp.next.next != null){
				temp = temp.next;
			}

			temp.next = null;
		}

	}

	//delete node of given value
	void deleteValue(int value){

		Node temp = head;
		if(head == null){
			return;
		}
		else if(temp.next == null){
			head = null;
		}
		else{

			while(temp.next.data != value){
				temp = temp.next;
			}
			if(temp.next != null){
				temp.next = temp.next.next;
			}

		}

	}

	//reversing linked list

	Node reverseLinkedList(Node head1){

		Node cur = head1;
		Node prev = null;
		Node next = null;

		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;
	}
	//reversing Linked List using recursion
	Node reverseLinkedListUsingRec(Node prev, Node cur){

		if(cur != null){

			reverseLinkedListUsingRec(cur, cur.next);
			cur.next = prev;

		}
		else
			head = prev;

		return head;
	}


	public static void main(String[] args) {

		LinkedList llist = new LinkedList();

		llist.head = new Node(1);

		Node node2 = new Node(2);

		Node node3  = new Node(3);

		llist.head.next = node2;

		node2.next = node3;

		//
		/*llist.printList();

		Node newNode = new Node(0);
		llist.addAtBegin(newNode);
		System.out.println();
		System.out.println("after adding at the beginning***");
		llist.printList();
		Node newNode2 = new Node(4);
		System.out.println();
		System.out.println("after adding at the end****");
		llist.addAtEnd(newNode2);
		llist.printList();
		Node newNode3 = new Node(100);
		llist.addAtAfter(3, newNode3);
		System.out.println();
		System.out.println("**Adding after Node 2");
		llist.printList();
		llist.deleteAtBegin();
		System.out.println();
		System.out.println("**Delting from begin**");
		llist.printList();
		llist.deleteAtEnd();
		System.out.println();
		System.out.println("**delteing from end**");
		llist.printList();
		llist.deleteValue(100);
		System.out.println();
		System.out.println("**deleting 100");
		llist.printList();*/

		//llist.deleteValue(3);
		/*llist.printListUsingrec(llist.head);
		System.out.println("*****REV******");
		llist.printRevUsingRec(llist.head);*/
		llist.printListUsingrec(llist.head);
		System.out.println();
		System.out.println("****After reversing***");
		/*Node head = llist.reverseLinkedList(llist.head);
		llist.printListUsingrec(head);*/
		Node head1 = llist.reverseLinkedListUsingRec(null, llist.head);
		llist.printListUsingrec(head1);

	}


}

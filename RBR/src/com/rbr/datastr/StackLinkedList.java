package com.rbr.datastr;

//implemetation of stack using linked list
public class StackLinkedList {
	
	Node head;
	
	//print list
	void printList(){
		Node d = head;

		while(d != null){
			System.out.print(" "+d.data);
			d = d.next;
		}

	}
	
	void push(int item){
		
		Node node = new Node(item);
		
		if(head==null){
			head = node;
		}
		else{
			node.next = head;
			head = node;
		}
		
	}
	
	int pop(){

		if(head == null){
			System.out.println("underflow***");
			return -1;
		}
		else if(head.next == null){
			head=null;
			return 0;
		}
		else{

			head = head.next;
			return head.data;
		}

	}
	
	public static void main(String[] args) {
		
		StackLinkedList sll = new StackLinkedList();
		/*sll.head = new Node(10);
		Node node2 = new Node(20);
		sll.head.next = node2;
		Node node3 = new Node(30);
		node2.next = node3;*/
		
		sll.push(100);
		sll.printList();
		System.out.println("*****");
		sll.push(200);
		sll.push(300);
		sll.push(400);
		sll.printList();
		System.out.println();
		System.out.println("***POP***");
		sll.pop();
		sll.pop();
		sll.pop();
		sll.pop();
		sll.printList();
		sll.push(200);
		sll.push(300);
		sll.push(400);
		System.out.println();
		System.out.println("***again push***");
		sll.push(200);
		sll.push(300);
		sll.push(400);
		sll.printList();
		
	}

}

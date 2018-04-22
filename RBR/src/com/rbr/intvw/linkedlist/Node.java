package com.rbr.intvw.linkedlist;

public class Node {
	
	int data;
	Node next;
	boolean visited;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	static void printLinkedList(Node head){
		Node cur = head;
		while(cur!=null){
			System.out.print(cur.data+" -> ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		/*Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		
		Node head = node1;
		
		printLinkedList(head);
		
		changehead(head);
		
		printLinkedList(head);*/
		
	}
	
}

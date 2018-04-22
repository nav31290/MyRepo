package com.rbr.intvw.linkedlist;

public class ReverseLinkedList1 {
	
	static Node reverseLinkedList(Node head){
		
		Node prev,cur,next;
		prev=null;
		cur = head;
		
		while(cur!=null){
			
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			
		}
		
		head = prev;
		return head;
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
		
		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		
		Node head = node1;
		System.out.println("before reversing :: ");
		printLinkedList(head);
		head = reverseLinkedList(head);
		System.out.println("after reversing :: ");
		printLinkedList(head);
	}
	
}

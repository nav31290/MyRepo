package com.rbr.intvw.linkedlist;

public class SplitAlternateNode {
	
	static Node head1 = null;
	static Node head2 = null;
	static void splitAlternateNode(Node head){
		
		head1 = head;
		head2 = head.next;
		
		while(head != null){
			
			Node temp = head.next;
			if(temp != null){
				head.next = temp.next;
			}
			else{
				head.next = null;
			}
			head = temp;
			
		}
		
	}
	
	static void printList(Node head){
		
		Node cur = head;
		while(cur!=null){
			System.out.print(" "+cur.data+" ->");
			cur = cur.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Node node1 = new Node(100);
		Node node2 = new Node(200);
		node1.next = node2;
		Node node3 = new Node(300);
		node2.next = node3;
		Node node4 = new Node(400);
		node3.next = node4;
		Node node5 = new Node(500);
		node4.next = node5;
		Node node6 = new Node(600);
		node5.next = node6;
		Node node7 = new Node(700);
		node6.next = node7;
		node7.next = null;
		printList(node1);
		
		splitAlternateNode(node1);
		
		printList(head1);
		printList(head2);
		
	}
	
	
}

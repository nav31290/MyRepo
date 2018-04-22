package com.rbr.intvw.linkedlist;

public class CloningList {
	
	static void cloneList(Node head){
		Node cur = head;
		while(cur != null){
			Node newNode = new Node(cur.data);
			newNode.next = cur.next;
			cur.next = newNode;
			cur = cur.next.next;
		}
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
		SplitAlternateNode.printList(node1);
		
		cloneList(node1);
		System.out.println("after cloning : ");
		SplitAlternateNode.printList(node1);
		System.out.println("after splitting");
		SplitAlternateNode.splitAlternateNode(node1);
		SplitAlternateNode.printList(SplitAlternateNode.head1);
	}
}

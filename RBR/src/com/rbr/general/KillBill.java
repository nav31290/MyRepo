package com.rbr.general;

import java.util.LinkedList;

import sun.font.CreatedFontTracker;

public class KillBill {
	
	void theSurvivor(Node head){
		Node cur = head;
		while(cur.next != cur || cur.prev !=cur){
			
			deleteNode(cur.next);
			cur = cur.next;
			
		}
		
	}
	
	void deleteNode(Node node){
		
		node.prev.next = node.next;
		node.next.prev = node.prev;
		
	}
	
	/*void createCircularLinkedList(){
		
		Node node1 = new Node(1);
		head = node1;
		Node node2 = new Node(2);
		node1.next = node2;
		node2.prev = node1;
		Node node3 = new Node(3);
		node2.next = node3;
		node3.prev = node2;
		Node node4 = new Node(4);
		node3.next = node4;
		node4.prev = node3;
		Node node5 = new Node(5);
		node4.next = node5;
		node5.prev = node4;
		Node node6 = new Node(6);
		node5.next = node6;
		node6.prev = node5;
		Node node7 = new Node(7);
		node6.next = node7;
		node7.prev = node6;
		Node node8 = new Node(8);
		node7.next = node8;
		node8.prev = node7;
		Node node9 = new Node(9);
		node8.next = node9;
		node9.prev = node8;
		Node node10 = new Node(10);
		node9.next = node10;
		node10.prev = node9;
		node10.next = node1;
		node1.prev = node10;
	}*/
	
	void printLinkedList(Node head){
		Node cur = head;
		System.out.print(cur.data+ " --> ");
		cur = cur.next;
		while(cur != head ||(cur.next !=cur)){
			
			System.out.print(cur.data+" --> ");
			cur = cur.next;
		}
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node head = node1;
		Node node2 = new Node(2);
		node1.next = node2;
		node2.prev = node1;
		Node node3 = new Node(3);
		node2.next = node3;
		node3.prev = node2;
		Node node4 = new Node(4);
		node3.next = node4;
		node4.prev = node3;
		Node node5 = new Node(5);
		node4.next = node5;
		node5.prev = node4;
		Node node6 = new Node(6);
		node5.next = node6;
		node6.prev = node5;
		Node node7 = new Node(7);
		node6.next = node7;
		node7.prev = node6;
		Node node8 = new Node(8);
		node7.next = node8;
		node8.prev = node7;
		Node node9 = new Node(9);
		node8.next = node9;
		node9.prev = node8;
		Node node10 = new Node(10);
		node9.next = node10;
		node10.prev = node9;
		node10.next = node1;
		node1.prev = node10;
		
		KillBill kb = new KillBill();
		kb.printLinkedList(head);
		kb.theSurvivor(head);
		System.out.println();
		System.out.println("after deleteing...");
		kb.printLinkedList(head);
	}
	
}

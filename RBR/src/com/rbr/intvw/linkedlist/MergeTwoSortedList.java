package com.rbr.intvw.linkedlist;

public class MergeTwoSortedList {
	
	static Node mergeTwoSortedList(Node head1, Node head2){
		
		Node mergeList;
		Node temp = null;
		if(head1.data <= head2.data){
			mergeList = head1;
			temp = head1;
			head1 = head1.next;
			
		}
		else{
			mergeList = head2;
			temp = head2;
			head2 = head2.next;
			
		}
		System.out.println(" merge list : "+mergeList.data);
		while(head1!=null & head2!=null){
			
			if(head1.data <= head2.data){
				
				temp.next = head1;
				temp = temp.next;
				head1 = head1.next;
				
			}
			else{
				
				temp.next = head2;
				temp = temp.next;
				head2 = head2.next;
				
			}
			
		}
		return mergeList;
		
	}
	
	public static void main(String[] args) {
		
		Node node1 = new Node(100);
		Node node2 = new Node(300);
		node1.next = node2;
		Node node3 = new Node(500);
		node2.next = node3;
		Node node4 = new Node(700);
		node3.next = node4;
		Node node5 = new Node(900);
		node4.next = node5;
		Node node6 = new Node(1100);
		node5.next = node6;
		Node node7 = new Node(1300);
		node6.next = node7;
		node7.next = null;
		
		Node node11 = new Node(200);
		Node node12 = new Node(400);
		node11.next = node12;
		Node node13 = new Node(600);
		node12.next = node13;
		Node node14 = new Node(800);
		node13.next = node14;
		Node node15 = new Node(1000);
		node14.next = node15;
		Node node16 = new Node(1200);
		node15.next = node16;
		Node node17 = new Node(1400);
		node16.next = node17;
		node17.next = null;
		System.out.println("first sorted list");
		SplitAlternateNode.printList(node1);
		System.out.println("second sorted list");
		SplitAlternateNode.printList(node11);
		System.out.println("after merging...");
		Node mergelist = mergeTwoSortedList(node1, node11);
		SplitAlternateNode.printList(mergelist);
		
		
		
	}
	
}

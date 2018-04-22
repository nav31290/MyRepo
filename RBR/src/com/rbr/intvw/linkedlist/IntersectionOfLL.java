package com.rbr.intvw.linkedlist;

public class IntersectionOfLL {
	
	static void intrPoint(Node head1, Node head2){
		Node cur1 = head1;
		int sizeL1=0;
		while(cur1 != null){
			sizeL1++;
			cur1 = cur1.next;
		}
		Node cur2 = head2;
		int sizeL2 = 0;
		while(cur2 != null){
			sizeL2++;
			cur2 = cur2.next;
		}
		
		if(sizeL1 > sizeL2){
			int diff = sizeL1-sizeL2;
			cur1=head1;
			for(int i=0; i<diff; i++){
				cur1 = cur1.next;
			}
			cur2 = head2;
			
			while(cur1 != null || cur2 !=null){
				
				if(cur1 == cur2){
					System.out.println("int pont is : "+cur1.data);
					break;
				}
				cur1  = cur1.next;
				cur2 = cur2.next;
			}
			
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
		
		Node nodel1 = new Node(800);
		Node nodel2 = new Node(900);
		nodel1.next = nodel2;
		//Node nodel3 = new Node(400);
		nodel2.next = node4;
		/*Node nodel4 = new Node(500);
		nodel3.next = nodel4;
		Node nodel5 = new Node(600);
		nodel4.next = nodel5;
		Node nodel6 = new Node(700);
		nodel5.next = nodel6;*/
		
		intrPoint(node1, nodel1);
	}
}

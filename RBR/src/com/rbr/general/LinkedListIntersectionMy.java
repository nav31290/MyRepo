package com.rbr.general;

public class LinkedListIntersectionMy {
	
	static Node head1;
	static Node head2;
	
	Node getIntersectionNode(Node head1, Node head2){
		
		//get count of nodes
		int c1 = getCountOfNodes(head1);
		int c2 = getCountOfNodes(head2);
		int d;
		if(c1>c2){
			 d = c1-c2;
			return getIntersection(d, head1, head2);
			
		}else{
			d = c2-c1;
			return getIntersection(d, head1, head2);
			
		}
		
		
		
		
	}
	
	Node getIntersection(int d, Node cur1, Node cur2){
		
		for(int i=0; i<d; i++){
			
			cur1 = cur1.next;
			
		}
		
		while(cur1!=null || cur2!=null){
			
			if(cur1.next==cur2.next){
				
				return cur1.next;
				
			}
			else{
				cur1 = cur1.next;
				cur2 = cur2.next;
			}
			
		}
		return null;
		
	}
	
	int getCountOfNodes(Node head){
		int count =0;
		while(head != null){
			count++;
			head = head.next;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		LinkedListIntersectionMy l = new LinkedListIntersectionMy();
		l.head1 = new Node(1);
		l.head1.next = new Node(2);
		l.head1.next.next = new Node(3);
		l.head1.next.next.next = new Node(4);
		l.head1.next.next.next.next = new Node(5);
		
		l.head2 = new Node(8);
		l.head2.next = new Node(7);
		l.head2.next.next = new Node(6);
		l.head2.next.next.next = l.head1.next.next.next;
		l.head2.next.next.next.next = new Node(0);
		
		Node inter = l.getIntersectionNode(head1, head2);
		System.out.println(inter.data);
	}
}

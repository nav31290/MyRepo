package com.rbr.intvw.linkedlist;

public class AddOneToList {
	
	static Node addOne(Node head){
		
		Node cur = head;
		Node revList = PalindromeTest.reverseList(cur);
		Node temp = revList;
		Node prev=null;
		int carry = 1;
		int sum=0;
		while(temp != null){
			
			sum = temp.data+carry;
			if(sum==10){
				carry = 1;
			}else{
				carry = 0;
			}
			sum = sum%10;
			temp.data = sum;
			prev = temp;
			temp = temp.next;
		}
		
		if(carry == 1){
			Node extra = new Node(1);
			prev.next = extra;
		}
		
		Node result = PalindromeTest.reverseList(revList);
		return result;
		
	}
	
	
	public static void main(String[] args) {

		Node node1 = new Node(9);
		Node node2 = new Node(9);
		node1.next = node2;
		Node node3 = new Node(9);
		node2.next = node3;
		Node node4 = new Node(6);
		node3.next = node4;
		Node node5 = new Node(9);
		node4.next = node5;
		Node node6 = new Node(9);
		node5.next = node6;
		Node node7 = new Node(9);
		node6.next = node7;
		node7.next = null;
		
		SplitAlternateNode.printList(node1);
		Node res = addOne(node1);
		System.out.println("after adding one : ");
		SplitAlternateNode.printList(res);
	}
}

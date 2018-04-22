package com.rbr.intvw.linkedlist;

public class PalindromeTest {
	
	static void checkForPalindrome(Node head){
		
		Node cur = head;
		Node secondHalf = getMiddleElement(cur);
		
		Node reverseOfSecondHalf = reverseList(secondHalf.next);
		//SplitAlternateNode.printList(reverseOfSecondHalf);
		secondHalf.next = null;
		//SplitAlternateNode.printList(cur);
		//System.out.println("middle element : "+secondHalf.data);
		//System.out.println("second list head : "+reverseOfSecondHalf.data);
		
		while(cur != null && reverseOfSecondHalf!=null){
			//System.out.println(cur.data);
			//System.out.println(reverseOfSecondHalf.data);
			if(cur.data == reverseOfSecondHalf.data){
				
				cur  = cur.next;
				reverseOfSecondHalf = reverseOfSecondHalf.next;
			}
			else{
				Node reverseagain = reverseList(reverseOfSecondHalf);
				secondHalf.next = reverseagain;
				System.out.println("not palindrome");
				break;
			}
			
			Node reverseagain = reverseList(reverseOfSecondHalf);
			secondHalf.next = reverseagain;
			System.out.println("palindrome ...");
		}
		
		
	}
	
	static Node getMiddleElement(Node head){
		
		Node slowPtr=head;
		Node fastPtr = head;
		
		while(fastPtr!=null  && fastPtr.next!=null ){
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
		}
		return slowPtr;
	}
	
	static Node reverseList(Node head){
		
		Node cur, prev, nextNode;
		cur = head;
		prev = null;
		
		while(cur !=null){
			nextNode  = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nextNode;
			
		}
		
		return prev;
		
	}
	
	
	public static void main(String[] args) {
		

		Node node1 = new Node(100);
		Node node2 = new Node(200);
		node1.next = node2;
		Node node3 = new Node(300);
		node2.next = node3;
		Node node4 = new Node(400);
		node3.next = node4;
		Node node5 = new Node(300);
		node4.next = node5;
		Node node6 = new Node(200);
		node5.next = node6;
		Node node7 = new Node(200);
		node6.next = node7;
		node7.next = null;
		
		SplitAlternateNode.printList(node1);
		checkForPalindrome(node1);
		
	}
}

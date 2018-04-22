package com.ms.test;

public class LinkedListAdd1 {
	
	static Node head;
	
	static Node head2;
	
	Node addTwoList(Node head1, Node head2){
		int carry=0;
		Node result=null;
		Node resHead=null;
		int count=0;
		while(head1 != null || head2 != null){
			
			int sum=0;
			int dig1 = 0;
			int dig2 = 0;
			if(head1==null){
				dig1 = 0;
			}
			else{
				dig1 = head1.data;
				head1= head1.next;
			}
			if(head2==null){
				dig2 = 0;
			}
			else{
				dig2 = head2.data;
				head2 = head2.next;
			}
			System.out.println("dig1 : "+dig1+" dig2 : "+dig2);
			sum = carry+(dig1+dig2);
			if(sum>=10){
				carry = 1;
				sum = sum%10;
			}
			else{
				carry=0;
			}
			System.out.println("sum : "+sum+ " carry : "+carry);
			if(count==0){
				result = new Node(sum);
				resHead = result;
				count++;
			}
			else{
				result.next = new Node(sum);
				result = result.next;
			}
			
			
		}
		if(carry>0){
			result.next = new Node(carry);
		}
		
		return resHead;
		
	}
	
	static void printList(Node head){
		while(head!=null){
			System.out.print(" "+head.data);
			head = head.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		
		LinkedListAdd1 lad1 = new LinkedListAdd1();
		lad1.head = new Node(7);
		lad1.head.next = new Node(5);
		lad1.head.next.next = new Node(9);
		lad1.head.next.next.next = new Node(4);
		lad1.head.next.next.next.next = new Node(6);
		System.out.print("First List is ");
        printList(head);
		
		lad1.head2 = new Node(8);
		lad1.head2.next = new Node(4);
		System.out.print("Second List is ");
		printList(head2);
		
		Node rs = lad1.addTwoList(head, head2);
		System.out.println("rssult : ");
		printList(rs);
	}
}

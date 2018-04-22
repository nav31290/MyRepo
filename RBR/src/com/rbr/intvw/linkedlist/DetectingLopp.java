package com.rbr.intvw.linkedlist;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetStreamSOAPCodec;

import javafx.beans.property.LongProperty;

public class DetectingLopp {
	
	static void hashTableApproach(Node head){
		
		Node cur = head;
		Set<Node> nodeSet = new HashSet<>();
 		while(cur!=null){
 			System.out.println("cur data : "+cur.data);
 			if(!nodeSet.add(cur.next)){
 				System.out.println("loop detected : "+ cur.data);
 				break;
 			}
 			else{
 				cur = cur.next;
 			}
 			
			
		}
		
		
	}
	
	static void visitedApproach(Node head){
		
		Node cur = head;
		
		while(cur != null){
			
			if(cur.visited == true){
				System.out.println("loop detected : "+cur.data);
				break;
			}
			else{
				cur.visited = true;
				cur  = cur.next;
			}
			
		}
		
	}
	
	static void slowFastPointerMethod(Node head){
		
		Node slowPtr = head;
		Node fastPtr = head;
		boolean loopExist=false;
		while(slowPtr != null && fastPtr != null && fastPtr.next != null){
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr){
				loopExist = true;
				break;
			}
			
			
		}
		
		if(loopExist){
			System.out.println("inside loop exist"+head.data+" fast ptr : "+fastPtr.data);
			for(slowPtr = head; slowPtr != fastPtr;slowPtr = slowPtr.next, fastPtr = fastPtr.next){
				
				
			}
			System.out.println("starting point of loop : "+slowPtr.data);
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
		node4.next = node2;
		
		//hashTableApproach(node1);
		//visitedApproach(node1);
		slowFastPointerMethod(node1);
	}
	
}

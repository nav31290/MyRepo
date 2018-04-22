package com.rbr.intvw.tree;

public class VerticalOrder {
	
	
	HeadNode buildDLL(Node root, HeadNode head){
		
		Entry e = new Entry(root.data);
		e.next = head.list;
		head.list = e;
		
		if(root.left != null){
			
			if(head.left == null){
				head.left = new HeadNode(head.hd-1);
				head.left.right = head;
			}
			buildDLL(root.left, head.left);
			
		}
		
		if(root.right != null){
			
			if(head.right == null){
				head.right = new HeadNode(head.hd+1);
				head.right.left = head;
			}
			buildDLL(root.right, head.right);
		}
		
		return head;
		
	}
	int maxLevel=0;
	void leftView(Node root, int level){
		//preorder traversal
		if(root!=null){
			
			if(maxLevel < level){
				System.out.println("-- > "+root.data);
				maxLevel = level;
			}
			leftView(root.left, level+1);
			leftView(root.right, level+1);
		}
		//return root;
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		  
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
        tree.root1.right.left = new Node(6);
        tree.root1.right.right = new Node(7);
        tree.root1.left.left.left = new Node(8);
        tree.root1.left.left.right = new Node(9);
        
        /*VerticalOrder vo = new VerticalOrder();
        HeadNode head = new HeadNode(0);
        HeadNode newHead= vo.buildDLL(tree.root1, head);
        
        while(newHead != null){
        	System.out.println("----->" +newHead.hd);
        	while(newHead.list != null){
        	System.out.print("->"+newHead.list.data);
        	newHead.list = newHead.list.next;
        	}
        	newHead = newHead.right;
        }*/
		
        VerticalOrder vo = new VerticalOrder();
        vo.leftView(tree.root1, 1);
       /* Node leftView = vo.leftView(tree.root1, 1, 0);
        Node tem = leftView;
        while(leftView!=null){
        	System.out.print("-> "+leftView.data);
        	leftView = leftView.left;
        }
        System.out.println();
        System.out.println("-----------------------------");
        while(tem!=null){
        	System.out.print("-> "+tem.data);
        	tem = tem.right;
        }*/
	}
	
}

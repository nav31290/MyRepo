package com.rbr.datastr.tree;

public class TreeTraversal {
	
	void inorder(Node root){
		
		if(root != null){
			
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
			
		}
	}
	
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		Node root = bt.root = new Node(100);
		bt.root.left = new Node(200);
		bt.root.right = new Node(300);
		
		bt.root.left.left = new Node(400);
		bt.root.left.right = new Node(500);
		
		bt.root.right.left = new Node(600);
		bt.root.right.right = new Node(700);
		
		TreeTraversal tt = new TreeTraversal();
		tt.inorder(root);
		
	}
}

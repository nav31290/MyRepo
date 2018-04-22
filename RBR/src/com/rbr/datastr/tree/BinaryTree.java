package com.rbr.datastr.tree;

public class BinaryTree {
	
	Node root;
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	public BinaryTree() {
		root = null;
	}
	
	int numOfNodes(Node root){
		
		if(root == null){
			return 0;
		}
		else{
			return 1+ numOfNodes(root.left) + numOfNodes(root.right);
		}
		
	}
	
	int nonLeaves(Node root){
		
		if(root == null){
			return 0;
		}
		else if(root.left==null && root.right == null){
			return 0;
		}
		else{
			return 1+nonLeaves(root.left)+nonLeaves(root.right);
		}
		
	}
	
	int numOfLeaves(Node root){
		
		if(root == null){
			return 0;
		}
		else if(root.left==null && root.right == null){
			return 1;
		}
		else{
			return numOfLeaves(root.left)+numOfLeaves(root.right);
		}
		
	}
	
	int heightOftree(Node root){
		
		if(root == null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 0;
		}
		int l,r;
		l = heightOftree(root.left);
		r = heightOftree(root.right);
		return (1 + ((l>r)?l:r));
		
	}
	
	
	//main
	public static void main(String[] args) {
		
		BinaryTree bt  = new BinaryTree();
		bt.root = new Node(100);
		bt.root.left = new Node(200);
		bt.root.right = new Node(300);
		
		bt.root.left.left = new Node(400);
		bt.root.left.right = new Node(500);
		
		bt.root.right.left = new Node(600);
		bt.root.right.right = new Node(700);
		
		bt.root.right.left.left = new Node(800);
		bt.root.right.left.right = new Node(900);
		
		bt.root.right.right.left = new Node(1000);
		bt.root.right.right.right = new Node(1100);
		
		System.out.println("num of nodes : "+bt.numOfNodes(bt.root));
		System.out.println("num of non leaves : "+bt.nonLeaves(bt.root));
		System.out.println("num of leaves : "+bt.numOfLeaves(bt.root));
		System.out.println("height of tree "+bt.heightOftree(bt.root));
	}
	
}

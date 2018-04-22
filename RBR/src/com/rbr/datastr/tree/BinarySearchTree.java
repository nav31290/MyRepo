package com.rbr.datastr.tree;

public class BinarySearchTree {
	
	Node root;
	
	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void insert(int key){
		root = insertNode(root, key);
	}
	
	public Node insertNode(Node root, int key){

		if(root==null){
			root = new Node(key);
			return root;
		}

		if(key < root.key){
			root.left = insertNode(root.left, key);
		}else if (key > root.key){
			root.right = insertNode(root.right, key);;
		}
		
		return root;
	}
	
	void inorder(){
		inorderTraversal(root);
	}
	
	void inorderTraversal(Node root){
		if(root != null){
			inorderTraversal(root.left);
			System.out.println(root.key);
			inorderTraversal(root.right);
		}
		
	}
	
	int find_min(Node root){
		//Node temp=root;
		while(root.left!=null){
			root = root.left;
		}
		
		return root.key;
		
	}
	
	int find_max(){
		//Node temp=root;
		while(root.right!=null){
			root = root.right;
		}
		
		return root.key;
		
	}
	
	Node searcBST(Node root, int key){
		System.out.println("root here : "+root.key);
		if(root == null || root.key == key){
			return root;
		}
		
		if(root.key > key){
			return searcBST(root.left, key);
		}
		
		System.out.println("root right : "+root.right.key);
		return searcBST(root.right, key);
		
	}
	
	Node deleteRec(Node root, int key){
		
		if(root == null){
			return null;
		}
		
		if(key < root.key){
			root.left = deleteRec(root.left, key);
		}
		else if(key > root.key){
			root.right = deleteRec(root.right, key);
		}
		else{
			
			if(root.left == null){
				return root.right;
			}
			if(root.right == null){
				return root.left;
			}
			
			root.key = find_min(root.right);
			root.right = deleteRec(root.right, root.key);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(60);
		bst.insert(40);
		bst.insert(20);
		bst.insert(90);
		bst.insert(25);
		
		bst.inorder();
		
		Node found = bst.searcBST(bst.root, 90);
		System.out.println("found : "+found.key);
		
		//System.out.println("min : "+bst.find_min());
		//System.out.println("max : "+bst.find_max());
		
		bst.deleteRec(bst.root, 60);
		System.out.println("after deletion : ");
		bst.inorder();
	}
	
}

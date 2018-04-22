package com.rbr.datastr.tree;

public class PrintPath {
	
	void printPathRootToLeaf(Node node, int[] path, int len){
		
		if(node!=null){
			
			path[len] = node.key;
			len++;

			if(node.left==null && node.right==null){
				for(int i=0; i<len; i++){
					System.out.print(" "+path[i]);
				}
				System.out.println();
			}
			else {

				printPathRootToLeaf(node.left, path, len);
				printPathRootToLeaf(node.right, path, len);

			}

		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.left.left = new Node(4);
		root.left.left.right = new Node(5);
		root.left.left.left.left = new Node(6);
		
		root.right = new Node(7);
		root.right.left = new Node(8);
		root.right.right = new Node(11);
		
		int[] path = new int[10];
		PrintPath pp = new PrintPath();
		pp.printPathRootToLeaf(root, path, 0);
		
	}
	
}

package com.rbr.intvw.tree;

import com.sun.corba.se.spi.ior.Identifiable;

import sun.awt.datatransfer.DataTransferer.IndexOrderComparator;
import sun.security.x509.IssuingDistributionPointExtension;

public class BinaryTree {
	
	Node root1, root2;
	
	int sizeOfTree(Node root){
		
		if(root==null){
			return 0;
		}
		
		return sizeOfTree(root.left)+sizeOfTree(root.right)+1;
		
		
	}
	
	boolean identicalTree(Node root1, Node root2){
		
		if(root1 == null || root2 == null){
			return true;
		}
		
		if(root1.data != root2.data){
			return false;
		}
		
		boolean leftIdent =  identicalTree(root1.left, root2.left);
		if(leftIdent == false){
			return false;
		}
		
		boolean rightIndent =  identicalTree(root1.right, root2.right);
		if(rightIndent == false){
			return false;
		}
		
		return true;
	}
	
	Node mirrorTree(Node root){
		
		if(root!= null){
			mirrorTree(root.left);
			mirrorTree(root.right);
			swap(root, root.left, root.right);
		}
		
		return root;
		
	}
	
	void swap(Node root,Node root1, Node root2){
		
		/*Node temp = root1;
		root1 = root2;
		root2 = temp;*/
		root.left = root2;
		root.right = root1;
		
	}
	
	void inorderTraversal(Node root){
		
		if(root != null){
			
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		  
        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);
        
        tree.root2 = new Node(1);
        tree.root2.left = new Node(2);
        tree.root2.right = new Node(3);
        tree.root2.left.left = new Node(4);
        tree.root2.left.right = new Node(5);
        
        /*int size = tree.sizeOfTree(tree.root1);
        System.out.println(size);*/
        
        /*if(tree.identicalTree(tree.root1, tree.root2)){
        	
        	System.out.println("identical tree");
        	
        }
        else{
        	System.out.println("not identical ");
        }*/
        tree.inorderTraversal(tree.root1);
        Node rootMirror = tree.mirrorTree(tree.root1);
        System.out.println("after mirror method call ");
        tree.inorderTraversal(rootMirror);
        
        
	}
	
}

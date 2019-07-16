package com.sathish83.interviewprepration.datastructures;

public class BinaryTree {

	Node root;
	
	public BinaryTree(int key) {
		root = new Node(key);
	}
	
	BinaryTree() 
    { 
        root = null; 
    } 
	
	public static void main(String[] args) {
		
		BinaryTree bt  = new  BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		
		
	}
	
}

package Lec_30_Btree;

import java.util.Scanner;

public class BTree {
	class Node {
		int data;
		Node left;
		Node right;
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}
	}
	Node root;
	Scanner scn = new Scanner(System.in);
	public BTree() {
		// TODO Auto-generated constructor stub
		root = create(null, false);
				
	}
	public Node create(Node parent, boolean isLeft) {
		if(parent==null) {
			System.out.println("Root data de !! ");
				
		}
		else if(isLeft) {
			System.out.println(parent.data+" ka Left child ka data de !! ");
		}else {
			System.out.println(parent.data+" ka Right child ka data de !! ");	
		}
		Node nn = new Node(scn.nextInt());
		
		System.out.println(nn.data + " ka left child hein ?");
		if(scn.nextBoolean()) {
			nn.left = create(nn, true);
		}
		System.out.println(nn.data + " ka right child hein ?");
		if(scn.nextBoolean()) {
			nn.right = create(nn, false);
		}
		return nn;
	}
	public void create(Node parent) {
		System.out.println(parent.data+" ka Left Child hein ");
		if(scn.nextBoolean()) {
			System.out.println(parent.data+" ka Left Child ka data de ");	
			parent.left = new Node(scn.nextInt());
			create(parent.left);
		}
		
		System.out.println(parent.data+" ka Right Child hein ");
		if(scn.nextBoolean()) {
			System.out.println(parent.data+" ka Right Child ka data de ");	
			parent.right = new Node(scn.nextInt());
			create(parent.right);
		}
	}
}

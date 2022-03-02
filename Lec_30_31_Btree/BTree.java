package Lec_30_31_Btree;

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
		if (parent == null) {
			System.out.println("Root data de !! ");

		} else if (isLeft) {
			System.out.println(parent.data + " ka Left child ka data de !! ");
		} else {
			System.out.println(parent.data + " ka Right child ka data de !! ");
		}
		Node nn = new Node(scn.nextInt());

		System.out.println(nn.data + " ka left child hein ?");
		if (scn.nextBoolean()) {
			nn.left = create(nn, true);
		}
		System.out.println(nn.data + " ka right child hein ?");
		if (scn.nextBoolean()) {
			nn.right = create(nn, false);
		}
		return nn;
	}

	public void create(Node parent) {
		System.out.println(parent.data + " ka Left Child hein ");
		if (scn.nextBoolean()) {
			System.out.println(parent.data + " ka Left Child ka data de ");
			parent.left = new Node(scn.nextInt());
			create(parent.left);
		}

		System.out.println(parent.data + " ka Right Child hein ");
		if (scn.nextBoolean()) {
			System.out.println(parent.data + " ka Right Child ka data de ");
			parent.right = new Node(scn.nextInt());
			create(parent.right);
		}
	}

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}
		System.out.println(nn.data);

		Disp(nn.left);
		Disp(nn.right);

	}

	public int Size() {
		return Size(root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}
		int sp1 = Size(nn.left);
		int sp2 = Size(nn.right);

		return sp1 + sp2;
	}

	public boolean Find(int alo) {
		return Find(root, alo);
	}

	private boolean Find(Node nn, int aloo) {
		if (nn == null) {
			return false;
		}
		if (nn.data == aloo) {
			return true;
		}

		boolean l = Find(nn.left, aloo);
		boolean r = Find(nn.right, aloo);

		return l || r;
	}

	public int Ht() {
		return Ht(root);
	}

	private int Ht(Node nn) {
		if (null == nn) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);

		return Math.max(L, R) + 1;
	}
	
	private int Dia(Node nn) {
		if(nn==null){
			return 0;
		}
		int LD = Dia(nn.left);
		int RD = Dia(nn.right);
//		Self Dia!!
		int SD = Ht(nn.left)+Ht(nn.right)+2;
		
		return Math.max(SD, Math.max(RD, LD));
	}
}

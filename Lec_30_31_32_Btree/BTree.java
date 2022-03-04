package Lec_30_31_32_Btree;

import java.util.Scanner;

import Lec_30_31_32_Btree.BTree.BoolHtPair;

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
// Self work!!		
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + " ==> " + nn.data + " <== ";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);
//
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

		return sp1 + sp2 + 1;
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
		if (nn == null) {
			return 0;
		}
		int LD = Dia(nn.left);
		int RD = Dia(nn.right);
//		Self Dia!!
		int SD = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(SD, Math.max(RD, LD));
	}

	public int Dia() {
		return Dia2(root).Dia;
	}

	private DiaHtPair Dia2(Node nn) {
		if (nn == null) {
			DiaHtPair bs = new DiaHtPair();
			return bs;
		}
		DiaHtPair L = Dia2(nn.left);
		DiaHtPair R = Dia2(nn.right);

//		Self Dia!!
		int SD = L.Ht + R.Ht + 2;

//		Pair muje~~~
		DiaHtPair ans = new DiaHtPair();
		ans.Dia = Math.max(SD, Math.max(R.Dia, L.Dia));

		ans.Ht = Math.max(L.Ht, R.Ht) + 1;

		return ans;
	}

	class DiaHtPair {
		int Dia = 0;
		int Ht = -1;
	}

	public boolean isBST() {
		return isBST2(root).isBST;
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBST(nn.left);
		boolean R = isBST(nn.right);
//		check nn ?? is the node balanced ?!
		if (L && R) {
			int result = Ht(nn.left) - Ht(nn.right);
			return Math.abs(result) <= 1;
		}

		return false;

	}

	private BoolHtPair isBST2(Node nn) {
		if (nn == null) {
			return new BoolHtPair();
		}
		BoolHtPair L = isBST2(nn.left);
		BoolHtPair R = isBST2(nn.right);
//		check nn ?? is the node balanced ?!
		BoolHtPair ans = new BoolHtPair();

		if (L.isBST && R.isBST) {
			int result = L.Ht - R.Ht;
			ans.isBST = Math.abs(result) <= 1;
		} else {
			ans.isBST = false;
		}
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		System.out.println(nn.data + " " + ans);
		return ans;
	}

	class BoolHtPair {
		boolean isBST = true;
		int Ht = -1;

		public String toString() {
			return "{" + isBST + " , Ht =" + Ht + " }";
		}
	}

	BTree(int[] pre) {
		idx = 0;
		root = create(pre);
	}

	int idx = 0;

	private Node create(int[] pre) {
		if (pre[idx] == -1) {
			idx++;
			return null;
		}
		Node nn = new Node(pre[idx]);
		idx++;
		nn.left = create(pre);
		nn.right = create(pre);

		return nn;
	}

	private Node create(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if(pe<ps||ie<is) {
			return null;
		}
//		first find the root node and create it!!
		int idx = is;
		int nn_data = pre[ps];
		int Left_size = 0;
		while (in[idx] != pre[ps]) {
			idx++;
			Left_size++;
		}
		Node nn = new Node(nn_data);
		nn.left = create(pre, ps + 1, ps + Left_size, in, is, idx - 1);
		nn.right = create(pre, ps + Left_size + 1, pe, in, idx + 1, ie);

		return nn;
	}

	BTree(int[] pre, int[] in) {

		root = create(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}
}

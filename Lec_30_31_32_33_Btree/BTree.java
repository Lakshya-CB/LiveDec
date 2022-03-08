package Lec_30_31_32_33_Btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lec_30_31_32_33_Btree.BTree.BoolHtPair;

public class BTree {
	class Node {
		int data;
		Node left;
		Node right;

		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		public String toString() {
			return "" + data;
		}
	}

	Node root;
	Scanner scn = new Scanner(System.in);

	public BTree() {
		// TODO Auto-generated constructor stub
		root = create();

	}

	public Node create() {

		Node nn = new Node(scn.nextInt());

		if (scn.nextBoolean()) {
			nn.left = create();
		}

		if (scn.nextBoolean()) {
			nn.right = create();
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

	public boolean isBal() {
		return isBal2(root).isBal;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);
//		check nn ?? is the node balanced ?!
		if (L && R) {
			int result = Ht(nn.left) - Ht(nn.right);
			return Math.abs(result) <= 1;
		}

		return false;

	}

	private BoolHtPair isBal2(Node nn) {
		if (nn == null) {
			return new BoolHtPair();
		}
		BoolHtPair L = isBal2(nn.left);
		BoolHtPair R = isBal2(nn.right);
//		check nn ?? is the node balanced ?!
		BoolHtPair ans = new BoolHtPair();

		if (L.isBal && R.isBal) {
			int result = L.Ht - R.Ht;
			ans.isBal = Math.abs(result) <= 1;
		} else {
			ans.isBal = false;
		}
		ans.Ht = Math.max(L.Ht, R.Ht) + 1;
		System.out.println(nn.data + " " + ans);
		return ans;
	}

	class BoolHtPair {
		boolean isBal = true;
		int Ht = -1;

		public String toString() {
			return "{" + isBal + " , Ht =" + Ht + " }";
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
		if (pe < ps || ie < is) {
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

	class NodelvlPair {
		Node Node;
		int lvl;

		public NodelvlPair(Node n, int l) {
			// TODO Auto-generated constructor stub
			Node = n;
			lvl = l;
		}

	}

	public void LvL() {
		Queue<NodelvlPair> Q = new LinkedList<NodelvlPair>();
		Q.add(new NodelvlPair(root, 0));
		while (!Q.isEmpty()) {
			NodelvlPair nn = Q.poll();
			if (nn.Node == null) {
				continue;
			}
			System.out.println(nn.Node.data + " -- " + nn.lvl);
			Q.add(new NodelvlPair(nn.Node.left, nn.lvl + 1));
			Q.add(new NodelvlPair(nn.Node.right, nn.lvl + 1));
		}

	}

	public void LvL2() {
		Queue<Node> CurrLvl = new LinkedList<>();
		Queue<Node> NextLvl = new LinkedList<>();
		CurrLvl.add(root);
		while (!CurrLvl.isEmpty()) {
			Node nn = CurrLvl.poll();

			System.out.print(nn.data + " ");
			if (nn.left != null) {
				NextLvl.add(nn.left);
			}
			if (nn.right != null) {
				NextLvl.add(nn.right);
			}
			if (CurrLvl.isEmpty()) {
//		Curr lvl is done!! go to the next lvl~~
				System.out.println(" Working on " + NextLvl);
				CurrLvl = NextLvl;
				NextLvl = new LinkedList<>();
				System.out.println();
			}
		}

	}

	public void createLvl(int[] lvl) {

		root = new Node(lvl[0]);
		int idx = 1;
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			if (lvl[idx] != -1) {
				Node L = new Node(lvl[idx]);
				Q.add(L);
				nn.left = L;
			}
			idx++;
			if (lvl[idx] != -1) {
				Node R = new Node(lvl[idx]);
				Q.add(R);
				nn.right = R;
			}
			idx++;
		}

	}

	public boolean Equiv(Node root1, Node root2) {
		if (root1 == root2 && root1 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		boolean L = Equiv(root1.left, root2.left);
		boolean R = Equiv(root1.right, root2.right);

		return L && R && root1.data == root2.data;

	}

	public boolean isBST() {
		return isBST(root);
	}

	private boolean isBST(Node nn) {
		if (nn == null) {
			return true;
		}
//		check curr Node condition!!
//		max of left and Right ka min!!
		int Mx = Max(nn.left);
		int Mn = Min(nn.right);
		if (Mx <= nn.data && nn.data < Mn) {

			boolean L = isBST(nn.left);
			boolean R = isBST(nn.right);

			return L && R;
		}
		return false;

	}

	private isBSTpair isBST2(Node nn) {
		if (nn == null) {
			return new isBSTpair();
		}
//		check curr Node condition!!
//		max of left and Right ka min!!
		isBSTpair L = isBST2(nn.left);
		isBSTpair R = isBST2(nn.right);
		isBSTpair ans = new isBSTpair();
		if (L.Max <= nn.data && nn.data < R.Min) {
			ans.isBST = L.isBST && R.isBST;
		} else {
			ans.isBST = false;
		}
//		max!!
		ans.Max = Math.max(nn.data, Math.max(L.Max, R.Max));
		ans.Min = Math.min(nn.data, Math.min(L.Min, R.Min));

		return ans;

	}

	class isBSTpair {
		boolean isBST = true;
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;

	}

	private int Min(Node nn) {
		if (nn == null) {
			return Integer.MAX_VALUE;
		}
		// TODO Auto-generated method stub
		int L = Min(nn.left);
		int R = Min(nn.left);

		return Math.min(nn.data, Math.min(L, R));
	}

	private int Max(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int L = Max(nn.left);
		int R = Max(nn.left);

		return Math.max(nn.data, Math.max(L, R));
	}

	private int BiggestBST(Node nn) {
		if (nn == null) {
			return 0;
		}
		if (isBST(nn)) {
			return Size(nn);
		}
		int L = BiggestBST(nn.left);
		int R = BiggestBST(nn.right);
		return Math.max(L, R);
	}
}

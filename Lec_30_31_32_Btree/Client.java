package Lec_30_31_32_Btree;

public class Client {
	public static void main(String[] args) {
//		int[] pre = { 10, 20, 30, -1, -1, 50, -1, -1, 40, 60, -1, -1, -1 };

		int[] pre = { 10, 20, 30, 50, 40, 60 };
		int[] in = { 30, 20, 50, 10, 60, 40 };

		BTree bt = new BTree(pre, in);
		bt.Disp();
//		System.out.println(bt.isBST());
	}

}

package Lec_30_31_32_33_Btree;

public class Client_BT {
	public static void main(String[] args) {
//		int[] pre = { 10, 20, 30, -1, -1, 50, -1, -1, 40, 60, -1, -1, -1 };

		int[] pre = { 10, 20, 40, 50, 90, 30, 60 };
		int[] in = { 40, 20, 90, 50, 10, 60, 30 };

		BTree bt = new BTree(pre, in);
		int[] lvl = {10,20,30,40,50,60,-1,-1,-1,90,-1,-1,-1,-1,-1};
		bt.createLvl(lvl);
		
		bt.Disp();

//		System.out.println(bt.isBST());
//		bt.LvL2();
	}

}

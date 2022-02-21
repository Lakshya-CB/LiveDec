package Lec_29_QPS;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);
		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		LL.addLast(100);
		LL.addLast(110);
		LL.disp();

//		System.out.println("====");
//		LL.Rev();
//		System.out.println("====");
//		LL.disp();
//		System.out.println("====");
//		LL.Rev2();
//		System.out.println("====");
//		LL.disp();
		
////		System.out.println(LL.mid());
//		System.out.println(LL.lastK(0));
//		System.out.println(LL.lastK(1));
//		System.out.println(LL.lastK(2));
//		System.out.println(LL.lastK(3));
		
		LL.RevK(3);
		LL.disp();
		
		
	}
}

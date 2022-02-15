package Lec_26;

public class Client {
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		
		Q.disp();
		Q.add(50);

		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		System.out.println(Q.poll());
		Q.disp();
		
		Q.add(60);
		Q.disp();
		
		
		System.out.println(Q.poll());
		Q.disp();
		
		System.out.println(Q.poll());
		Q.disp();
		
//		System.out.println(Q.poll());
//		Q.disp();
		
		Q.add(70);
		Q.add(80);
		
		Q.disp();
		
		Q.add(90);
		Q.add(100);
		Q.add(110);
		Q.disp();
		System.out.println("============");
		Q.add(120);
		Q.add(130);
		Q.disp();

	}

}

package Lec_25;

public class Client_S {
	public static void main(String[] args) throws Exception {
		Stack S = new Stack();
		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);
		
		S.Disp();
		S.push(50);
		S.Disp();
		System.out.println(S.pop());
		S.Disp();
		System.out.println(S.pop());
		S.Disp();
		System.out.println(S.pop());
		S.Disp();
		System.out.println(S.pop());
		S.Disp();
		
	}
}

package Lec_27;

import Lec_25.Stack;

public class Client_Stack_ {
	public static void main(String[] args) throws Exception {
		Min_stack S = new Min_stack();
		S.push(10);
		S.push(50);
		S.push(40);
		S.push(6);
		S.push(45);
		S.push(2);
		S.push(1);
		
		S.Disp();
		System.out.println("Min => " +S.min());
		System.out.println("===============");
		
		
		S.pop();
		S.Disp();
		System.out.println("Min => " +S.min());
		System.out.println("===============");

		S.pop();
		S.Disp();
		System.out.println("Min => " +S.min());
		System.out.println("===============");
		
		S.pop();
		S.Disp();
		System.out.println("Min => " +S.min());
		System.out.println("===============");
		
//		S.Disp();
//		System.out.println(S.pop());
		
	}
}

package Lec_27;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
// 		Case 1:
		
		ArrayList<Integer> AL = new ArrayList<>();
		System.out.println(AL);
		
		Child C = new Child();
		System.out.println(C);
//		Object C01 = new Child();
		
//		Var collision
		System.out.println(C.data);
		System.out.println(((Parent)C).data);
//		Case 2:
		Parent P = new Child(); // ?!?! Teaser !! Onject class, Syso (Onject x)
		System.out.println(P.data);
		System.out.println(((Child)P).data);

		
//		System.out.println(P);
//		System.out.println(((Child)P));
//		Func collision
		P.fn(); // Compiler = Parent fn
		C.fn(); // Complier = Child fn
		((Parent)C).fn();


//		Case 3: Never !! works!!
//		Child C1 = new Parent();
//		System.out.println(C1.);
	}
}

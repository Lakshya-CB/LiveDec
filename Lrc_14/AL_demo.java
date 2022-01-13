package Lrc_14;

import java.util.ArrayList;

public class AL_demo {
	public static void main(String[] args) {
		Integer I = 10; // memory in heap, I address!!
		int ii = 11; // i in FF, stack!!

		System.out.println(I);
		System.out.println(I + 10);

		ii = I;// Unboxing!!
		System.out.println(ii);

		I = ii; // Autoboxing!!
		System.out.println(Integer.MAX_VALUE);
		// Generics!!
		System.out.println("======================");

//		Declare, Initialize !!
		ArrayList<Integer> AL = new ArrayList<Integer>();
		ArrayList<Integer> AL2;
		int[] arr = new int[0];
		AL2 = AL;
//		Indexing?!!?, get !!
//		arr[1];
//		int a = AL.get(0);
//		System.out.println(a);
//		Set!! 
//		arr[3] =10;
		AL.set(3, 10);
		
		
	}
}

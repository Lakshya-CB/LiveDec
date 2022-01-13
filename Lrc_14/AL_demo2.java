package Lrc_14;

import java.util.ArrayList;
import java.util.Collections;

public class AL_demo2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		System.out.println(AL);
		System.out.println(AL.get(0));
//		?size?
		AL.size();
		System.out.println(AL.get(AL.size()-1));
		
		Integer a = null;
		System.out.println(a);
//		
		AL.set(2, 100);
		System.out.println(AL);
//		Add at index!!
		AL.add(1, 200);
		System.out.println(AL);
//		Remove?!!?
		AL.remove(0);
//		System.out.println(ll);
		System.out.println(AL);
		for(int e: AL) {
			System.out.print(e+ " - ");
		}
		System.out.println();
//		Collections.reverse(AL);
//		System.out.println(AL);
		
		
	}
}

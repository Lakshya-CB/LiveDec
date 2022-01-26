package Lec_19;

import java.util.ArrayList;

public class List_List_example {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> big = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> small = new ArrayList<>();
		small.add(10);
		
		big.add(new ArrayList<>(small));
		System.out.println(big);
		
		small.add(20);
		big.add(new ArrayList<>(small));
		System.out.println(big);
		
		small.add(30);
		big.add(new ArrayList<>(small));
		System.out.println(big);
		
		small.add(40);
		big.add(new ArrayList<>(small));
		System.out.println(big);
		
		
		
	}
}

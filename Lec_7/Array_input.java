package Lec_7;

import java.util.Scanner;

public class Array_input {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[] arr = new int[size];
		System.out.println("===============");
		// input ?

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		// Print array!!
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " i th index " + arr[i]);
		}
//For each loop!! // Enhanced loop!!
		System.out.println("===============");

		for (int ele : arr) {
			ele = 10;
			System.out.println(ele);
		}

	}
}

package Lec_6;

import java.util.Scanner;

public class Shopping_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int i = 0;
		int a = 1;
		int h = 2;
		while (i < num) {
			int M = scn.nextInt();
			int N = scn.nextInt();
			while (a <= M) {
				int a1 = a + 2;
				a = a1 + a;
			}
			while (h <= N) {
				int h1 = h + 2;
				h = h1 + h;
			}
			if (a > h) {
				System.out.println("Aayush");
			} else {
				System.out.println("Harshit");
			}
			i++;
		}

	}
}

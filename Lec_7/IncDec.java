package Lec_7;

import java.util.Scanner;

public class IncDec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		boolean Inc = false;
		int Prev = scn.nextInt();
		while (n - 1 > 0) {
			int curr = scn.nextInt();
			if (curr <= Prev && Inc) {
				System.out.println("false");
//				break;
				return;
			}
			
			if (curr== Prev) {
				System.out.println("false");
//				break;
				return;
			}
			if (curr > Prev) { // Strictly Inc
				Inc = true;
			}

			n--;
			Prev = curr;
		}
		System.out.println("true");

	}
}

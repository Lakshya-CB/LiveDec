package Lec_6;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		int phones = 1;
		while (true) {
			if (A >= phones) {
				A = A - phones;
				phones++;
			} else {
				System.out.println("Harshit");
				break;
			}

			if (B >= phones) {
				B = B - phones;
				phones++;
			}else {
				System.out.println("Aayush");
				break;
			}
		}
		
	}
}

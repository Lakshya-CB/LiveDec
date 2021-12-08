package Lec_2;

import java.util.Scanner;

public class Report {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();
		System.out.println("input 1 is takken");
		int marks1 = scn.nextInt();
		System.out.println("input 2 is takken");
		int marks2 = scn.nextInt();
		System.out.println("input 3 is takken");
		
		System.out.println(marks);
		System.out.println(marks1);
		System.out.println(marks2);
		
//		scnlolololololo.close();
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("A");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("B");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("C");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("D");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("E");
		} else {
			System.out.println("F");
		}
		System.out.println("END");
	}
}

package Lec_5;

import java.util.Scanner;

public class Data_type_demo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int i = scn.nextInt();
//
//		
//		long l = scn.nextLong();
//		
//		System.out.println(i);
//		System.out.println(l);

//		Default data type of integral numbers in Java is int!! 
//		long l = 100000000000; wont work!!
		long l = 100000000000l;// l after the literal will tell java that its in long!!
		System.out.println(l);

//		Implicit Type casting!!
		byte b = 1;
		System.out.println(b);
//		Type casting!!
//		Explicit type Casting!!
		b = (byte) 124389;
//		Konse bits select hongi ?? 
//		RHS has 32 bits , LHS has 8 bits?! so which 8 are getting selected!!

//		Convert long to int??
		int i = (int) l;
		long l2 = l;

		short s = 9999; // Emplicit!
//		LHS is bigger , works!! Implicit Type casting!!

		l = i;
		i = s;
		i = b;
		
		
//		char symbol!!
		char ch = '~';
		System.out.println(ch);
		int ch_num = ch;
		System.out.println(ch_num);
		System.out.println((int)ch);
		System.out.println((char)(ch+90));
		
//		char +char , char+int  upgrade int!!

//		Boolean ,
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
		
	}
}

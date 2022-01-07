package Lec_11_12;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
//		printChar(str);
		Palin_SS(str);

	}

	public static void printChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static boolean isPalindrome(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

	public static void Palin_SS(String str) {
		for(int s = 0;s<str.length();s++) {
			for(int e= s+1;e<=str.length();e++) {
				String ss = str.substring(s,e);
				if(isPalindrome(ss)) {
					System.out.println(ss);
				}
			}
		}
	}
}

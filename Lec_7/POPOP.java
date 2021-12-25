package Lec_7;

import java.util.Scanner;

public class POPOP {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printArm(n);
		
	}
	public static void printArm(int n ) {
		for(int i=1;i<=n;i++) {
			if(isArmStrong(i)) {
				System.out.println(i);
			}
		}
		
	}
	public static boolean isArmStrong(int num) {
//		is num an armstrong number!!
		int nod = nod(num);
		int copy = num;
		int new_num = 0;
		while(num>0) {
			int digit = num%10;
			new_num = new_num+(int)Math.pow(digit,nod);
			num = num/10;
		}
		return new_num==copy;
	}
	
	public static int nod(int num) {
//		number of digits!!
		int ans =0;
		while(num>0) {
			num = num/10;
			ans++;
		}
		return ans;
	}
}

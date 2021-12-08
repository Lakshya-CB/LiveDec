package Lec_2;

public class Prime {
	public static void main(String[] args) {
		int num = 65;
		int n = 1;
		int factors = 0;
		while (n <= num) {
//			System.out.println(n);
//			check if n is a factor of num!!
			if (num % n == 0) {
//				then n is a factor!!
				System.out.println(n);
				factors=factors+1;
			}
			n = n + 1;
		}
//		System.out.println(factors);
		if(factors==2) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}

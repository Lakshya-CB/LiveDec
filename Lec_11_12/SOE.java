package Lec_11_12;

import java.util.Arrays;

public class SOE {
	public static void main(String[] args) {
		int n = 100;
		SOE(n);
	}

	public static void SOE(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		
		for (int fact = 2; fact * fact <= n; fact++) {
			if (isPrime[fact]) {
//				for (int table = fact * 2; table <= n; table = table + fact) {
			for(int mult = 2; fact*mult<=n;mult++) {	
				isPrime[fact*mult] = false;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) {
				System.out.print(i+" ");
			}
		}
	}
}

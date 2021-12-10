package Lec_3;

public class GCD {
	public static void main(String[] args) {
		int a1 = 7 * 17;
		int a2 = 7;

		int divisor = a1;
		int dividend = a2;

		while (divisor > 0) {
			int rem = dividend % divisor;
//			2
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}

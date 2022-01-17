package Lec_16;

public class Rec_basics {
	public static void main(String[] args) {
		System.out.println(fact(4));
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = fact(n - 1);
		return sp * n;
	}

	public static int pow(int n, int x) {
		if (x == 0) {
			return 1;
		}
		int sp = pow(n, x - 1);
		return n * sp;
	}

	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		int sp1 = fibo(n - 1);
		int sp2 = fibo(n - 2);
		return sp1 + sp2;
	}

}

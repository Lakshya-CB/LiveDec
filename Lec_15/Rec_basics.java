package Lec_15;

public class Rec_basics {
	static int limit = 0;

	public static void main(String[] args) {
//		PD(4);
//		PI(4);
//		PDI(4);
//		limit = 6;
//		PID(1);
		PID(1, 6);
	}

	public static void PD(int n) {
		if (n == 0) { // Smallest problem!! Base Case!!
			return;
		}
//		BP : PD(n)
//		SP: PD(n-1);
		System.out.println(n);
		PD(n - 1);

	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
//		BP : PI(n)
//		SP : PI(n-1)
		PI(n - 1);
		System.out.println(n);
	}

	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}

	public static void PID(int n) {
		if (n == limit + 1) {
			return;
		}
		System.out.println(n);
		PID(n + 1);
		System.out.println(n);
	}

	public static void PID(int n, int limit) {
		if (n == limit + 1) {
			return;
		}
		System.out.println(n);
		PID(n + 1, limit);
		System.out.println(n);
	}
}

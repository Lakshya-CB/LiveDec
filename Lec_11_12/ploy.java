package Lec_11_12;

public class ploy {
	public static void main(String[] args) {
		int x = 7;
		int n = 3;
		int pow = x;
		int sum = 0;
		for (int c = n; c >= 1; c--) {
			sum = sum + pow * c;

			pow = pow * x;
		}
		System.out.println(sum);
	}
}

package Lec_22;

public class Check {
	public static void main(String[] args) {
		int ans = comb_floor(6, "",1);

		System.out.println(ans);

	}

	public static int comb_floor(int n, String soln, int last) {

		if (n == 0) {
			System.out.println(soln);
			return 1;
		}
		if (n < 0) {
			return 0;
		}
		int count = 0;
		for (int i = last; i <= 2; i++) {
			count = count + comb_floor(n - i, soln + i, i);
		}

		return count;
	}

}

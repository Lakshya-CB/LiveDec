package Lec_16;

public class Eng_Ruler {
	public static void main(String[] args) {
		Eng_create(3, 3);
	}

	public static void Eng_create(int mjor, int len) {
		for (int ll = 0; ll < len; ll++) {
			for (int i = 1; i <= mjor; i++) {
				System.out.print("-");
			}
			System.out.println(ll);
			P(mjor - 1);
		}
		for (int i = 1; i <= mjor; i++) {
			System.out.print("-");
		}
		System.out.println(len);
	}

	public static void P(int tic) {
		if (tic == 0) {
			return;
		}
		P(tic - 1);
		for (int i = 1; i <= tic; i++) {
			System.out.print("-");
		}
		System.out.println();
		P(tic - 1);
	}
}

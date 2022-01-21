package Lec_18;

import java.util.List;

public class rec_stairs {
	public static void main(String[] args) {
//		climb(0, "", 5);
//		genParen(3, 3, "");
//		for (int i = 1; i <= 9; i++) {
//			lex(i, 1000);
//		}
//		lex(0, 1000);

//		for (int i = 1; i <= 9; i++) {
//			jumpin(i, 105);
//		}
		Partition("niittiin", "");
	}

	public static void climb(int curr, String path, int dest) {
		// +ve
		if (curr == dest) {
			System.out.println(path);
			return;
		}

		// -ve BC
		if (curr > dest) {
			return;
		}

		climb(curr + 1, path + 1, dest);
		climb(curr + 2, path + 2, dest);
		climb(curr + 3, path + 3, dest);

	}

	public static void genParen(int cO, int cC, String ans, List<String> AL) {
//		+ve
		if (cO == cC && cO == 0) {
//			System.out.println(ans);
			AL.add(ans);
			return;
		}
//		-ve 
		if (cO > cC) {
			return;
		}
		if (cO > 0)
			genParen(cO - 1, cC, ans + "(", AL);

		if (cC > 0)
			genParen(cO, cC - 1, ans + ")", AL);

	}

	public static void lex(int curr, int limit) {
		if (curr > limit) {
			return;
		}
		System.out.println(curr); // +ve BC is present in each function frame!!
		int i = 0;
		if (curr == 0)
			i = 1;
		for (; i <= 9; i++) {

			lex(curr * 10 + i, limit);
		}
	}

	public static void jumpin(int num, int limit) {
		if (num > limit) {
			return;
		}

		System.out.println(num);
		int digit = num % 10;
		if (digit > 0)
			jumpin(num * 10 + (digit - 1), limit);
		if (digit < 9)
			jumpin(num * 10 + (digit + 1), limit);

	}

	public static void Partition(String str, String parts) {

		if (str.isEmpty()) {
			System.out.println(parts);

		}

		for (int chop = 1; chop <= str.length(); chop++) {
			String chopped = str.substring(0, chop);
			if (isPalin(chopped)) {
				String remaining = str.substring(chop);
				Partition(remaining, parts + "|" + chopped);
			}
		}
	}

	public static boolean isPalin(String chopped) {
		int start =0;
		int end = chopped.length()-1;
		while(start<end) {
			if(chopped.charAt(end)!=chopped.charAt(start)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}

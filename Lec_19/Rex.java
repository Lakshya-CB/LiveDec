package Lec_19;

import java.util.ArrayList;
import java.util.List;

public class Rex {
	static List<Integer> A = new ArrayList<>();
	static List<Integer> B = new ArrayList<>();
	static List<Integer> C = new ArrayList<>();

	public static void main(String[] args) {
//		List<List<String>> All_ans = new ArrayList<>();
//		Partition("abcd", "", new ArrayList<>(), All_ans);
//		System.out.println(All_ans);
//		TOH(4, 'A', 'C', 'B');
//		A.add(3);
//		A.add(2);
//		A.add(1);
//		TOH(3, A, C, B);
		MazePath(0, 0, 2, 2, "");
	}

	public static void Partition(String str, String ans, List<String> AL, List<List<String>> All_ans) {

		if (str.isEmpty()) {
//			System.out.println("String parts = "+ ans);
//			System.out.println(AL);
			All_ans.add(new ArrayList<>(AL));
		}
		for (int chop = 1; chop <= str.length(); chop++) {
			String chopped = str.substring(0, chop);
			if (isPalin(chopped)) {
				String remaining = str.substring(chop);

				AL.add(chopped); // Prep!!
				Partition(remaining, ans + "|" + chopped, AL, All_ans);
				AL.remove(AL.size() - 1);
			}
		}
	}

	public static boolean isPalin(String chopped) {
		int start = 0;
		int end = chopped.length() - 1;
		while (start < end) {
			if (chopped.charAt(end) != chopped.charAt(start)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static List<String> GG() {
		List<String> AL = new ArrayList<>();
		AL.add("PPPPPPPPPPPPP");

		return AL;
	}

	public static void TOH(int n, char src, char dest, char helper) {
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, helper, dest);
		System.out.println(n + "th disk from " + src + " to " + dest);
		TOH(n - 1, helper, dest, src);
	}

	public static void TOH(int n, List<Integer> src, List<Integer> dest, List<Integer> helper) {
		if (n == 0) {
			return;
		}
		TOH(n - 1, src, helper, dest);
//		Here i was shifting nth disk from src to dest.
		int LOL = src.remove(src.size() - 1);
		dest.add(LOL);
//		
//		System.out.println(n + "th disk from " + src + " to " + dest);
		System.out.println(A + "\t" + B + "\t" + C);
		TOH(n - 1, helper, dest, src);
	}

	public static void MazePath(int r, int c, int dr, int dc, String path) {
//		-ve BC
		if (r > dr || c > dc) {
			return;
		}

		// +ve B.C
		if (r == dr && c == dc) {
			System.out.println(path);
			return;
		}

		MazePath(r, c + 1, dr, dc, path + "R");
		MazePath(r + 1, c, dr, dc, path + "D");
		
	}
}
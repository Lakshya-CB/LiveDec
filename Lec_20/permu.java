package Lec_20;

public class permu {
	public static void main(String[] args) {
//		prem("abcd", "");
//		premSeats(new boolean[3], 2, "");
//		CombSeats(4, 2, "", 0);
//		Qcomb_wrt_box(0, 3, 2, "");
		Qcomb_wrt_box2D(0, 0, 2, 2, 2, "");
	}

// 		w.r.t user!!
	public static void prem(String str, String soln) {
		if (str.isEmpty()) {
			System.out.println(soln);

		}
		for (int i = 0; i < str.length(); i++) {
			String jadu = str.substring(0, i) + str.substring(i + 1);
			prem(jadu, soln + str.charAt(i));
		}
	}

	public static void premSeats(boolean[] seats, int toSelect, String ans) {
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < seats.length; i++) {
			if (!seats[i]) {
				seats[i] = true;
				premSeats(seats, toSelect - 1, ans + "b" + i);
				seats[i] = false;
			}
		}
	}

	public static void CombSeats(int totalSeats, int toSelect, String ans, int lastidx) {
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = lastidx; i < totalSeats; i++) {
			CombSeats(totalSeats, toSelect - 1, ans + "q" + i, i + 1);
		}
	}

//	w.r.t box
	public static void Qcomb_wrt_box(int curr, int totalSeats, int toSelect, String ans) {
		// +ve BC
		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}

		// -ve BC
		if (curr == totalSeats) {
			return;
		}

		Qcomb_wrt_box(curr + 1, totalSeats, toSelect - 1, ans + "q" + curr); // Bede
		Qcomb_wrt_box(curr + 1, totalSeats, toSelect, ans); // Na Bede

	}

	public static void Qcomb_wrt_box2D(int curr_r, int curr_c, int total_r, int total_c, int toSelect, String ans) {

		if (toSelect == 0) {
			System.out.println(ans);
			return;
		}
//		Moving to the next row logic!!
		if (curr_c == total_c) {
			curr_r++;
			curr_c = 0;
		}

//		-ve BC
		if (curr_r == total_r) {
			return;
		}
//	if(isSafe(board,r,c)) {
		Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect - 1, ans + "Q{" + curr_r + "," + curr_c + "}"); // Bede
//	}
		Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect, ans); // Na Bede

	}

}

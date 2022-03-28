package Lec_40;

import java.util.ArrayList;

public class LIS {
	public static void main(String[] args) {

	}

	public int lengthOfLIS(int idx, int prev_idx, int[] nums) {
		if (idx == nums.length) {
			return 0;
		}
		int sp1 = 0;
		if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
			sp1 = lengthOfLIS(idx + 1, idx, nums) + 1; // coose current!!
		}
		int sp2 = lengthOfLIS(idx + 1, prev_idx, nums); // dont choose!!

		return Math.max(sp1, sp2);
	}

	public int lengthOfLISTD(int idx, int prev_idx, int[] nums, int[][] dp) {
		if (idx == nums.length) {
			return 0;
		}
		if (dp[idx][prev_idx + 1] != 0) {
			return dp[idx][prev_idx + 1];
		}
		int sp1 = 0;
		if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
			sp1 = lengthOfLISTD(idx + 1, idx, nums, dp) + 1; // coose current!!
		}
		int sp2 = lengthOfLISTD(idx + 1, prev_idx, nums, dp); // dont choose!!

		dp[idx][prev_idx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public int lengthOfLISBU(int[] nums) {
		int[][] dp = new int[nums.length + 1][nums.length + 1];
		for (int prev_idx = nums.length - 1; prev_idx >= -1; prev_idx--) {
			for (int idx = nums.length - 1; idx >= 0; idx--) {
//				create dp[idx][prev_idx+1]!!!
				int sp1 = 0;
				if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
					sp1 = dp[idx + 1][idx + 1] + 1; // coose current!!
				}
				int sp2 = dp[idx + 1][prev_idx + 1]; // dont choose!!

				dp[idx][prev_idx + 1] = Math.max(sp1, sp2);

			}
		}
		return dp[0][-1 + 1];
	}

	public int lengthOfLISBUSE(int[] nums) {
		int[] next_row = new int[nums.length + 1];
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			int[] curr_row = new int[nums.length + 1];
			for (int prev_idx = nums.length - 1; prev_idx >= -1; prev_idx--) {
//				create dp[idx][prev_idx+1]!!!
				int sp1 = 0;
				if (prev_idx == -1 || nums[prev_idx] < nums[idx]) {
					sp1 = next_row[idx + 1] + 1; // coose current!!
				}
				int sp2 = next_row[prev_idx + 1]; // dont choose!!

				curr_row[prev_idx + 1] = Math.max(sp1, sp2);
			}
			next_row = curr_row;
		}
		return next_row[-1 + 1];
	}

	public int lengthOfLIS_nlogn(int[] nums) {
		ArrayList<Integer> AL = new ArrayList<>();
		for (int ali : nums) {
			if (AL.isEmpty()) {
				AL.add(ali);
			} else {
				if (ali > AL.get(AL.size() - 1)) {
					AL.add(ali);
				} else {
//				ali = 6
					int s = 0;
					int e = AL.size() - 1;
					int idx = AL.size() - 1;
					while (s <= e) {
						int mid = (s + e) / 2;
						if (AL.get(mid) >= ali) {
							idx = mid;
							e = mid - 1;
						} else {
							s = mid + 1;
						}
					}
					AL.set(idx, ali);
				}
			}
		}
		return AL.size();
	}
}

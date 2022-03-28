package Lec_40;

public class House_Robber {
	public static void main(String[] args) {

	}

	public int rob(int idx, int[] nums) {
		if (idx >= nums.length) {
			return 0;
		}
		int sp1 = rob(idx + 2, nums) + nums[idx]; // chori kar!!
		int sp2 = rob(idx + 1, nums); // chori na kar!!

		return Math.max(sp1, sp2);
	}

	public int rob(int idx, int[] nums, Integer[] dp) {
		if (idx >= nums.length) {
			return 0;
		}
		if (dp[idx] != null) {
			return dp[idx];
		}
		int sp1 = rob(idx + 2, nums, dp) + nums[idx]; // chori kar!!
		int sp2 = rob(idx + 1, nums, dp); // chori na kar!!
		dp[idx] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public int robBU(int[] nums) {
		int[] dp = new int[nums.length+2];
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			int sp1 = dp[idx + 2] + nums[idx]; // chori kar!!
			int sp2 = dp[idx + 1]; // chori na kar!!
			dp[idx] = Math.max(sp1, sp2);
		}

		return dp[0];
	}
	public int robBUSE(int[] nums) {

		
		int sp1 =0;
		int sp2 =0;
		
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			int curr = Math.max(sp2 + nums[idx], sp1);
			sp2 = sp1;
			sp1 = curr;
		}

		return sp1;
	}   
	public int rob2(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int case1= rob(nums, 1, nums.length-1);
        int case2= rob(nums, 0, nums.length-2);
        return Math.max(case1, case2);
    } 
    public int rob(int[] nums,int s, int e) {
		int sp1 =0;
		int sp2 =0;
		
		for (int idx = e; idx >= s; idx--) {
			int curr = Math.max(sp2 + nums[idx], sp1);
			sp2 = sp1;
			sp1 = curr;
		}
        return sp1;
	}
}

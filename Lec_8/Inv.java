package Lec_8;

public class Inv {
	public static void main(String[] args) {
		int[] arr= {2,4,3,1,0};
		disp(inv(arr));
	}

	public static int[] inv(int[] arr) {
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
//		for copy!!
//		ans[i] = arr[i];

			int ali = arr[i];
			int pos = i;
			ans[ali] = pos;
			ans[arr[i]] = i;
		}
		return ans;
	}

	public static void disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

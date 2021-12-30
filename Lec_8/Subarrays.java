package Lec_8;

public class Subarrays {
	public static void main(String[] args) {
		int[] arr = { 30, -99, 1, 25, 20, -30, -9, 4, 50 };
		loop3(arr);
		loop2(arr);
		kadance(arr);
		
	}
	public static void kadance(int[] arr) {
		int ans =0;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum<0) {
				sum=0;
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
		
	}
	public static void loop2(int[] arr) {
		int ans = 0;
		for (int s = 0; s < arr.length; s++) {
			int sum =0;
			for (int e = s; e < arr.length; e++) {

				sum = sum+ arr[e];
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
	}
	public static void loop3(int[] arr) {
		int ans = 0;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//			print from index s to e
//			disp(arr, s, e);
				int sum = sum(arr, s, e);
				ans = Math.max(ans, sum);
//			System.out.println("Above sum is  " + sum(arr, s, e));
//			System.out.println("=========");
			}
		}
		System.out.println(ans);
	}
	public static void disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void disp(int[] arr, int s, int e) {

		for (; s <= e; s++) {
			System.out.print(arr[s] + " ");
		}
		System.out.println();
	}
	public static int sum(int[] arr, int s, int e) {
		int sum = 0;
		for (; s <= e; s++) {
			sum=sum+arr[s];
		}
		return sum;
	}
}

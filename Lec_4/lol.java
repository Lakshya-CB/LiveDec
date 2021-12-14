package Lec_4;

import java.util.Scanner;

public class lol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			boolean isDecreasing = true;
			boolean isIncreasing = true;
			for (int j = 0; j < i; j++) {
				if (arr[j + 1] >= arr[j]) {
					isDecreasing = false;
					break;
				}
			}
			for (int j = i; j < n - 1; j++) {
				if (arr[j + 1] <= arr[j]) {
					isIncreasing = false;
				}
			}
			flag = isDecreasing && isIncreasing;
			if (flag) {
				break;
			}
		}
		System.out.println(flag);
	}
}

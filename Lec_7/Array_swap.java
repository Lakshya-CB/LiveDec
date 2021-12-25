package Lec_7;

public class Array_swap {
	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
//		swap(a1[0], a2[0]);
//		swap_nil(a1, a2, 3);
//		
//		
//		int[] c1 = a1;
//		System.out.println(c1);
//		System.out.println(a1);

		System.out.println(a1[0] +" " +a2[0]);
		swap_arr(a1, a2);
		System.out.println(a1[0] +" " +a2[0]);
	}

	public static void swap_arr(int[] a, int[] b) {
		int[] d = a;
		a = b;
		b = d;
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap_nil(int[] a, int[] b, int c) {
		int d = a[c];
		a[c] = b[c];
		b[c] = d;

	}

}

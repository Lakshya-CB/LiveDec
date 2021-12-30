package Lec_9;

public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 40, 50, 30, 20, 10 };
//		int[] arr = { 10, 12, 14, 14, 16, 18 };
//		insertion(arr);
//		bubble(arr);
		selection(arr);
	}

	public static void insertion(int[] arr) {
//		This logic assumes that the array till index last_idx-1 is sorted
//		Insert element last_idx in the sorted array!!
		for (int last_idx = 1; last_idx < arr.length; last_idx++) {
//		int last_idx = arr.length - 1;
			int num = arr[last_idx];
			int idx = last_idx - 1;
			while (idx != -1 && arr[idx] > num) {
//			Chepo aage!!
				arr[idx + 1] = arr[idx];
				disp(arr);
				idx--;
			}
			arr[idx + 1] = num;
			System.out.println("====");
			disp(arr);
			System.out.println("||||||||||||||");
		}
	}

	public static void selection(int[] arr) {
		int count = 0;

//		int last = arr.length-1;
		for (int last = arr.length - 1; last >= 1; last--) {
			int max = last;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max]) {
					max = i;
				}
			}
			disp(arr);

			if (last != max) {
//		swap max index with last index!!
				int temp = arr[max];
				arr[max] = arr[last];
				arr[last] = temp;
				count++;
			}
//			
			disp(arr);
			System.out.println("|||||||||||||||||||||");
		}
	}

	public static void bubble(int[] arr) {

		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i <= arr.length - 1 - count; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			disp(arr);
		}
	}

	public static void disp(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("==");
	}
}

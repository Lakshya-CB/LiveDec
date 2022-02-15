package Lec_26_QPS;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);

//		RevDisp(S);
//		System.out.println();
//		
//		System.out.println(S);
//		ActualRev(S);
//		System.out.println(S);
//		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
//		NexGr8IDx(arr);

		int[][] mat = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		CelebP(mat);
	}

	public static void RevDisp(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		RevDisp(S);
		System.out.print(ali + " ");
		S.add(ali);
	}

	public static void ActualRev(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		CopyS(S, Ex);
		while (!Ex.isEmpty()) {
			int alo = Ex.pop();
			S.add(alo);
		}

	}

	public static void CopyS(Stack<Integer> S, Stack<Integer> Extra) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		CopyS(S, Extra);
		Extra.add(ali);
	}

	public static void NexGr8(int[] arr) {
		Stack<Integer> S = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int ali = arr[i];
			while (!S.isEmpty() && S.peek() < ali) {
				System.out.println(S.pop() + " => " + ali);
			}
			S.push(ali);
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + " => " + -1);
		}
	}

	public static void NexGr8IDx(int[] arr) {
		Stack<Integer> S = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int ali = arr[i];
			while (!S.isEmpty() && arr[S.peek()] < ali) {
				int ans_idx = S.pop();
//				System.out.println(arr[ans_idx] + " => " + ali);
				ans[ans_idx] = ali;
			}
			S.push(i);
		}
		while (!S.isEmpty()) {
			int ans_idx = S.pop();
			System.out.println(arr[ans_idx] + " => " + -1);
			ans[ans_idx] = -1;
		}
		System.out.println(Arrays.toString(ans));
	}

	public static void CelebP(int[][] mat) {
		Stack<Integer> S = new Stack<>();
		for (int i = 0; i < mat.length; i++) {
			S.add(i);
		}
		while (S.size() > 1) {
			int A = S.pop();
			int B = S.pop();
			if (mat[A][B] == 1) {
//				A knows B!!
				S.push(B);
			} else {
				S.push(A);
			}
		}
		int Celeb = S.pop();
//		check it to make sure!!
		for (int i = 0; i < mat.length; i++) {
			if (mat[Celeb][i] == 1) {
				System.out.println("Koi celeb nahi hein");
				return;
			}
		}
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][Celeb] == 0 && i != Celeb) {
				System.out.println("Koi celeb nahi hein");
				return;
			}
		}
		System.out.println("Celeb hein mera bhai!! " + Celeb);

	}
}

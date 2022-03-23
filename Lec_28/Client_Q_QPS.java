package Lec_28;

import java.util.LinkedList;
import java.util.Queue;

public class Client_Q_QPS {
	public static void main(String[] args) {
//		Dynamic_Q Q = new Dynamic_Q();
//		Q.add(10);
//		Q.add(20);
//		Q.add(30);
//		Q.add(40);
//		Q.disp();
//		System.out.println(Q.poll());
//		Q.disp();
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);

//		RevDisp(Q, 0);
//		System.out.println();
//
//		System.out.println(Q);
		int[] arr= {-20,10,-5,4,6,-9,-80,60,50};
		
		firstNeg(arr, 3);
	}

	public static void RevDisp(Queue<Integer> Q, int c) {
		if (c == Q.size()) {
			return;
		}
		int temp = Q.poll();
		Q.add(temp);
		RevDisp(Q, c + 1);
		System.out.print(temp + " ");

	}

	public static void Rev(Queue<Integer> Q) {
		if (Q.isEmpty()) {
			return;
		}
		int temp = Q.poll();
		Rev(Q);
		Q.add(temp);
//		System.out.print(temp+ " ");
	}

	public static void firstNeg(int[] arr, int k) {
		Queue<Integer> win = new LinkedList<Integer>();
		for (int i = 0; i < k-1; i++) {
			if (arr[i] < 0) {
				win.add(i);
			}
		}
		for (int s = 0; s <= arr.length - k; s++) {
			int last_idx = s + k - 1;
			if(arr[last_idx]<0) {
				win.add(last_idx);
			}
			
			if(win.peek()==s-1) {
				win.poll();
			}
//			disp(arr, s,s+k-1);
			System.out.println(" => "+arr[win.peek()]);
		}

	}
	public static void disp(int[] arr, int s, int e) {
		for(int i=s;i<=e;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}

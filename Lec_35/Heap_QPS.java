package Lec_35;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//
//		int k = 3;
		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();
		AL.add(new ArrayList<Integer>());
		AL.get(0).add(10);
		AL.get(0).add(20);
		AL.get(0).add(30);

		AL.add(new ArrayList<Integer>());
		AL.get(1).add(15);
		AL.get(1).add(35);

		AL.add(new ArrayList<Integer>());
		AL.get(2).add(5);
		AL.get(2).add(7);
		AL.get(2).add(12);
		AL.get(2).add(25);

		AL.add(new ArrayList<Integer>());
		AL.get(3).add(17);
		AL.get(3).add(22);
		AL.get(3).add(40);

		System.out.println(AL);
		MergeKSorted(AL);
	}

	public static void Klargest(int k, int[] arr) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();

		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() == k + 1) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

	static class Pair implements Comparable<Pair> {
		int data;
		int arr_idx;
		int ele_idx;

		public Pair(int d, int ai, int ei) {
			// TODO Auto-generated constructor stub
			data = d;
			arr_idx = ai;
			ele_idx = ei;

		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data; // Integer Rank!!
//			return o.data - this.data; Marks!!

		}
	}

	public static void MergeKSorted(ArrayList<ArrayList<Integer>> AL) {
		PriorityQueue<Pair> PQ = new PriorityQueue<>();

		for (int i = 0; i < AL.size(); i++) {
			PQ.add(new Pair(AL.get(i).get(0), i, 0));
		}
		// klogk

		while (!PQ.isEmpty()) {
			Pair curr = PQ.poll();
			System.out.println(curr.data);
			if(curr.ele_idx+1==AL.get(curr.arr_idx).size()) {
				continue;
			}
			Pair pp = new Pair(AL.get(curr.arr_idx).get(curr.ele_idx + 1), curr.arr_idx, curr.ele_idx+1);
			PQ.add(pp);
		}
		//nlogk
	}
}

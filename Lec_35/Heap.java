package Lec_35;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> AL;

	public Heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int Size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public int peek() {
		return AL.get(0);
	}

	public void add(int aloo) {
		AL.add(aloo);
//		priority!! min heap!!
		Upheapify(AL.size() - 1);
	}

	private void Upheapify(int child) {
		int P = (child - 1) / 2;
		if (AL.get(P) > AL.get(child)) {
//			swap!!
			swap(child, P);
			Upheapify(P);
		}
	}

	private void swap(int i, int j) {
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public void Disp() {
		System.out.println(AL);
	}

	public int poll() {
		int temp = AL.get(0);
		int Last = AL.get(AL.size() - 1);

		AL.set(0, Last);
//		CBT ensure!!

		DownHeapify(0);
		return temp;
	}

	private void DownHeapify(int parent) {
		// TODO Auto-generated method stub
		int L = parent * 2 + 1;
		int R = parent * 2 + 2;

		int min_idx = parent;
		if (L < AL.size() && AL.get(min_idx) > AL.get(L)) {
			min_idx = L;
		}
		if (R < AL.size() && AL.get(min_idx) > AL.get(R)) {
			min_idx = R;
		}
		if (parent != min_idx) {
			swap(min_idx, parent);
			DownHeapify(min_idx);
		}
	}
}

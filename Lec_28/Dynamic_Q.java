package Lec_28;

import Lec_26.Queue;

public class Dynamic_Q extends Queue {
	@Override
	public void add(int ali) {
		if (isFull()) {
			int[] bhog = new int[this.arr.length * 2];
			int idx = 0;
			for (int i = s; i < s + arr.length; i++) {
				bhog[idx] = arr[i%arr.length];
				idx++;
			}
			arr = bhog;
			s = 0;
		}
		super.add(ali);
	}
}

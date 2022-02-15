package Lec_27;

import Lec_25.Stack;

public class Dynamic_Stack extends Stack{

	@Override
	public void push(int ali) {
		
		if(this.isFull()) {
			int[] big = new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				big[i] = arr[i];
			}
			this.arr = big;
		}
		super.push(ali);
	}
	
}

package Lec_25;

public class Stack {
	private int[] arr;
	private int tos=-1;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
	}

	public Stack(int cap) {
		arr = new int[cap];
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("Bhai kya?! STACK PHUUF hein!!");
		}
		arr[tos + 1] = ali;
		tos++;
	}
	public void push(int ali) {
		add(ali);
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("mat dekho cancer ho jayega aakhon ko");
		}
		return arr[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public boolean isFull() {
		return size()==arr.length;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bhai dimal khali hein ?! Stack ki tarah!");
		}
		int ans = arr[tos]; 
		tos--;
		return ans; 
	}
	public void Disp() {
		int idx = tos;
		while(idx>=0) {
			System.out.print(arr[idx]+" ");
			idx--;
		}
		System.out.println();
	}
}

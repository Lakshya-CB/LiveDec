package Lec_26;

public class Queue {
	private int[] arr;
	private int s = 0;
	private int size = 0;

	public Queue() {
		arr = new int[5];
	}

	public Queue(int cap) {
		arr = new int[cap];
	}

//	
	public void add(int ali) {
		if (isFull()) {
			throw new RuntimeException("Bhai sun , chor de ");
		}
		int idx = s + size;
		idx = idx % arr.length;
		arr[idx] = ali;
		size++;
	}

	public void Enqueue(int ali) {
		add(ali);
	}

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Kyha dheek rha hein?!");
		}
		return arr[s];
	}

	public int poll() {
		if(isEmpty()) {
			throw new RuntimeException("Kuch to chor de!! no money, broke!");
		}
		int ali = peek();
		s++;
		s = s % arr.length;
		size--;
		return ali;
	}

	public int Dequeue() {
		return poll();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return arr.length == size;
	}

	public void disp() {

		System.out.print("[ ");
		for (int i = s; i < s + size; i++) {
			System.out.print(arr[i % arr.length] + " ");
		}
		System.out.println("]");
	}
}

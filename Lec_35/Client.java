package Lec_35;

public class Client {
	public static void main(String[] args) {
		Heap PQ = new Heap();
		PQ.add(100);
		PQ.add(10);
		PQ.add(5);
		PQ.add(500);
		PQ.add(99);
		PQ.Disp();
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
	}
}

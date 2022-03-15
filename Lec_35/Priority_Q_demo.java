package Lec_35;

import java.util.PriorityQueue;

public class Priority_Q_demo {
	public static void main(String[] args) {
//		min heap!! Rank se!!
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		PQ.add(100);
		PQ.add(10);
		PQ.add(5);
		PQ.add(500);
		PQ.add(99);
		System.out.println(PQ );
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
	}
}

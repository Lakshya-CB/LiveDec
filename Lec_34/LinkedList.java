package Lec_34;

import java.util.Stack;

public class LinkedList <TTT> {
	class Node {
		TTT data;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(TTT ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}
	}

	private Node root;

	public void disp() {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int Size() {
		int count = 0;
		Node temp = root;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public TTT getFirst() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		return root.data;
	}

	public TTT getLast() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		Node temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public TTT getAt(int idx) {
		Node temp = root;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(TTT ali) {
		Node nn = new Node(ali);
		if (Size() == 0) {
			root = nn;
		} else {
//			go to the last Node!!
			Node temp = root;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = nn;
		}
	}

	public void addFirst(TTT ali) {
		Node nn = new Node(ali);
		nn.next = root;
		root = nn;
	}

	private Node getNodeAt(int idx) {
		Node temp = root;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addAt(int idx, TTT ali) {
		if (idx == 0) {
			addFirst(ali);
		} else if (idx == Size()) {
			addLast(ali);
		} else {
			Node nn = new Node(ali);

			Node prev = getNodeAt(idx - 1);

			Node After = prev.next;

			prev.next = nn;

			nn.next = After;
		}

	}

	public TTT removeFirst() {
		if (Size() == 0) {
			throw new RuntimeException("Kya chahta hien!!");
		}
		TTT ans = root.data;
		root = root.next;
		return ans;
	}

	public TTT removeLast() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		if (Size() == 1) {
			return removeFirst();
		}
		Node secondL = getNodeAt(Size() - 2);
		TTT ans = secondL.next.data;
		secondL.next = null;
		return ans;
	}

	public TTT removeAt(int idx) {
		if (idx == 0) {
			return removeFirst();
		} else if (idx == Size() - 1) {
			return removeLast();
		} else {
			Node prev = getNodeAt(idx - 1);
			Node curr = prev.next;
			Node after = curr.next;

			prev.next = after;

			return curr.data;
		}
	}

}

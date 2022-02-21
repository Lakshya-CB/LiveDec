package Lec_29_QPS;

import java.util.Stack;

public class LinkedList {
	class Node {
		int data;
		Node next;

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int ali) {
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

	public int getFirst() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		return root.data;
	}

	public int getLast() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		Node temp = root;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		Node temp = root;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(int ali) {
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

	public void addFirst(int ali) {
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

	public void addAt(int idx, int ali) {
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

	public int removeFirst() {
		if (Size() == 0) {
			throw new RuntimeException("Kya chahta hien!!");
		}
		int ans = root.data;
		root = root.next;
		return ans;
	}

	public int removeLast() {
		if (Size() == 0) {
			throw new RuntimeException("Kya deekh rha hien!!");
		}
		if (Size() == 1) {
			return removeFirst();
		}
		Node secondL = getNodeAt(Size() - 2);
		int ans = secondL.next.data;
		secondL.next = null;
		return ans;
	}

	public int removeAt(int idx) {
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

	public void Rev() {
		Node prev = root;
		Node curr = root.next;

		while (curr != null) {
			Node After = curr.next;
			System.out.println(curr.data);
			curr.next = prev;

			prev = curr;
			curr = After;
		}
		root.next = null;
		root = prev;
	}

	public void Rev2() {
		Node temp = root;// 10k!!
		Rev2(root);
		temp.next = null; // 10k!!
	}

	private void Rev2(Node prev) {
		if (prev.next == null) {
//			update root node
			root = prev;
			return;
		}

		Node curr = prev.next;
		Rev2(curr);
//		reversing the Curr node!!
		curr.next = prev;
	}

	public int mid() {
		Node slow = root;
		Node fast = root;
		while (fast != null && fast.next != null) {

			fast = fast.next.next;
			slow = slow.next;

		}
		return slow.data;
	}

	public int lastK(int k) {
//		create 2 cars, and move 1 car K nodes ahead!!
		Node Behind = root;
		Node Ahead = root;
		while (k > 0) {
			Ahead = Ahead.next;
			k--;
		}

		while (Ahead.next != null) {
			Behind = Behind.next;
			Ahead = Ahead.next;
		}
		return Behind.data;
	}

	public void RevK(int K) {
		Node S_n = null;
		Node E_n = null;

		Stack<Node> S = new Stack<Node>();
		Node temp = root;
		while (temp != null) {

			S.push(temp);
			Node After = temp.next;
			if (S.size() == K) {
//				ulti!!!
				while (!S.isEmpty()) {
					Node nn = S.pop();
//					System.out.print(nn.data + " ");
//					insert this node nn in the LinkedList _n
					if (S_n == null) {
						S_n = nn;
						E_n = nn;
					} else {
						E_n.next = nn;
						E_n = nn;
					}
				}
//				System.out.println();
			}
			temp = After;
		}
		while (!S.isEmpty()) {
			Node nn = S.pop();
//			System.out.print(nn.data + " ");
//			insert this node nn in the LinkedList _n
			if (S_n == null) {
				S_n = nn;
				E_n = nn;
			} else {
				E_n.next = nn;
				E_n = nn;
			}
		}
		E_n.next = null;
		root = S_n;
	}
}

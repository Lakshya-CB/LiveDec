package Lec_37;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import Lec_37.Graph.Dij_Pair;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

// Weighted Undirected!!
//hashMap<V1, HashMap<V2, Wt>> 
	Graph(int num_V) {
		map = new HashMap<>();
		for (int i = 1; i <= num_V; i++) {
			map.put(i, new HashMap<>());
		}
		System.out.println(map);
	}

	public void addEdge(int v1, int v2, int cost) {

		HashMap<Integer, Integer> V1_nbr = map.get(v1);
		V1_nbr.put(v2, cost);
		HashMap<Integer, Integer> V2_nbr = map.get(v2);
		V2_nbr.put(v1, cost);

	}

	public boolean isNbr(int V1, int V2) {
		return map.get(V1).containsKey(V2);
	}

	public void removeEdge(int v1, int v2) {
		HashMap<Integer, Integer> V1_nbr = map.get(v1);
		V1_nbr.remove(v2);
		HashMap<Integer, Integer> V2_nbr = map.get(v2);
		V2_nbr.remove(v1);
	}

	public int Total_Edges() {
		int ans = 0;
		for (int V : map.keySet()) {
			int num_nbr_V = map.get(V).size();
			ans = ans + num_nbr_V;
		}

		return ans / 2;
	}

	public boolean hasPath(int V1, int V2) {
		return hasPath(V1, V2, new HashSet<Integer>(), "");
	}

	private boolean hasPath(int V1, int V2, HashSet<Integer> Visited, String path) {
		if (V1 == V2) {
			System.out.println(path + " " + V2);
			return true;
		}
		Visited.add(V1);
		for (int nbr_v1 : map.get(V1).keySet()) {
			if (Visited.contains(nbr_v1)) {
				continue;
			}
			boolean sp = hasPath(nbr_v1, V2, Visited, path + " " + V1);
			if (sp) {
				return true;
			}
		}
		Visited.remove(V1);
		return false;
	}

	public void AllPath(int V1, int V2) {
		AllPath(V1, V2, new HashSet<Integer>(), "");
	}

// Depth First search!!
	private void AllPath(int V1, int V2, HashSet<Integer> Visited, String path) {
		if (V1 == V2) {
			System.out.println(path + " " + V2);
			return;
		}
		Visited.add(V1);
		for (int nbr_v1 : map.get(V1).keySet()) {
			if (Visited.contains(nbr_v1)) {
				continue;
			}
			AllPath(nbr_v1, V2, Visited, path + " " + V1);

		}
		Visited.remove(V1);
		return;
	}

//Breadth  First Seach se bata V1 se V2 ja sakta hein ?
	public boolean BFS(int V1, int V2) {
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(V1);
		HashSet<Integer> Visited = new HashSet<Integer>();
		while (!Q.isEmpty()) {
			int curr_N = Q.poll();
			if (curr_N == V2) {
				return true;
			}
			if (Visited.contains(curr_N)) {
				System.out.println("Cycle hein Daya!");
				continue;
			}

			Visited.add(curr_N);
			for (int nbr : map.get(curr_N).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);

				}
			}
		}
		return false;
	}

	public boolean DFS(int V1, int V2) {
		Stack<Integer> SS = new Stack<Integer>();
		SS.add(V1);
		HashSet<Integer> Visited = new HashSet<Integer>();
		while (!SS.isEmpty()) {
			int curr_N = SS.pop();
			if (curr_N == V2) {
				return true;
			}
			if (Visited.contains(curr_N)) {
				System.out.println("Cycle hein Daya!");
				continue;
			}

			Visited.add(curr_N);
			for (int nbr : map.get(curr_N).keySet()) {
				if (!Visited.contains(nbr)) {
					SS.add(nbr);

				}
			}
		}
		return false;
	}

	public void BFT() {
		HashSet<Integer> Visited = new HashSet<Integer>();
		for (int V1 : map.keySet()) {
			if (Visited.contains(V1)) {
				continue;
			}
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V1);
			while (!Q.isEmpty()) {
				int curr_N = Q.poll();

				if (Visited.contains(curr_N)) {
					System.out.println("Cycle hein Daya!");
					continue;
				}

				Visited.add(curr_N);
				for (int nbr : map.get(curr_N).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);

					}
				}
			}
		}
		return;
	}

	public int num_of_Comp() {
		int ans = 0;
		HashSet<Integer> Visited = new HashSet<Integer>();
		for (int V1 : map.keySet()) {
			if (Visited.contains(V1)) {
				continue;
			}
			ans++;
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V1);
			while (!Q.isEmpty()) {
				int curr_N = Q.poll();

				if (Visited.contains(curr_N)) {
//					System.out.println("Cycle hein Daya!");
					continue;
				}

				Visited.add(curr_N);
				for (int nbr : map.get(curr_N).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);

					}
				}
			}
		}
		return ans;
	}

	public boolean isCyclic() {
		int ans = 0;
		HashSet<Integer> Visited = new HashSet<Integer>();
		for (int V1 : map.keySet()) {
			if (Visited.contains(V1)) {
				continue;
			}
			ans++;
			Queue<Integer> Q = new LinkedList<Integer>();
			Q.add(V1);
			while (!Q.isEmpty()) {
				int curr_N = Q.poll();

				if (Visited.contains(curr_N)) {
					return true;
				}

				Visited.add(curr_N);
				for (int nbr : map.get(curr_N).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);

					}
				}
			}
		}
		return false;
	}

	public boolean isTree() {
		return !isCyclic() && num_of_Comp() == 1;
	}

	class Dij_Pair implements Comparable<Dij_Pair> {
		int V;
		int total_cost;

		public Dij_Pair(int vv, int c) {
			// TODO Auto-generated constructor stub
			V = vv;
			total_cost = c;
		}
		public String toString() {
			return V + " => "+total_cost;
		}
		@Override
		public int compareTo(Dij_Pair o) {
			// TODO Auto-generated method stub
			return this.total_cost-o.total_cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<Dij_Pair> PQ = new PriorityQueue<>();
		PQ.add(new Dij_Pair(src, 0));
		HashSet<Integer> Visited = new HashSet<>();
		while (!PQ.isEmpty()) {
			Dij_Pair curr = PQ.poll();
			if (Visited.contains(curr.V)) {
				continue;
			}
			System.out.println(curr); 
			
			Visited.add(curr.V);
			for (int nbr : map.get(curr.V).keySet()) {
				if (!Visited.contains(nbr)) {
					int E = map.get(curr.V).get(nbr);
					Dij_Pair nn = new Dij_Pair(nbr, curr.total_cost + E);
					PQ.add(nn);
				}

			}

		}
	}
}

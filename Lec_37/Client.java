package Lec_37;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 4, 6);
		G.addEdge(1, 2, 12);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 4, 3);
		G.addEdge(5, 4, 8);
		G.addEdge(5, 6, 9);
		G.addEdge(6, 7, 1);
		G.addEdge(5, 7, 14);
		System.out.println(G.map);
		
//		System.out.println(G.Total_Edges());
//		System.out.println(G.hasPath(1, 7));
//		G.AllPath(1, 7);
		System.out.println(G.isCyclic());
		System.out.println(G.num_of_Comp());
		G.Dijkstra(1);
		
	}
}

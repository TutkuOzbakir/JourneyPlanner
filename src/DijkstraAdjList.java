import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkstraAdjList implements DijkstraInterface{

	private int dist[];
	private Set<Integer> settled;
	private PriorityQueue<Vertex> pq;
	private int V;
	private ArrayList<ArrayList<Vertex>> adj;

	public DijkstraAdjList(int V) {

		this.V = V;
		dist = new int[V];
		settled = new HashSet<Integer>();
		pq = new PriorityQueue<Vertex>();
	}

	public void dijkstra(String name, int id) {

		Vertex vertex1 = new Vertex(name, id);

		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

		pq.add(vertex1);
		dist[id] = 0;

		while (settled.size() != V) {

			// remove the minimum distance node
			// from the priority queue
			pq.remove(vertex1);
			int u = vertex1.getId();

			// adding the node whose distance is
			// finalized
			settled.add(u);

			e_Neighbours(u);
		}
	}

	public void e_Neighbours(int u) {
		int edgeDistance = -1;
		int newDistance = -1;

		// All the neighbors of v
		for (int i = 0; i < adj.get(u).size(); i++) {
			Vertex vertex = adj.get(u).get(i);

			// If current node hasn't already been processed
			if (!settled.contains(vertex.getId())) {
				edgeDistance = vertex.getId();
				newDistance = dist[u] + edgeDistance;

				// If new distance is cheaper in cost
				if (newDistance < dist[vertex.getId()])
					dist[vertex.getId()] = newDistance;

				Vertex vertex1 = new Vertex(vertex.getId(), dist[vertex.getId()]);
				pq.add(vertex1);
			}
		}

	}
}

import java.util.LinkedList;

public interface Graph {

	int size();
	void addVertex(String name, int id, LinkedList<Edge> edge);
	void addVertex(Vertex vertex1);
	void deleteVertex(String name, int id, LinkedList<Edge> edge);
	void deleteVertex(Vertex vertex1);
	void addEdge(String start, int id1, String stop, int id2, int weight);
	void addEdge(Vertex vertex1, Vertex vertex2, int weight);
	void deleteEdge(Vertex vertex1, Vertex vertex2, int weight);
	void deleteEdge(String start, int id1, String stop, int id2, int weight);
	boolean isNeighbor(String name1, int id1, String name2, int id2);
	void printGraph(GraphAdjList g);
}

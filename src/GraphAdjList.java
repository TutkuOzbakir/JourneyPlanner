import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class GraphAdjList implements Graph{

	private int vertex_number;
	ArrayList<Vertex> vertex_list;

	public GraphAdjList(int vertex_number) {

		this.vertex_number = vertex_number;
		vertex_list = new ArrayList<Vertex>();
	}

	public int size() {
		return vertex_number;
	}

	public void addVertex(String name, int id, LinkedList<Edge> edge) {

		Vertex vertex1 = new Vertex(name, id);
		vertex1.setList(edge);

		// checks vertex's existence
		if (vertex_list.contains(vertex1)) {

			System.out.println("Vertex already exists.");

		} else {

			vertex_list.add(vertex1);

		}

	}

	public void addVertex(Vertex vertex1) {

		// checks vertex's existence
		if (vertex_list.contains(vertex1)) {

			System.out.println("Vertex already exists.");

		} else {

			vertex_list.add(vertex1);

		}

	}

	public void deleteVertex(String name, int id, LinkedList<Edge> edge) {

		Vertex vertex1 = new Vertex(name, id);
		vertex1.setList(edge);

		// checks vertex's existence
		if (vertex_list.contains(vertex1)) {

			System.out.println("Vertex already exists.");

		} else {

			vertex_list.remove(vertex1);

		}
	}

	public void deleteVertex(Vertex vertex1) {

		// checks vertex's existence
		if (vertex_list.contains(vertex1)) {

			System.out.println("Vertex already exists.");

		} else {

			vertex_list.remove(vertex1);

		}
	}

	public void addEdge(String start, int id1, String stop, int id2, int weight) {

		Vertex vertex1 = new Vertex(start, id1);
		Vertex vertex2 = new Vertex(stop, id2);
		Edge edge = new Edge(vertex1, vertex2, weight);

		// checks edge's existence
		if (!vertex1.getList().contains(edge) && vertex2.getList().contains(edge)) {
			vertex1.getList().add(edge);
		} else if (vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex2.getList().add(edge);
		} else if (!vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex1.getList().add(edge);
			vertex2.getList().add(edge);
		} else {
			System.out.println("Edge already exists.");
		}
	}

	public void addEdge(Vertex vertex1, Vertex vertex2, int weight) {

		Edge edge = new Edge(vertex1, vertex2, weight);

		// checks edge's existence
		if (!vertex1.getList().contains(edge) && vertex2.getList().contains(edge)) {
			vertex1.getList().add(edge);
		} else if (vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex2.getList().add(edge);
		} else if (!vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex1.getList().add(edge);
			vertex2.getList().add(edge);
		} else {
			System.out.println("Edge already exists.");
		}
	}

	public void deleteEdge(Vertex vertex1, Vertex vertex2, int weight) {

		Edge edge = new Edge(vertex1, vertex2, weight);

		// checks edge's existence
		if (!vertex1.getList().contains(edge) && vertex2.getList().contains(edge)) {
			vertex2.getList().remove(edge);
		} else if (vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex1.getList().remove(edge);
		} else if (!vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			System.out.println("Edge could not found.");
		} else {
			vertex1.getList().remove(edge);
			vertex2.getList().remove(edge);
		}
	}

	public void deleteEdge(String start, int id1, String stop, int id2, int weight) {

		Vertex vertex1 = new Vertex(start, id1);
		Vertex vertex2 = new Vertex(stop, id2);
		Edge edge = new Edge(vertex1, vertex2, weight);

		// checks edge's existence
		if (!vertex1.getList().contains(edge) && vertex2.getList().contains(edge)) {
			vertex2.getList().remove(edge);
		} else if (vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			vertex1.getList().remove(edge);
		} else if (!vertex1.getList().contains(edge) && !vertex2.getList().contains(edge)) {
			System.out.println("Edge could not found.");
		} else {
			vertex1.getList().remove(edge);
			vertex2.getList().remove(edge);
		}
	}

	public boolean isNeighbor(String name1, int id1, String name2, int id2) {

		Vertex vertex1 = new Vertex(name1, id1);
		Vertex vertex2 = new Vertex(name2, id2);
		ListIterator<Edge> iterator1 = vertex1.getList().listIterator();
		ListIterator<Edge> iterator2 = vertex2.getList().listIterator();
		boolean flag = false;

		while (iterator1.hasNext()) {

			while (iterator2.hasNext()) {

				if (iterator1.equals(iterator2)) {

					flag = true;
					break;
				}

				else {

					iterator2.next();
				}
			}

			iterator1.next();
			// Resets iterator2.
			iterator2 = vertex2.getList().listIterator();
		}

		return flag;
	}

	public void printGraph(GraphAdjList g) {

		System.out.println(g.vertex_list);

	}

	public int getVertex_number() {
		return vertex_number;
	}

	public void setVertex_number(int vertex_number) {
		this.vertex_number = vertex_number;
	}

	public ArrayList<Vertex> getVertex_list() {
		return vertex_list;
	}

	public void setVertex_list(ArrayList<Vertex> vertex_list) {
		this.vertex_list = vertex_list;
	}

}

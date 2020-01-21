import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {

		GraphAdjList q = new GraphAdjList(9);

		LinkedList<Edge> edge = new LinkedList<Edge>();
		Vertex a = new Vertex("Týnaztepe", 12084);
		Vertex b = new Vertex("BEGOS", 12856);
		Vertex x = new Vertex("Belediye Sarayý", 12154);
		Vertex y = new Vertex("Þirinyer Aktarma", 16728);

		Edge d = new Edge(x, y, 222);

		edge.add(d);

		a.setList(edge);

		q.addVertex(a);

		q.printGraph(q);

	}
}

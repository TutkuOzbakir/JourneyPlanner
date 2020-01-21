
public class Edge {

	private Vertex origin;
	private Vertex destination;
	private int weight;

	public Edge(Vertex origin, Vertex destination, int weight) {

		this.origin = origin;
		this.destination = destination;
		this.weight = weight;
	}

	public Edge(Vertex origin, Vertex destination) {

		this.origin = origin;
		this.destination = destination;

	}

	public Edge(String name1, String name2, int id1, int id2, int weight) {
		Vertex vertex1 = new Vertex(name1, id1);
		Vertex vertex2 = new Vertex(name2, id2);
		origin = vertex1;
		destination = vertex2;
		this.weight = weight;
	}

	public Vertex getOrigin() {
		return origin;
	}

	public void setOrigin(Vertex origin) {
		this.origin = origin;
	}

	public Vertex getDestination() {
		return destination;
	}

	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [origin=" + origin + ", destination=" + destination + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}

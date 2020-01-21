import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {

	private LinkedList<Edge> list;
	private String name;
	private int id;
	private boolean visited;

	public LinkedList<Edge> getList() {
		return list;
	}

	public void setList(LinkedList<Edge> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (visited ? 1231 : 1237);
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
		Vertex other = (Vertex) obj;
		if (id != other.id)
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (visited != other.visited)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertex [list=" + list + ", name=" + name + ", id=" + id + ", visited=" + visited + "] \n";
	}

	public Vertex(LinkedList<Edge> list, String name, int id, boolean visited) {

		this.list = list;
		this.name = name;
		this.id = id;
		this.visited = visited;
	}

	public Vertex(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public Vertex(int id2, int i) {
		this.id = id2;

	}
}

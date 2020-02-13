
import java.util.ArrayList;
import java.util.List;

public class Graph {
	private int v;
	private List<Integer> adj[];
	private int e;

	public Graph(int v) {
		this.v = v;
		adj = new List[v];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	public void printGraph() {
		for (int i = 0; i < adj.length; i++) {
			System.out.print(i + ": ");
			List<Integer> list = adj[i];
			for (Integer item : list) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

	}

	public int getVertices() {
		return v;
	}

	public List<Integer> getAdj(Integer v) {
		return adj[v];
	}
}
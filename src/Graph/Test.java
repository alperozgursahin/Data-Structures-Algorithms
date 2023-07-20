package Graph;

public class Test {

	public static void main(String[] args) {
		MyGraph graph = new MyGraph();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");

		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "D");
		graph.addEdge("D", "C");
		graph.addEdge("D", "B");
		graph.printGraph();

		graph.removeVertex("D");
		graph.printGraph();
	}

}

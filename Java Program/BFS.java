import java.util.*;
public class BFS {
	private final List<List<Integer>> adjList;
	public BFS(int vertices) {
		adjList=new ArrayList<>();
		for(int i = 0 ;i < vertices ; i++) {
			adjList.add(new ArrayList<>());
		}
	}
	public void addEdge(int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	public void BFS(int start) {
		boolean[] visited=new boolean[adjList.size()];
		LinkedList < Integer > Queue=new LinkedList<>();
		visited[start]=true;
		Queue.add(start);
		while(!Queue.isEmpty()) {
			int node=Queue.poll();
			System.out.print(node +" ");
			for(int neighbour:adjList.get(node)) {
				if(!visited[neighbour]) {
					visited[neighbour]=true;
					Queue.add(neighbour);
				}
			}
		}
	}
	public static void main(String[] args) {
		BFS graph=new BFS(5);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(2,4);
		System.out.println("BFS starting from node 0:");
		graph.BFS(0);
	}
}		
	






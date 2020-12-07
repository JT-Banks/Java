import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Route {

	int time[];
	private Set<Integer> settled;
	private PriorityQueue<Node> pq;
	private int V; //Number of vertices 
	public int parent[];
	List<List<Node>> adj;

	public Route(int V) {
		this.V = V;
		time = new int[V];
		settled = new HashSet<Integer>();
		pq = new PriorityQueue<Node>(V, new Node()); 
		parent = new int[V];     
	}
	//Function for Dijkstra's Algorithm 
	public void modDijkstra(List<List<Node>> adj, int src, int dest) {
		this.adj = adj;

		for (int i = 0; i < V; i++) {
			time[i] = Integer.MAX_VALUE;
			parent[i] = i;
		}

		//Add source node to the priority queue 
		pq.add(new Node(src, 0, 0));

		//Distance to the source is 0 
		time[src] = 0;
		parent[src] = src;
		while (pq.size() != 0) {

			Node n = pq.poll();
			int u = n.node;
			if(u==dest){
				break;
			}
			if(settled.contains(u)){
				continue;
			}
			settled.add(u);
			e_Neighbors(u, dest);
		}
	}
	//Function to process all the neighbors 
	//of the passed node 
	private void e_Neighbors(int u, int dest) {
		int edgeDistance = -1;
		int newDistance = -1;

		//All the neighbors of v 
		for (int i = 0; i < adj.get(u).size(); i++) {
			Node v = adj.get(u).get(i);

			//testing
			//System.out.println(v.node);

			//If current node hasn't already been processed 
			if (!settled.contains(v.node) && v.departureTime >= time[u]) {
				//If new distance is cheaper in cost 
				if (v.arrivalTime < time[v.node]) {
					time[v.node] = v.arrivalTime;
					parent[v.node] = u;
					pq.add(new Node(v.node, time[v.node], v.departureTime));

				}
				//Add the current node to the queue        
			}
		}
	}
	
	public static void main(String arg[]) throws FileNotFoundException {

		File airportsFile = new File("airports.txt");
		File flightsFile = new File("flights.txt");

		Scanner airportsReader = new Scanner(airportsFile);
		Scanner flightsReader = new Scanner(flightsFile);

		int V = Integer.parseInt(airportsReader.nextLine());

		//Adjacency list representation of the 
		//connected edges 
		List<List<Node>> adj = new ArrayList<List<Node>>();
		Map<String, Integer> map = new HashMap();
		Map<Integer, String> map2 = new HashMap();

		//Initialize list for every node 
		for (int i = 0; i < V; i++) {
			String airport = airportsReader.nextLine();
			List<Node> item = new ArrayList<Node>();
			adj.add(item);
			map.put(airport, i);
			map2.put(i, airport);
		}

		int E = Integer.parseInt(flightsReader.nextLine());
		flightsReader.nextLine();   // skipping header line

		for (int i = 0; i < E; i++) {
			String airline = flightsReader.next();
			int flightNumber = Integer.parseInt(flightsReader.next());
			String origin = flightsReader.next();
			String destination = flightsReader.next();
			int departure = Integer.parseInt(flightsReader.next());
			int arrival = Integer.parseInt(flightsReader.next());
			int distance = Integer.parseInt(flightsReader.next());
			int sourceIndex = map.get(origin);
			int targetIndex = map.get(destination);
			adj.get(sourceIndex).add(new Node(targetIndex, arrival, departure));
		}

		int source = map.get(arg[0]);
		int destination = map.get(arg[1]);

		//Calculate the single source shortest path 
		Route dpq = new Route(V);
		dpq.modDijkstra(adj, source, destination);

		//Print the shortest path to all the nodes 
		//from the source node 
		if(source!=destination && dpq.parent[destination] == destination){
			System.out.println("No path!");        
		}
		else {
			ArrayList<Integer>index = new ArrayList<>();
			int cur = destination;
			while(dpq.parent[cur]!=cur){
				index.add(cur);
				cur = dpq.parent[cur];
			}
			index.add(cur);
			for(int i=index.size()-1;i>=0;i--){
				System.out.print(map2.get(index.get(i))+"-");
			}
			System.out.println(dpq.time[destination]);
		}
	}
}

class Node implements Comparator<Node> {

	public int node;
	public int arrivalTime;
	public int departureTime;

	public Node() {
	}

	public Node(int node, int arrivalTime, int departureTime) {
		this.node = node;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	@Override
	public int compare(Node node1, Node node2) {
		if (node1.arrivalTime < node2.arrivalTime) {
			return -1;
		}
		if (node1.arrivalTime > node2.arrivalTime) {
			return 1;
		}
		return 0;
	}
}

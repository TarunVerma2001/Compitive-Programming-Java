package Graphs;

import java.util.*;



public class Graph {

	private static LinkedList<Integer> adj[];
	
	public Graph(int v) {   // Constructer for defining the no. of elements in the linked list array
		adj = new LinkedList[v];
		for(int i =0;i<v;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
//	Implementing the BFS
	
	public static int bfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination)
				break;
			
			for(int neighbour: adj[cur]) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = cur;
					
				}
			}
		}
		
		int cur = destination;
		int distance = 0;
		while(parent[cur] != -1) {
			System.out.print(cur + " -> ");
			cur = parent[cur];
			distance++;
		}
		System.out.println(source);
		return distance;
		
	}
//	Implementation of DFS by Recursion
	
	private static boolean dfsUtil(int source, int destination, boolean vis[]) {
		
		if(source == destination)
			return true;
		for(int neighbour: adj[source]) {
			if(!vis[neighbour]) {
				vis[neighbour] = true;
				boolean isConnected = dfsUtil(neighbour, destination, vis);
				if(isConnected)
					return true;
			}
		}
		
		return false;
	}
	
	
	public static boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		
		return dfsUtil(source, destination, vis);
	}
//	Implementation of DFS by Stack
	public static boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			if(cur == destination) {
				return true;
			}
			for(int neighbour: adj[cur]) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the no. of vertices and edges of the graph respectively");
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph graph= new Graph(v);
		
		System.out.println("Enter " + e + " edges");
		for(int i =0;i<e;i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			graph.addEdge(source, destination);
			
		}
//		Here Graph Implimentation Completes
		
		System.out.println("enter the Source and Destination");
		int source = sc.nextInt();
		int destination = sc.nextInt();
//		int Distance = bfs(source, destination);
//		System.out.println("Shortest Path = " + Distance);
	
//		System.out.println("possible : " + graph.dfs(source, destination));
	
		System.out.println("possible : " + graph.dfsStack(source, destination));
	}

}

package com.rbr.datastr.graph;

import java.awt.PrintGraphics;
//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
class Graph
{

	private int V;

	private LinkedList<Integer> adj[];

	public Graph(int v) {

		adj = new LinkedList[v];
		V = v;
		for(int i=0; i<v; i++){
			adj[i] = new LinkedList<Integer>();
		}

	}
	
	void addEdge(Graph graph, int src, int dest){
		
		graph.adj[src].addFirst(dest);
		graph.adj[dest].addFirst(src);
		
	}

	void printGraph(Graph graph){
		System.out.println("Graph : "+graph.V);
		for(int v= 0; v<graph.V; v++){
			
			for(Integer i : adj[v]){
				
				System.out.print(i);
				System.out.println("--->");
				
			}
			
		}
		
	}
	
	void BFS(int source){
		
		int[] visited = new int[V];
		LinkedList<Integer> queue = new LinkedList<>();
		visited[source]=1;
		queue.add(source);
		
		while(queue.size() != 0){
			
			source = queue.poll();
			System.out.println(source+ " ");
			
			Iterator<Integer> itr = adj[source].iterator();
			while(itr.hasNext()){
				
				int ver = itr.next();
				
				if(visited[ver]==0){
					
					visited[ver] = 1;
					queue.add(ver);
					
				}
				
			}
			
		}
		
		
		
		
	}
	
	void DFSUtil(int source, int[] visited){
		
		visited[source] = 1;
		System.out.println(" "+source );
		
		Iterator<Integer> itr = adj[source].iterator();
		while(itr.hasNext()){
			
			int ver = itr.next();
			if(visited[ver]==0){
				DFSUtil(ver,visited);
			}
			
		}
		
	}
	
	void DFS(int v){
		
		int visited[] = new int[V];
		DFSUtil(v, visited);
		
	}
	
	public static void main(String[] args) {

		Graph graph = new Graph(5);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 4);
		
		//graph.printGraph(graph);
		
		graph.BFS(0);
		System.out.println("DFS :::: ");
		graph.DFS(0);

	}



}

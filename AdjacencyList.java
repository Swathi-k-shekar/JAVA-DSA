package com.company;
import java.util.*;
class AdjacencyList{
     static class Edge{
             int src;
             int dest;
         public Edge(int s,int d)
         {
                 this.src=s;
                 this.dest=d;
         }
     }

     public static void createGraph(ArrayList<Edge> graph[]){
             for (int i = 0; i < graph.length; i++) {
                 graph[i] = new ArrayList<Edge>();
             }
         // source and destination eg..=0-->2 Extra will be weight
         graph[0].add(new Edge(0,2));

         graph[0].add(new Edge(0,2));

         graph[1].add(new Edge(1,2));
         graph[1].add(new Edge(1,3));

         graph[2].add(new Edge(2,0));
         graph[2].add(new Edge(2,3));
         graph[2].add(new Edge(2,1));

         graph[3].add(new Edge(3,2));
         graph[3].add(new Edge(3,1));

     }
     public static void nighbour(ArrayList<Edge> graph[],int n){
         for (int i = 0; i < graph[n].size(); i++) {
             Edge e=graph[n].get(i);
             System.out.println(e.dest);
         }
     }
    public static void main(String[] args)  {
         Scanner sc= new Scanner(System.in);
    int v=4;
    ArrayList<Edge> graph[]=new ArrayList[v];
//    Edge e= new Edge(0,2);
    createGraph( graph);
    System.out.println("Enter source that u need the neighbours");
    int n=sc.nextInt();
    nighbour(graph,n);

}
}

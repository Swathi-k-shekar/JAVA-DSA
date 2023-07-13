package com.company;

import java.util.ArrayList;

public class weightedGraph {
    static class Edge{
        int src;
        int des;
        int weigh;
       public Edge(int s,int d, int w){
            this.src=s;
            this.des=d;
            this.weigh=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2,6));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,0,8));

        graph[2].add(new Edge(2,4,2));
        graph[2].add(new Edge(2,0,5));

        graph[3].add(new Edge(3,5,9));
        graph[3].add(new Edge(3,4,12));
        graph[3].add(new Edge(3,1,16));


        graph[4].add(new Edge(4,3,3));
        graph[4].add(new Edge(4,5,4));
        graph[4].add(new Edge(4,2,5));

        graph[5].add(new Edge(5,3,7));
        graph[5].add(new Edge(5,4,8));
        graph[5].add(new Edge(5,6,9));


    }
    public static void nighbhour(ArrayList<Edge> graph[], int n){
        System.out.println("src"+"---->" +"des" + "---->"+"weigh");
        for (int i = 0; i < graph[n].size(); i++) {
            Edge e=graph[n].get(i);
            System.out.println(e.src+"---->"+ e.des + "---->"+e.weigh);
        }
    }
    public static void main(String[] args){
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        int n=3;
        nighbhour(graph,n);
    }
}

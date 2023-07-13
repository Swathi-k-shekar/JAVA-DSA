package com.company;

import java.util.*;

public class bfs {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }
         public static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[0].add(new Edge(0, 2));

            graph[1].add(new Edge(1, 3));
            graph[1].add(new Edge(1, 0));

            graph[2].add(new Edge(2, 4));
            graph[2].add(new Edge(2, 0));

            graph[3].add(new Edge(3, 5));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 1));


            graph[4].add(new Edge(4, 3));
            graph[4].add(new Edge(4, 5));
            graph[4].add(new Edge(4, 2));

            graph[5].add(new Edge(5, 3));
            graph[5].add(new Edge(5, 4));
            graph[5].add(new Edge(5, 6));

        }

        public static void bfs(ArrayList<Edge> graph[], int s, int v) {
            Queue<Integer> q = new LinkedList<>();
            boolean vis[] = new boolean[v];
            q.add(s);

            while (!q.isEmpty()) {
                int curr = q.remove();
                if (vis[curr] == false) {
                    System.out.println(curr + " ");
                    vis[curr] = true;

                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
        }

        public static void main(String[] args) {
            int v = 7;
            ArrayList<Edge> graph[] = new ArrayList[v];
            createGraph(graph);
            bfs(graph, 2, v);
        }

}

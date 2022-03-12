package graphs;

//Depth for search 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class DFS {
    int V;
    ArrayList<Integer>[] adj;

    GraphSearch(int noOfvertex) {
        V = noOfvertex;
        adj = new ArrayList[noOfvertex];
        for (int i = 0; i < noOfvertex; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    void edge(int x, int y) {
        adj[x].add(y);
    }

    void depthFirstSearch(int sourcevertex) {
        boolean[] visited = new boolean[V];
        Stack<Integer> s1 = new Stack<>();
        s1.push(sourcevertex);
        int node;
        while (!s1.empty()) {
            sourcevertex = s1.peek();
            s1.pop();

            for (int i = 0; i < adj[sourcevertex].size(); i++) {
                node = adj[sourcevertex].get(i);
                if (!visited[node]) {
                    s1.push(node);
                }
            }
            if (visited[sourcevertex] == false) {
                System.out.print(sourcevertex + " ");
                visited[sourcevertex] = true;
            }
        }
    }







    public static void main(String[] args) {
     GraphSearch g1 = new GraphSearch(6);

        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(0,5);
        g1.edge(1,0);
        g1.edge(2,2);
        g1.edge(2,1);
        g1.edge(2,0);
        g1.edge(2,3);
        g1.edge(3,4);
        g1.edge(4,2);
        g1.edge(4,2);
        g1.edge(5,5);
        g1.edge(5,0);
        g1.edge(5,4);
        System.out.println("result of depth for search");
        g1.depthFirstSearch(0);







    }
}

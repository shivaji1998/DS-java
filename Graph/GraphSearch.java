

package graphs;

import java.util.ArrayList;
import java.util.Iterator;

public class GraphSearch {
    int v;
    ArrayList<Integer> adj[];
    GraphSearch(int noOfvertex) {
        v=noOfvertex;
        adj = new ArrayList[noOfvertex];
        for (int i=0; i<noOfvertex;i++) {
            adj[i] = new ArrayList<>();
        }
    }
    void edge(int x,int y) {
        adj[x].add(y);
    }
    void breathFirstSearch(int sourcevertex) {
        boolean[] visited = new boolean[v];
        ArrayList<Integer> a1= new ArrayList<Integer>();
        visited[sourcevertex]=true;
        a1.add(sourcevertex);
        while (!a1.isEmpty()) {
            sourcevertex = a1.remove(0);
            System.out.print (sourcevertex + " ");
            Iterator i = (Iterator) adj[sourcevertex].iterator();
            while (i.hasNext()) {
                int n= (int) i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        a1.add(n);
                    }

            }
        }

    }
    public static void main(String[] args) {


        GraphSearch g1 = new GraphSearch(6);
        g1.edge(0,1);
        g1.edge(0,2);
        g1.edge(0,5);
        g1.edge(1,0);
        g1.edge(2,0);
        g1.edge(2,1);
        g1.edge(2,3);
        g1.edge(2,4);
        g1.edge(3,2);
        g1.edge(4,2);
        g1.edge(4,5);
        g1.edge(5,4);
        g1.breathFirstSearch(0);





    }
}

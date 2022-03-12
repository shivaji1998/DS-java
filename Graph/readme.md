# Graphs

## **Introduction**

- Graph is a data structure, which is a derived concept from Mathematics.

- Graph is a collection of vertices and edges. Vertices represents data and edges represents relationship between the vertices.

- There are different types of Graph, having different uses in computer science.

## Undirected graphs

Undirected graphs have edges that do not have a direction. The edges indicate a two-way relationship, in that each edge can be traversed in both directions. This figure shows a simple undirected graph with three nodes and three edges.

![image](https://user-images.githubusercontent.com/96246929/158007668-57ca1a82-f32f-4832-bd6b-eb469b422d53.png)

## Directed graphs

Directed graphs have edges with direction. The edges indicate a one-way relationship, in that each edge can only be traversed in a single direction. This figure shows a simple directed graph with three nodes and two edges.

![image](https://user-images.githubusercontent.com/96246929/158007699-a3af8be5-3d35-4597-ac49-57699ad8f9a8.png)

## Adjacency matrix or Adjacency List

**Adjacency Matrix** is a 2D array of size V x V where V is the number of vertices in a graph. Let the 2D array be adj[][], a slot adj[i][j] = 1 indicates that there is an edge from vertex i to vertex j. Adjacency matrix for undirected graph is always symmetric. Adjacency Matrix is also used to represent weighted graphs. If adj[i][j] = w, then there is an edge from vertex i to vertex j with weight w.





package myProject.DT.practices.tree_practice;

import java.util.*;

public class GFG {

    // function to print the parent of each node
    public static void printParents (int node, Vector<Vector<Integer>> adj, int parent) {
        // current node is root, thus has no parent
        if (parent == 0) {
            System.out.println(node + "->Root");
        } else {
            System.out.println(node + "->" + parent);
        }

        // Using DFS
        for (int i = 0; i < adj.get(node).size(); i++) {
            if (adj.get(node).get(i) != parent) {
                printParents(adj.get(node).get(i), adj, node);
            }
        }
    }

    // function to print the children of each node
    public static void printChildren(int Root, Vector<Vector<Integer>> adj) {

        // Queue for the BFS
        Queue<Integer> q = new LinkedList<>();

        // pushing the root
        q.add(Root);

        // visit array to keep track of nodes that have been visited
        int[] vis = new int[adj.size()];

        Arrays.fill(vis, 0);

        // BFS
        while (q.size() != 0) {
            int node = q.peek();
            q.remove();
            vis[node] = 1;
            System.out.print(node + "-> ");

            for (int i = 0; i < adj.get(node).size(); i++) {
                if (vis[adj.get(node).get(i)] == 0) {
                    System.out.print(adj.get(node).get(i) + " ");
                    q.add(adj.get(node).get(i));
                }
            }
            System.out.println();
        }
    }

    // Function to print the leaf nodes
    public static void printLeafNodes(int Root, Vector<Vector<Integer>> adj) {
        // Leaf nodes have only one edge and are not the root
        for (int i = 1; i < adj.size(); i++) {
            if (adj.get(i).size() == 1 && i != Root) { // why did we put second condition????
                // because it is possible that the root has only one child, and then in this situation
                // it will print this root node as a leaf, but the root is not a leaf node!
                // in the Tree only the root node has no parent, thus its box may be size 1, if it has only one child
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to print the degrees of each node
    public static void printDegrees(int Root, Vector<Vector<Integer>> adj) {
        for (int i = 1; i < adj.size(); i++) {
            System.out.print(i + ": ");

            // Root has no parent, thus, its degree is
            // equal to the edges it is connected to
            if (i == Root)
                System.out.println(adj.get(i).size());
            else
                System.out.println(adj.get(i).size() - 1);
        }
    }

    public static void main(String[] args) {
        // number of nodes
        int N = 7;
        int Root = 1;

        // Adjacency list to store the tree
        Vector<Vector<Integer>> adj = new Vector<>();
        for (int i = 0; i < N + 1; i++) {
            adj.add(new Vector<>());
        }

        // Creating the tree
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(1).add(4);
        adj.get(4).add(1);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(2).add(6);
        adj.get(6).add(2);

        adj.get(4).add(7);
        adj.get(7).add(4);

        System.out.println(adj);


        // Printing the parents of each node
        System.out.println("The parents of each node are:");
        printParents(Root, adj, 0);

        // Printing the children of each node
        System.out.println("The children of each node are:");
        printChildren(Root, adj);

        // Printing all leaf nodes
        System.out.println("The leaf nodes of tree are:");
        printLeafNodes(1, adj);

        // Printing the degrees of each node
        System.out.println("The degrees of each node are:");
        printDegrees(Root, adj);
    }
}

// This code is contributed by rj13to.
// I found this code in https://www.geeksforgeeks.org/introduction-to-tree-data-structure-and-algorithm-tutorials/


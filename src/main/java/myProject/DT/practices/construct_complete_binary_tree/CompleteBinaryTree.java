package myProject.DT.practices.construct_complete_binary_tree;

import myProject.DT.data_structures.Tree;
import myProject.DT.data_structures.utilities.Trees;

import java.util.*;

public class CompleteBinaryTree {

    // [1,2,3,4,5,6]

    public static Tree createCompleteTree(int[] arr) {
        if (arr == null) return null;
        Deque<Tree> queue = new ArrayDeque<>();
        Tree root = null;
        for (int v : arr) {
            Tree node = queue.peek();
            if (node == null) {
                node = new Tree(v);
                root = node;
                queue.offer(node);
            }
            else if (node.left == null) node.left = new Tree(v);
            else {
                node.right = new Tree(v);
                queue.poll(); queue.offer(node.left); queue.offer(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Tree root = createCompleteTree(arr);
        System.out.println(Trees.toString(root));

        Trees.printLevelOrder(root);
    }
}

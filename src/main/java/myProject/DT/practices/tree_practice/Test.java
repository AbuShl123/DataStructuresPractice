package myProject.DT.practices.tree_practice;

import myProject.DT.data_structures.tree.Tree;
import myProject.DT.data_structures.utilities.Trees;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(2);

        tree.left.left = new Tree(3);
        tree.left.right = new Tree(4);

        tree.right.left = new Tree(5);
        tree.right.right = new Tree(6);


        System.out.println(Trees.toString(tree));
        // [1, 2, 2, 3, 4, 5, 6]

        System.out.println(
                Arrays.toString(Trees.getLeafNodes(tree))
        );

        System.out.println(Trees.toString(tree));
    }
}

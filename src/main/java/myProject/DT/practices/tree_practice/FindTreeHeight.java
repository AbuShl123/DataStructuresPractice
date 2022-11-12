package myProject.DT.practices.tree_practice;

import myProject.DT.data_structures.Tree;
import myProject.DT.data_structures.utilities.Trees;

public class FindTreeHeight {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(2);

        tree.left.left = new Tree(3);
        tree.left.right = new Tree(4);

        tree.right.right = new Tree(5);
        tree.right.right.right = new Tree(6);

        System.out.println(Trees.height(tree));

        Trees.printLevelOrder(tree);
    }
}

package myProject.DT.practices.tree_practice;

import myProject.DT.data_structures.Tree;

import java.util.List;

public class InorderTraversal {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println(printInorder(root));
    }

    static String printInorder(Tree root) {
        if (root == null) return "";

        return printInorder(root.left) + root.val + printInorder(root.right);
    }


    static List<Integer> inorderTraversal(Tree root) {
        return  null;
    }
}

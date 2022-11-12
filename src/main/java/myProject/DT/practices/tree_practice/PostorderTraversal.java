package myProject.DT.practices.tree_practice;

import myProject.DT.data_structures.Tree;
import myProject.DT.data_structures.utilities.Trees;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.left.left = new Tree(4);
        root.left.left.left = new Tree(6);
        root.left.left.right = new Tree(7);
        root.right = new Tree(3);
        root.right.left = new Tree(5);

        System.out.println(Trees.toString(root));

        System.out.println(postorderIterate(root));

        System.out.println(getPostorderTraversalValues(root));

        System.out.println(Trees.getPostorderValues(root, new ArrayList<>()));
    }

    public static String postorderIterate(Tree root) {
        if (root == null) return "";
        return postorderIterate(root.left) + postorderIterate(root.right) + root.val + " ";
    }

    private static final List<Integer> list = new ArrayList<>();
    public static List<Integer> getPostorderTraversalValues(Tree root) {
        if (root == null) return list;

        getPostorderTraversalValues(root.left);
        getPostorderTraversalValues(root.right);
        list.add(root.val);
        return list;
    }
}

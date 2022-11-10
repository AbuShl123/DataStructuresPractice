package myProject.DT.data_structures.utilities;

import myProject.DT.data_structures.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trees {
    public static String toString(Tree tree) {
        String b = "";
        if (tree == null) return "";
        if (tree.left != null) b += tree.left.val + ", ";
        if (tree.right != null) b += tree.right.val + ", ";

        return b + toString(tree.left) + toString(tree.right);
    }

    public static String printInPostorderTraversal(Tree root) {
        if (root == null) return "";
        return printInPostorderTraversal(root.left) +
                printInPostorderTraversal(root.right) +
                root.val + " ";
    }




    public static int[] getLeafNodes(Tree tree) {
        String leafNodes = getLeafNodesHelper(tree).strip();

        return Arrays.stream(leafNodes.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static String getLeafNodesHelper(Tree tree) {
        if (tree == null) return "";
        if (tree.left == null && tree.right == null) {
            return tree.val + " ";
        }
        return getLeafNodesHelper(tree.left) + getLeafNodesHelper(tree.right);
    }
}

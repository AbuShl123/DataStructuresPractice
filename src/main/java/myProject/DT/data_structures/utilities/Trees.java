package myProject.DT.data_structures.utilities;

import myProject.DT.data_structures.tree.Tree;
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

    public static String postorderIterate(Tree root) {
        if (root == null) return "";
        return postorderIterate(root.left) +
                postorderIterate(root.right) +
                root.val + " ";
    }

    public static List<Integer> getPostorderValues(Tree root, List<Integer> list) {
        if (root == null) return list;
        getPostorderValues(root.left, list);
        getPostorderValues(root.right, list);
        list.add(root.val);
        return list;
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

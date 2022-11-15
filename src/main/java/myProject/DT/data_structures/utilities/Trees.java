package myProject.DT.data_structures.utilities;

import myProject.DT.data_structures.Tree;
import java.util.Arrays;
import java.util.List;

public class Trees {

    public static int height(Tree root) {
        if (root == null) return 0;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if (lHeight > rHeight) return lHeight+1;
        else return rHeight+1;
    }

    public static void printLevelOrder(Tree root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            System.out.print(i + ": ");
            printCurrentLevel(root, i);
            System.out.println();
        }
    }

    public static void printCurrentLevel(Tree root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.val + " ");
        } else if (level > 1) {
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }

    public static String toString(Tree tree) {
        String b = "";
        if (tree == null) return "";
        if (tree.left != null) b += tree.left.val + ", ";
        if (tree.right != null) b += tree.right.val + ", ";

        return b + toString(tree.left) + toString(tree.right);
    }

    public static Integer[] toArray(Tree root) {
        int numberOfNodes = (int) (Math.pow(2, Trees.height(root))-1);
        Integer[] arr = new Integer[numberOfNodes];

        return null;
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

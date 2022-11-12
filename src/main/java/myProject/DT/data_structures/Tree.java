package myProject.DT.data_structures;

public class Tree {
    public int val;
    public Tree left;
    public Tree right;

    public Tree() {
    }

    public Tree (int val) {
        this.val = val;
    }

    public Tree (int val, Tree left, Tree right) {
        this(val);
        this.left = left;
        this.right = right;
    }
}


package myProject.DT.algorihtms.rescursion.pascals_triangle;

public class PascalTriangle {
    public int findNumber(int row, int column) {
        if (column == 1 || column == row) return 1;
        return findNumber(row-1, column-1)+findNumber(row-1, column);
    }

    public static void main(String[] args) {
        PascalTriangle triangle = new PascalTriangle();
        System.out.println(triangle.findNumber(6, 4));
    }
}

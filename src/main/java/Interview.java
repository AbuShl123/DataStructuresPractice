import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,2,5,4, 6, 7, 1, 10};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int[] sorted = new int[arr.length];
        for (int i = 0 ; i < arr.length; i++) {
            int smallest = Integer.MAX_VALUE;
            for (int v : list) {
                if (v < smallest) smallest = v;
            }
            list.remove((Integer) smallest);
            sorted[i] = smallest;
        }
        return sorted;
    }

}

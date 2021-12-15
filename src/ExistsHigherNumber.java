import java.util.Arrays;

public class ExistsHigherNumber {
    public static boolean existsHigher(int[] arr, int n) {
        if (arr.length == 0) return false;
        Arrays.sort(arr);
        if (arr[arr.length-1] >= n) return true;
        return false;
    }
}

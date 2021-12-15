public class EqualityThreeValues {
    public static int equal(int a, int b, int c) {
        int count = 0;
        if (a == b) count++;
        if (a == c) count++;
        if (count > 0) count++;
        return count;
    }
}

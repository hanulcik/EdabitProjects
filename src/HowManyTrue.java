public class HowManyTrue {
    public static int countTrue(boolean[] arr) {
        int trueCount = 0;
        for (boolean b : arr) if (b == true) trueCount++;
        return trueCount;
    }
}

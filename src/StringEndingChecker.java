public class StringEndingChecker {
    public static boolean checkEnding(String str1, String str2) {
        for (int one = str1.length()-1, two = str2.length()-1; two >= 0; one--, two--) if (str1.toCharArray()[one] != str2.toCharArray()[two]) return false;
        return true;
    }
}

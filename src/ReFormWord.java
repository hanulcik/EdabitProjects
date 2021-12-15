public class ReFormWord {
    public static String getWord(String left, String right) {
        StringBuilder sb = new StringBuilder();
        sb.append(left.toUpperCase().charAt(0));
        sb.append(left.substring(1));
        sb.append(right);
        return sb.toString();
    }
}

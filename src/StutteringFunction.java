public class StutteringFunction {
    public static String stutter(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        sb.append(word.charAt(1));
        sb.append("... ");
        sb.append(sb);
        sb.append(word);
        sb.append("?");
        return sb.toString();
    }
}

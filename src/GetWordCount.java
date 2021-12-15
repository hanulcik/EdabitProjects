import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetWordCount {
    public static int countWords(String s) {
        Pattern pattern = Pattern.compile("[\\w]+");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }
}

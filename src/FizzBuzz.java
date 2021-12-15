public class FizzBuzz {
    public static String fizzBuzz(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 3 == 0) sb.append("Fizz");
        if (n % 5 == 0) sb.append("Buzz");
        if (sb.isEmpty()) sb.append(n);
        return sb.toString();

    }
}

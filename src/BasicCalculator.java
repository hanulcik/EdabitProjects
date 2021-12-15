public class BasicCalculator {
    public static int calculator(int num1, char operator, int num2) {
        if (operator == '+') return num1 + num2;
        if (operator == '-') return num1 - num2;
        if (operator == '*') return num1 * num2;
        if (operator == '/') {
            if (num2 == 0) return 0;
            return num1 / num2;
        }
        return 0;
    }
}

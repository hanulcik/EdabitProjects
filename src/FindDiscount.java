public class FindDiscount {
    public static double discount(int price, int percentage) {
        return price * (1 - (percentage * .01));
    }
}
